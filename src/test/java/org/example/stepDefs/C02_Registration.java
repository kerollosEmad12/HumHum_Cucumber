package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_HomePage;
import org.example.pages.P02_RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import static org.junit.Assert.*;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;
public class C02_Registration {
    public static String globalEmail;
    P01_HomePage home = new P01_HomePage();
    P02_RegisterPage register = new P02_RegisterPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("user navigate to home page")

    public void step1 () throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("user click on login icon")
    public void step2() throws InterruptedException
    {
        Thread.sleep(Duration.ofSeconds(3));
        js.executeScript("arguments[0].click();", home.popup);

        //Open login icon
        js.executeScript("arguments[0].click();", home.registerTab);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user click on create account button")
    public void step3() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        js.executeScript("arguments[0].click();", register.create);

    }

    @When("user select title {string}")
    public void step4(String Mr)
    {
        WebElement titleList = driver.findElement(By.cssSelector("div[class=\"col-lg-2\"] select"));
        Select select = new Select(titleList);
        select.selectByValue(Mr);
    }

    @And("user write invalid {string} and valid {string}")
    public void step5(String first_name, String last_name) throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(7));
        //Input the first name
        register.firstName.sendKeys(first_name);
        Thread.sleep(Duration.ofSeconds(7));
        //Input the last_name
        register.lastName.sendKeys(last_name);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User enter valid email")
    public void step6() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        register.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User enter valid {string} and {string}")
    public void step7(String password, String confirm_password)
    {
        //Input the password
        register.pass.sendKeys(password);
        //Input the Confirmation password
        register.ConfirmPass.sendKeys(confirm_password);
    }

    @When("Select user country code {string}")
    public void step8(String EG)
    {
        WebElement country = driver.findElement(By.cssSelector("div[class=\"col-lg-3 col-4\"] select"));
        Select select = new Select(country);
        select.selectByValue(EG);
    }

    @And("User enter valid number")
    public void step9() throws InterruptedException {
        Faker faker = new Faker();
        String phoneNumber = faker.numerify("010########");
        register.phone.sendKeys(phoneNumber);
        Thread.sleep(Duration.ofSeconds(1));
        register.phone.sendKeys(phoneNumber);
    }

    @And("Mark on Subscribe to the Newsletter checkbox")
    public void step10()
    {
        js.executeScript("arguments[0].click();", register.box);
    }

    @Then("New account is created successfully \"([^\"]*)\"$")
    public void step11(String result)
    {
        js.executeScript("arguments[0].click();", register.submit);

        //1- message content or equal "First name is mandatory
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"col-lg-5\"] fieldset[class=\"form-group\"] div[class=\"error\"]")).getText();
        soft.assertTrue(actualMsg.contains("First name is mandatory"),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"First name is mandatory"
        );

        if ("failure".equals(result)){
            assertTrue(driver.findElement(By.cssSelector("div[class=\"col-lg-5\"] fieldset[class=\"form-group\"] div[class=\"error\"]")).isDisplayed());
        }

        else {
            assertTrue(driver.findElement(By.cssSelector("div>button[type=\"submit\"]")).isDisplayed());
        }

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"col-lg-5\"] fieldset[class=\"form-group\"] div[class=\"error\"]")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#ef4923");

        soft.assertAll();
    }

    @And("user should enter valid first name {string} and valid last name {string}")
    public void step12(String first_name, String last_name) throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        //Input the first name
        register.firstName.sendKeys(first_name);
        Thread.sleep(Duration.ofSeconds(5));
        //Input the last_name
        register.lastName.sendKeys(last_name);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User should enter invalid email {string}")
    public void step12(String email) {
        register.email.sendKeys(email);
    }

    @And("Register should be possible if user enter valid password {string} and valid confirm password {string}")
    public void step13(String password, String confirm_password) {
        //Input the password
        register.pass.sendKeys(password);
        //Input the Confirmation password
        register.ConfirmPass.sendKeys(confirm_password);
    }

    @When("Register should be possible if user Select valid country code {string}")
    public void step14(String EG) {
        WebElement country = driver.findElement(By.cssSelector("div[class=\"col-lg-3 col-4\"] select"));
        Select select = new Select(country);
        select.selectByValue(EG);
    }

    @And("Register should be possible if user enter valid number")
    public void step15() throws InterruptedException {
        Faker faker = new Faker();
        String phoneNumber = faker.numerify("010########");
        register.phone.sendKeys(phoneNumber);
        Thread.sleep(Duration.ofSeconds(1));
        register.phone.sendKeys(phoneNumber);
    }

    @And("Register should be possible if user Mark on Subscribe to the Newsletter checkbox")
    public void step16() {
        js.executeScript("arguments[0].click();", register.box);
    }

    @Then("Register should be possible if user created new account successfully {string}")
    public void step17(String result) {
        js.executeScript("arguments[0].click();", register.submit);

        //1- message content or equal "the email is mandatory."
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"col-lg-12\"] fieldset div[class=\"error\"]")).getText();
        soft.assertTrue(actualMsg.contains("the email is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"the email is mandatory."
        );

        if ("failure".equals(result)){
            assertTrue(driver.findElement(By.cssSelector("div[class=\"col-lg-12\"] fieldset div[class=\"error\"]")).isDisplayed());
        }

        else {
            assertTrue(driver.findElement(By.cssSelector("div>button[type=\"submit\"]")).isDisplayed());
        }

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"col-lg-12\"] fieldset div[class=\"error\"]")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#ef4923");

        soft.assertAll();
    }

    @And("user could enter valid first name {string} and valid last name {string}")
    public void step18(String first_name, String last_name) throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        //Input the first name
        register.firstName.sendKeys(first_name);
        Thread.sleep(Duration.ofSeconds(5));
        //Input the last_name
        register.lastName.sendKeys(last_name);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User could enter valid email")
    public void step19() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        register.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could enter invalid password {string} and valid confirm password {string}")
    public void step20(String password, String confirm_password) {
        //Input the password
        register.pass.sendKeys(password);
        //Input the Confirmation password
        register.ConfirmPass.sendKeys(confirm_password);
    }

    @When("user could Select valid country code {string}")
    public void step21(String EG) {
        WebElement country = driver.findElement(By.cssSelector("div[class=\"col-lg-3 col-4\"] select"));
        Select select = new Select(country);
        select.selectByValue(EG);
    }

    @And("user could enter valid number")
    public void step22() throws InterruptedException {
        Faker faker = new Faker();
        String phoneNumber = faker.numerify("010########");
        register.phone.sendKeys(phoneNumber);
        Thread.sleep(Duration.ofSeconds(1));
        register.phone.sendKeys(phoneNumber);
    }

    @And("user could Mark on Subscribe to the Newsletter checkbox")
    public void step23() {
        js.executeScript("arguments[0].click();", register.box);
    }

    @Then("user could created new account successfully {string}")
    public void step24(String result) {
        js.executeScript("arguments[0].click();", register.submit);

        //1- message content or equal "the password is mandatory."
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"col-lg-6\"] fieldset div[class=\"error\"]")).getText();
        soft.assertTrue(actualMsg.contains("The password must be at least 8 characters.\n" +
                        "At least contains one char (Upper Case, Lower Case, Special Char, and Number)"),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The password must be at least 8 characters.\n" +
                        "At least contains one char (Upper Case, Lower Case, Special Char, and Number)."
        );

        if ("failure".equals(result)){
            assertTrue(driver.findElement(By.cssSelector("div[class=\"col-lg-6\"] fieldset div[class=\"error\"]")).isDisplayed());
        }

        else {
            assertTrue(driver.findElement(By.cssSelector("div>button[type=\"submit\"]")).isDisplayed());
        }

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"col-lg-6\"] fieldset div[class=\"error\"]")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#ef4923");

        soft.assertAll();
    }

    @And("user could input valid first name {string} and valid last name {string}")
    public void step25(String first_name, String last_name) throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        //Input the first name
        register.firstName.sendKeys(first_name);
        Thread.sleep(Duration.ofSeconds(5));
        //Input the last_name
        register.lastName.sendKeys(last_name);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User could input valid email")
    public void step26() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        register.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could input valid password {string} and invalid confirm password {string}")
    public void step27(String password, String confirm_password) {
        //Input the password
        register.pass.sendKeys(password);
        //Input the Confirmation password
        register.ConfirmPass.sendKeys(confirm_password);
    }

    @When("user could choose valid country code {string}")
    public void step28(String EG) {
        WebElement country = driver.findElement(By.cssSelector("div[class=\"col-lg-3 col-4\"] select"));
        Select select = new Select(country);
        select.selectByValue(EG);
    }

    @And("user could input valid number {string}")
    public void step29(String phone_number) {
        register.phone.sendKeys(phone_number);
    }

    @And("user could click on Mark on Subscribe to the Newsletter checkbox")
    public void step30() {
        js.executeScript("arguments[0].click();", register.box);
    }

    @Then("user could created new account submitted {string}")
    public void step31(String result) {
        js.executeScript("arguments[0].click();", register.submit);

        //1- message content or equal "First name is mandatory
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"col-lg-9 col-8\"] fieldset div[class=\"error\"]")).getText();
        soft.assertTrue(actualMsg.contains("the mobile number is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"the mobile number is mandatory."
        );

        if ("success".equals(result)){
            assertTrue(driver.findElement(By.cssSelector("div[class=\"col-lg-9 col-8\"] fieldset div[class=\"error\"]")).isDisplayed());
        }

        else {
            assertTrue(driver.findElement(By.cssSelector("div>button[type=\"submit\"]")).isDisplayed());
        }

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"col-lg-9 col-8\"] fieldset div[class=\"error\"]")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#ef4923");

        soft.assertAll();
    }
}
