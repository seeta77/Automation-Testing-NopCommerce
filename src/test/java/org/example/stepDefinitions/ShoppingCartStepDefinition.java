package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ShoppingCartStepDefinition {


    int number;

    @When("user add product to shopping cart")
    public void ShoppingCartClick(){
        //click on third element to add it to shopping cart
        Hooks.homePage.addToCartButtons().get(2).click();
    }

    @Then("shopping cart notification success is visible")
    public void successNotification(){
        Assert.assertTrue(Hooks.homePage.successNotificationBar().isDisplayed());
    }


    @And("user get the number of the shopping cart items after adding product")
    public void ShoppingCartItems(){

        String text = Hooks.homePage.shoppingCartTapToClick().getText(); //output shall be (1)
        text = text.replaceAll("[^0-9]",""); //out will be 1 but still considered as string
        number = Integer.parseInt(text); //convert string 1 to int 1
    }

    @Then("number of shopping cart items increased")
    public void itemsIncrease(){
        Assert.assertTrue(number > 0);
    }

    @And("user go to shopping cart page")
    public void goToShoppingCartPage(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        WebElement shoppingCartTab = Hooks.homePage.shoppingCartTapToClick();

        wait.until(ExpectedConditions.invisibilityOf(Hooks.homePage.successNotificationBar()));
        shoppingCartTab.click();
    }
}
