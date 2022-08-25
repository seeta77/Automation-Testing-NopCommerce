package org.example.stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class HoverCategoriesStepDefinition {
    String subCategoryName;

    @When("user hover category and select subcategory")
    public void userHoverCategory() throws InterruptedException {

        Actions action = new Actions(Hooks.driver);
        // hover on "Electronics "
        WebElement electronics = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/electronics\"]"));
        action.moveToElement(electronics).perform();
        Thread.sleep(1000);

        // getText() of subCategory before click on it
        WebElement cameraPhoto = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/camera-photo\"]"));

        // this will change "Camera & Photo  " to "camera & photo"
        subCategoryName = cameraPhoto.getText().toLowerCase().trim();

        System.out.println(subCategoryName);

        // click on "Camera & Photo"
        cameraPhoto.click();
        Thread.sleep(2000);

    }

    @Then("open sub-category page")
    public void subCategoryPage() throws InterruptedException{
        SoftAssert soft = new SoftAssert();
        Thread.sleep(3000);
        String loginPageUrl = Hooks.driver.getCurrentUrl();
        soft.assertTrue(loginPageUrl.contains("https://demo.nopcommerce.com/camera-photo"));
    }

}
