package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage {

    public WebElement searchKeywordField(){
        return Hooks.driver.findElement(By.id("q"));
    }

    public WebElement searchButton(){
        return Hooks.driver.findElement(By.xpath("// button[@class=\"button-1 search-button\"]"));
    }

}
