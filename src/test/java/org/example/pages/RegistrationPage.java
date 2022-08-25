package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

        public WebElement gender(){
            return driver.findElement(By.id("gender-female"));
        }
        public WebElement firstName(){
            return driver.findElement(By.id("FirstName"));
        }

        public WebElement lastName(){
            return driver.findElement(By.id("LastName"));
        }

        public void dayOfBirth(){
            WebElement selectElement = driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
            Select s = new Select(selectElement);
            s.selectByIndex(11);
        }

        public void monthOfBirth(){
            WebElement selectElement = driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
            Select s = new Select(selectElement);
            s.selectByIndex(11);
        }

        public void yearOfBirth(){
            WebElement selectElement = driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
            Select s = new Select(selectElement);
            s.selectByValue("1996");
        }

        public WebElement email(){
            return driver.findElement(By.id("Email"));
        }

        public WebElement companyName(){
            return driver.findElement(By.id("Company"));
        }

        public WebElement password(){
            return driver.findElement(By.id("Password"));
        }
        public WebElement confirmPassword(){
            return driver.findElement(By.id("ConfirmPassword"));
        }

        public WebElement registerButton(){
            return driver.findElement(By.id("register-button"));
        }



}

