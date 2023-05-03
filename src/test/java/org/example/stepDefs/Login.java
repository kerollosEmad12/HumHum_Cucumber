package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class Login {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("User Navigate to home page")
    public void Step1 ()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("User click on login icon")
    public void Step2() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        WebElement popup1 = driver.findElement(By.className("mfp-close"));
        if (popup1.isDisplayed())
        {
            popup1.click();
        }
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        driver.findElement(By.cssSelector("div[role=\"button\"]>svg")).click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("Keep email is an empty")
    public void Step3() throws InterruptedException {
        WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        js.executeScript("arguments[0].value='';", email);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter valid password")
    public void Step4()
    {
        WebElement pass = driver.findElement(By.cssSelector("input[type=\"password\"]"));
        pass.sendKeys("Asd12312");
    }

    @Then("Login is successfully")
    public void Step5()
    {
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @Given("User Navigate To home page")
    public void Step6()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("User Click on login icon")
    public void Step7() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        WebElement popup1 = driver.findElement(By.className("mfp-close"));
        if (popup1.isDisplayed())
        {
            popup1.click();
        }
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        driver.findElement(By.cssSelector("div[role=\"button\"]>svg")).click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter email invalid format")
    public void Step8() throws InterruptedException {
        WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        js.executeScript("arguments[0].value='kerolos-gmail.com';", email);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("User enter valid password")
    public void Step9()
    {
        WebElement pass = driver.findElement(By.cssSelector("input[type=\"password\"]"));
        pass.sendKeys("Asd12312");
    }

    @Then("login is successfully")
    public void Step10()
    {
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }
}
