package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_HomePage;
import org.example.pages.P03_LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;
import static org.junit.Assert.*;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class Login {

    JavascriptExecutor js = (JavascriptExecutor) driver;
    P01_HomePage home = new P01_HomePage();
    P03_LoginPage login = new P03_LoginPage();

    @Given("User Navigate to home page")
    public void Step1 ()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("User click on login icon")
    public void Step2() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        js.executeScript("arguments[0].click();", home.popup);
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        js.executeScript("arguments[0].click();", home.registerTab);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter invalid {string} and valid {string}")
    public void Step3(String Email, String password) throws InterruptedException {
        login.email.sendKeys(Email);
        Thread.sleep(Duration.ofSeconds(3));
        login.pass.sendKeys(password);
    }

    @Then("The login \"([^\"]*)\" is displayed$")
    public void Step4(String result)
    {
        js.executeScript("arguments[0].click();", login.Btn);

        if ("failure".equals(result)) {
            assertTrue(driver.findElement(By.xpath("//div/div[@class=\"error text-start\"]")).isDisplayed());
        }

        if ("error".equals(result))
        {
            assertTrue(driver.findElement(By.id("swal2-title")).isDisplayed());
        }
    }

    @Given("User  Navigate to home page")
    public void Step5() {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("User  click on login icon")
    public void Step6() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        js.executeScript("arguments[0].click();", home.popup);
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        js.executeScript("arguments[0].click();", home.registerTab);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user  enter valid {string} and invalid {string}")
    public void Step7(String Email, String password) throws InterruptedException {
        login.email.sendKeys(Email);
        Thread.sleep(Duration.ofSeconds(3));
        login.pass.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("The login \"([^\"]*)\" is displayed$")
    public void Step8(String result) {
        js.executeScript("arguments[0].click();", login.Btn);

        if ("failure".equals(result)) {
            assertTrue(driver.findElement(By.xpath("//div/div[@class=\"error text-start\"]")).isDisplayed());
        }

        if ("error".equals(result))
        {
            assertTrue(driver.findElement(By.id("swal2-title")).isDisplayed());
        }

    }
}
