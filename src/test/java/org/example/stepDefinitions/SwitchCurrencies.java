package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class SwitchCurrencies {

    @Given("user is in home page")
    public void homePage() throws InterruptedException{
        SoftAssert soft = new SoftAssert();
        Thread.sleep(3000);
        String homePageUrl = Hooks.driver.getCurrentUrl();
        soft.assertTrue(homePageUrl.contains("https://demo.nopcommerce.com/"));
    }


    @Then("user can click on drop down list and select the currency")
    public void selectCurrency(){
        Hooks.homePage.switchCurrencies();
    }
}
