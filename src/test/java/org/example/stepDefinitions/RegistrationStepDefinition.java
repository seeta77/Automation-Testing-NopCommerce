package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class RegistrationStepDefinition {


    @Given("user click on register tab")
    public void clickOnRegisterTab(){
        Hooks.homePage.registerTab().click();
    }

    @And("navigates to registration page")
    public void registrationPage(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    @When("user use valid data in registration")
    public void fillRegistrationData() throws InterruptedException{
        Hooks.register.gender().click();
        Hooks.register.firstName().sendKeys("Riham");
        Hooks.register.lastName().sendKeys("Mohamed");
        Hooks.register.dayOfBirth();
        Hooks.register.monthOfBirth();
        Hooks.register.yearOfBirth();
        Hooks.register.email().sendKeys("test4@gmail.com");
        Hooks.register.companyName().sendKeys("Uranium");
        Hooks.register.password().sendKeys("P@ssw0rd");
        Hooks.register.confirmPassword().sendKeys("P@ssw0rd");
        Thread.sleep(3000);
    }

    @And("click on register button")
    public void clickOnRegisterButton(){
        Hooks.register.registerButton().click();
    }

    @Then("user redirected to confirmation page")
    public void confirmationPage(){
        SoftAssert soft = new SoftAssert();
        String confirmationPageUrl = Hooks.driver.getCurrentUrl();
        soft.assertTrue(confirmationPageUrl.contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
    }

    @And("user registered successfully")
    public void successfullyRegister() throws InterruptedException{
        SoftAssert soft = new SoftAssert();
        String expectedResult = "Your registration completed";
        String messageExpectedColor = "a(76, 177, 124, 1)";
        Thread.sleep(3000);
        String actualResult = Hooks.driver.findElement(By.xpath("// div[@class=\"result\"]")).getText();
        String messageActualColor = Hooks.driver.findElement(By.xpath("// div[@class=\"result\"]")).getCssValue("color");
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertTrue(messageActualColor.contains(messageExpectedColor));
        soft.assertAll();
    }

}
