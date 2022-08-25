package org.example.stepDefinitions;
import java.util.ArrayList;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FollowUsStepDefinition {


    @When("user opens facebook link")
    public void facebookClick(){
        Hooks.homePage.facebookIcon().click();
    }

    @Then("nopCommerce facebook url shall be opened in new tab")
    public void facebookWindowHandler() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
        Hooks.driver.quit();
    }

    @When("user opens twitter link")
    public void twitterClick(){
        Hooks.homePage.twitterIcon().click();
    }

    @Then("nopCommerce twitter url shall be opened in new tab")
    public void twitterWindowHandler() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://twitter.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
        Hooks.driver.quit();
    }

    @When("user opens rss link")
    public void rssClick(){
        Hooks.homePage.rssIcon().click();
    }

    @Then("nopCommerce rss url shall be opened in new tab")
    public void rssWindowHandler() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
        Hooks.driver.quit();
    }

    @When("user opens youtube link")
    public void Click(){
        Hooks.homePage.youtubeIcon().click();
    }

    @Then("nopCommerce youtube url shall be opened in new tab")
    public void youtubeWindowHandler() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
        Hooks.driver.quit();
    }




}
