package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement registerTab(){
            return driver.findElement(By.xpath("// a[@class=\"ico-register\"]"));
    }

    public WebElement loginTab(){
        return driver.findElement(By.xpath(" // a[@class=\"ico-login\"]"));
    }

    public void switchCurrencies(){
        WebElement selectElement = driver.findElement(By.xpath("// select[@id=\"customerCurrency\"]"));
        Select s = new Select(selectElement);
        s.selectByVisibleText("Euro");
    }

    public WebElement search(){
        return driver.findElement(By.xpath("// a[@href=\"/search\"]"));
    }

    public WebElement homeSlider(String SliderNumber){
        return Hooks.driver.findElement(By.xpath("(// a[@href=\"http://demo.nopcommerce.com/\"])["+SliderNumber+"]"));
    }

//    public WebElement secondSlider(){
//        return Hooks.driver.findElement(By.xpath("(// a[@href=\"http://demo.nopcommerce.com/\"])[2]"));
//    }

    public WebElement facebookIcon(){
        return Hooks.driver.findElement(By.xpath("// li[@class=\"facebook\"]"));
    }

    public WebElement twitterIcon(){
        return Hooks.driver.findElement(By.xpath("// li[@class=\"twitter\"]"));
    }

    public WebElement rssIcon(){
        return Hooks.driver.findElement(By.xpath("// li[@class=\"rss\"]"));
    }

    public WebElement youtubeIcon(){
        return Hooks.driver.findElement(By.xpath("// li[@class=\"youtube\"]"));
    }

    public List<WebElement> wishlistIcons(){
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement successNotificationBar(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement wishlistTap(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]"));
    }

    public WebElement wishlistTapToClick(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"header-links-wrapper\"] a[href=\"/wishlist\"]"));
    }

    public List<WebElement> addToCartButtons(){
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]"));
    }

    public WebElement shoppingCartTapToClick(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"header-links-wrapper\"] a[href=\"/cart\"]"));
    }






}
