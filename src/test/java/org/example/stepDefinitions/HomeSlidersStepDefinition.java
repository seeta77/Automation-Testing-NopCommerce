package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeSlidersStepDefinition {

    @When("user clicks on first slider")
    public void clickFirstSlider(){
       Hooks.homePage.homeSlider("1").click();
    }

    @Then("first slider's relative product page shall be displayed")
    public void firstSliderIsDisplayed() throws InterruptedException{
       Thread.sleep(2000);
       Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @When("user clicks on second slider")
    public void clickSecondSlider(){
        Hooks.homePage.homeSlider("2").click();
    }

    @Then("second slider's relative product page shall be displayed")
    public void secondSliderIsDisplayed() throws InterruptedException{
        Thread.sleep(2000);
       Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
    }


}
