package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement email(){

        return driver.findElement(By.id("Email"));
    }

    public WebElement password(){

        return driver.findElement(By.id("Password"));
    }

    public WebElement loginButton(){
            return driver.findElement(By.xpath("// button[@class=\"button-1 login-button\"]"));
    }

    public WebElement myAccountTab(){
        return driver.findElement(By.xpath("// a[@class=\"ico-account\"]"));
    }



    public void loginSteps(String email, String password){
        email().clear();
        email().sendKeys(email);
        password().clear();
        password().sendKeys(password);
    }
}
