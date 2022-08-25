package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.RegistrationPage;

import java.util.concurrent.TimeUnit;

public class Hooks {

    //define before and after annotations for driver
    public static WebDriver driver = null;
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static RegistrationPage register;

    @Before
    public static void openBrowser(){
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        register = new RegistrationPage(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public static void quitDriver(){
        driver.quit();
    }


}
