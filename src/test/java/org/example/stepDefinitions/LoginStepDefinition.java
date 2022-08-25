package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class LoginStepDefinition {

    @Given("user click on login tab")
    public void clickOnLoginTab(){
        Hooks.homePage.loginTab().click();
    }

    @And("navigates to login page")
    public void loginPage() throws InterruptedException{

        SoftAssert soft = new SoftAssert();
        Thread.sleep(3000);
        String loginPageUrl = Hooks.driver.getCurrentUrl();
        soft.assertTrue(loginPageUrl.contains("https://demo.nopcommerce.com/login?returnUrl=%2F"));
    }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void fillLoginData(String email, String password){
        Hooks.loginPage.loginSteps(email,password);
    }


    @And("user click on login button")
    public void clickOnRegisterButton(){
            Hooks.loginPage.loginButton().click();
    }

    @Then("user could login successfully by going to home page and “My account” tab isDisplayed")
    public void confirmationPage() throws InterruptedException{
        SoftAssert soft = new SoftAssert();
        Thread.sleep(3000);
        String confirmationPageUrl = Hooks.driver.getCurrentUrl();
        soft.assertEquals(confirmationPageUrl,"https://demo.nopcommerce.com/");
        soft.assertEquals(Hooks.loginPage.myAccountTab().isDisplayed(),true);
        soft.assertAll();
    }








}
