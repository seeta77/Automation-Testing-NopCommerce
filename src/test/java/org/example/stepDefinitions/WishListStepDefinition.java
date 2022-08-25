package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class WishListStepDefinition {

    int number;

    @When("user add product to wishlist")
    public void wishlistClick(){
       //click on third element to add it to wishlist
       Hooks.homePage.wishlistIcons().get(2).click();
    }

    @Then("wishlist notification success is visible")
    public void successNotification(){
        Assert.assertTrue(Hooks.homePage.successNotificationBar().isDisplayed());
    }


    @And("user get the number of the wishlist items after adding product")
    public void wishlistItems(){

        String text = Hooks.homePage.wishlistTap().getText(); //output shall be (1)
        text = text.replaceAll("[^0-9]",""); //out will be 1 but still considered as string
        number = Integer.parseInt(text); //convert string 1 to int 1
    }

    @Then("number of wishlist items increased")
    public void itemsIncrease(){
        Assert.assertTrue(number > 0);
    }

    @And("user go to wishlist page")
    public void goToWishlistPage(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
        WebElement wishlistTab = Hooks.homePage.wishlistTapToClick();

        wait.until(ExpectedConditions.invisibilityOf(Hooks.homePage.successNotificationBar()));
        wishlistTab.click();
    }
}
