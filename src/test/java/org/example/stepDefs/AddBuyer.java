package org.example.stepDefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P13_AddBuyerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import static org.junit.Assert.*;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;
public class AddBuyer {

    public static String globalEmail;
    P13_AddBuyerPage buyer = new P13_AddBuyerPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;


    @Given("user could go to admin page")
    public void step1 ()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-admin/dashboard");
    }

    @And("user input  Email {string}")
    public void step2(String email) throws InterruptedException {
        buyer.Mail.sendKeys(email);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user input  password {string}")
    public void step3(String password) throws InterruptedException {
        buyer.Pass.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user press on login")
    public void step4() throws InterruptedException {
        js.executeScript("arguments[0].click();", buyer.sub);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @When("user press on my supply")
    public void step5() throws InterruptedException {
        js.executeScript("arguments[0].click();", buyer.head);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user click on buyer Btn")
    public void step6() throws InterruptedException {
        js.executeScript("arguments[0].click();", buyer.buyer);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user click on add buyer Btn")
    public void step7() throws InterruptedException {
        js.executeScript("arguments[0].click();", buyer.b2b);
        Thread.sleep(Duration.ofSeconds(3));

        js.executeScript("arguments[0].click();", buyer.ADD);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter the first name {string} and last name {string}")
    public void step8(String first_name, String last_name) throws InterruptedException {
        buyer.first.sendKeys(first_name);
        Thread.sleep(Duration.ofSeconds(3));

        buyer.last.sendKeys(last_name);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter valid email")
    public void step9() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        buyer.E.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter EN company name {string} and AR company name {string}")
    public void step10(String EN, String AR) throws InterruptedException {
        buyer.name_En.sendKeys(EN);
        Thread.sleep(Duration.ofSeconds(3));

        buyer.name_AR.sendKeys(AR);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter the job title {string}")
    public void step11(String title) throws InterruptedException {
        buyer.job.sendKeys(title);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter the mobile number")
    public void step12() throws InterruptedException {
        Faker faker = new Faker();
        String phoneNumber = faker.numerify("010########");
        buyer.num.sendKeys(phoneNumber);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter password {string} and confirm password {string}")
    public void step13(String password, String confirm_password) throws InterruptedException {
        buyer.Password.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(3));

        buyer.conPass.sendKeys(confirm_password);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("The create new buyer is successfully")
    public void step14() {
        buyer.save.click();
    }

    @And("user could enter the first name {string} and last name {string}")
    public void step15(String first_name, String last_name) throws InterruptedException {
        buyer.first.sendKeys(first_name);
        Thread.sleep(Duration.ofSeconds(3));

        buyer.last.sendKeys(last_name);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could enter valid email {string}")
    public void step16(String email) throws InterruptedException {
        buyer.E.sendKeys(email);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could enter EN company name {string} and AR company name {string}")
    public void step17(String EN, String AR) throws InterruptedException {
        buyer.name_En.sendKeys(EN);
        Thread.sleep(Duration.ofSeconds(3));

        buyer.name_AR.sendKeys(AR);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could enter the job title {string}")
    public void step18(String title) throws InterruptedException {
        buyer.job.sendKeys(title);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could enter the mobile number")
    public void step19() throws InterruptedException {
        Faker faker = new Faker();
        String phoneNumber = faker.numerify("010########");
        buyer.num.sendKeys(phoneNumber);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could enter password {string} and confirm password {string}")
    public void step20(String password, String confirm_password) throws InterruptedException {
        buyer.Password.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(3));

        buyer.conPass.sendKeys(confirm_password);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("user could The create new buyer is successfully {string}")
    public void step21(String result) {
        buyer.save.click();

        //1- message content or equal "Please enter an Email"
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"col-12 form-group\"] div div div small")).getText();
        soft.assertTrue(actualMsg.contains("Please enter an Email"),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"Please enter an Email"
        );

        if ("failure".equals(result)){
            assertTrue(driver.findElement(By.cssSelector("div[class=\"col-12 form-group\"] div div div small")).isDisplayed());
        }

        else {
            assertTrue(driver.findElement(By.cssSelector("div>button[type=\"submit\"]")).isDisplayed());
        }

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"col-12 form-group\"] div div div small")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#ef5350");

        soft.assertAll();
    }

    @And("user could input the first name {string} and last name {string}")
    public void step22(String first_name, String last_name) throws InterruptedException {
        buyer.first.sendKeys(first_name);
        Thread.sleep(Duration.ofSeconds(3));

        buyer.last.sendKeys(last_name);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could input valid email")
    public void step23() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        buyer.E.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could input EN company name {string} and AR company name {string}")
    public void step24(String EN, String AR) throws InterruptedException {
        buyer.name_En.sendKeys(EN);
        Thread.sleep(Duration.ofSeconds(3));

        buyer.name_AR.sendKeys(AR);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could input the job title {string}")
    public void step25(String title) throws InterruptedException {
        buyer.job.sendKeys(title);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could input the mobile number {string}")
    public void step26(String phone_number) throws InterruptedException {
        buyer.num.sendKeys(phone_number);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could input password {string} and confirm password {string}")
    public void step27(String password, String confirm_password) throws InterruptedException {
        buyer.Password.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(3));

        buyer.conPass.sendKeys(confirm_password);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("user could The created new buyer is successfully {string}")
    public void step28(String result) {
        buyer.save.click();

        //1- message content or equal "Please enter an Email"
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.id("swal2-title")).getText();
        soft.assertTrue(actualMsg.contains("Validation Error"),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"Validation Error"
        );

        if ("failure".equals(result)){
            assertTrue(driver.findElement(By.id("swal2-title")).isDisplayed());
        }

        else {
            assertTrue(driver.findElement(By.cssSelector("div>button[type=\"submit\"]")).isDisplayed());
        }

        soft.assertAll();
    }
}
