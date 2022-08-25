package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import org.example.pages.SearchPage;

public class SearchStepDefinition {
    SoftAssert soft = new SoftAssert();
    SearchPage search = new SearchPage();

    @Given("user in home page")
    public void homePage() throws InterruptedException{
        Thread.sleep(3000);
        String homePageUrl = Hooks.driver.getCurrentUrl();
        soft.assertTrue(homePageUrl.contains("https://demo.nopcommerce.com/"));
    }

    @And("click on search field link")
    public void clickOnSearchLink(){
        Hooks.homePage.search().click();
    }

    @When("user redirected to search page")
    public void searchPage(){
        String searchPageUrl = Hooks.driver.getCurrentUrl();
        soft.assertTrue(searchPageUrl.contains("https://demo.nopcommerce.com/search?q="));
    }

    @And("^user type the search keyword \"(.*)\" and click on search button$")
    public void searchAndClickSearchButton(String keyWord){
        search.searchKeywordField().sendKeys(keyWord);
        search.searchButton().click();
    }

    @Then("results size is more than zero")
    public void searchResult() throws InterruptedException{
        Thread.sleep(3000);
        int resultsSize = Hooks.driver.findElements(By.xpath("// div[@class=\"product-item\"]")).size();
        soft.assertTrue(resultsSize > 0);
    }

    public void assertA(){
        soft.assertAll();
    }
}
