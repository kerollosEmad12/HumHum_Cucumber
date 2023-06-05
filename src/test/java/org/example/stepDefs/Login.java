package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_HomePage;
import org.example.pages.P03_LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

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

    @And("Keep email is an empty")
    public void Step3() throws InterruptedException {
        js.executeScript("arguments[0].value='';", login.email);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter valid password")
    public void Step4()
    {
        login.pass.sendKeys("Asd12312");
    }

    @Then("Login is successfully")
    public void Step5()
    {
        js.executeScript("arguments[0].click();", login.Btn);

        //1- message content or equal "the email is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.xpath("//div[@class=\"error text-start\"]")).getText();
        soft.assertTrue(actualMsg.contains("the email is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"the email is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.xpath("//div[@class=\"error text-start\"]")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#ef4923");

        soft.assertAll();
    }

    @Given("User Navigate To home page")
    public void Step6()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("User Click on login icon")
    public void Step7() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        js.executeScript("arguments[0].click();", home.popup);
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        js.executeScript("arguments[0].click();", home.registerTab);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter email invalid format")
    public void Step8() throws InterruptedException {
        js.executeScript("arguments[0].value='kerolos-gmail.com';", login.email);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("User enter valid password")
    public void Step9()
    {
        login.pass.sendKeys("Asd12312");
    }

    @Then("login is successfully")
    public void Step10()
    {
        js.executeScript("arguments[0].click();", login.Btn);
    }

    @Given("User Navigate To Home page")
    public void Step11()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("User Click On login icon")
    public void Step12() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        js.executeScript("arguments[0].click();", home.popup);
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        js.executeScript("arguments[0].click();", home.registerTab);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter email not registered")
    public void Step13() throws InterruptedException {
        js.executeScript("arguments[0].value='Ahmed@gmail.com';", login.email);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("User Enter valid password")
    public void Step14()
    {
        login.pass.sendKeys("Asd12312");
    }

    @Then("login Is successfully")
    public void Step15()
    {
        js.executeScript("arguments[0].click();", login.Btn);
    }

    @Given("User Navigate To Home Page")
    public void Step16()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("User Click On Login icon")
    public void Step17() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        js.executeScript("arguments[0].click();", home.popup);
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        js.executeScript("arguments[0].click();", home.registerTab);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User Enter Valid email")
    public void Step18() throws InterruptedException {
        login.email.sendKeys("kerolos@gmail.com");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("Keep password is an empty")
    public void Step19()
    {
        login.pass.sendKeys("");
    }

    @Then("Login Is successfully")
    public void Step20()
    {
        js.executeScript("arguments[0].click();", login.Btn);

        //1- message content or equal "the email is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.xpath("//div/div[@class=\"error text-start\"]")).getText();
        soft.assertTrue(actualMsg.contains("the password is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"the password is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.xpath("//div/div[@class=\"error text-start\"]")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#ef4923");
    }

    @Given("User  Navigate To Home Page")
    public void Step21() {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("User  Click On Login icon")
    public void Step22() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        js.executeScript("arguments[0].click();", home.popup);
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        js.executeScript("arguments[0].click();", home.registerTab);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User  Enter Valid email")
    public void Step23() throws InterruptedException {
        login.email.sendKeys("kerolos@gmail.com");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter invalid password")
    public void Step24() {
        login.pass.sendKeys("12354aa");
    }

    @Then("Login  Is successfully")
    public void Step25() {
        js.executeScript("arguments[0].click();", login.Btn);

        //1- message content or equal "the email is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.id("swal2-title")).getText();
        soft.assertTrue(actualMsg.contains("Invalid Email or Password"),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"Invalid Email or Password"
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.id("swal2-title")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#040303");
    }
}
