package org.example.stepDefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P14_AddSupplierPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;
import static org.junit.Assert.assertTrue;

public class C14_AddSupplier {
    public static String globalEmail;
    P14_AddSupplierPage supplier = new P14_AddSupplierPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("user should enter admin page")
    public void step1 ()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-admin/dashboard");
    }

    @And("user should input  Email {string}")
    public void step2(String email) throws InterruptedException {
        supplier.Mail.sendKeys(email);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user should input  password {string}")
    public void step3(String password) throws InterruptedException {
        supplier.Pass.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user should press on login")
    public void step4() throws InterruptedException {
        js.executeScript("arguments[0].click();", supplier.sub);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @When("user should press on my supply")
    public void step5() throws InterruptedException {
        js.executeScript("arguments[0].click();", supplier.head);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user should click on suppliers Btn")
    public void step6() throws InterruptedException {
        supplier.sup.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user should click on add supplier Btn")
    public void step7() throws InterruptedException {
        js.executeScript("arguments[0].click();", supplier.supp);
        Thread.sleep(Duration.ofSeconds(5));

        js.executeScript("arguments[0].click();", supplier.AddSup);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("Entrance the first name {string} and last name {string}")
    public void step8(String first_name, String last_name) throws InterruptedException {
        supplier.First.sendKeys(first_name);
        Thread.sleep(Duration.ofSeconds(3));

        supplier.Last.sendKeys(last_name);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("Entrance the EN company name {string} and AR company name {string}")
    public void step9(String EN, String AR) throws InterruptedException {
        supplier.compNameEn.sendKeys(EN);
        Thread.sleep(Duration.ofSeconds(3));

        supplier.compNameAr.sendKeys(AR);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("Entrance the selling for")
    public void step10() throws InterruptedException {
        supplier.sell1.click();
        Thread.sleep(Duration.ofSeconds(3));

        js.executeScript("arguments[0].click();", supplier.sell2);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("Entrance the job title {string}")
    public void step11(String title) throws InterruptedException {
        supplier.title.sendKeys(title);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("Entrance the valid email")
    public void step12() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        supplier.em.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("Entrance the country code")
    public void step13() throws InterruptedException {
        supplier.code1.click();
        Thread.sleep(Duration.ofSeconds(3));

        js.executeScript("arguments[0].click();", supplier.code2);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("Entrance the mobile number")
    public void step14() throws InterruptedException {
        Faker faker = new Faker();
        String phoneNumber = faker.numerify("010########");
        supplier.mobile.sendKeys(phoneNumber);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("Entrance the password {string} and confirm password {string}")
    public void step15(String password, String confirm_password) throws InterruptedException {
        supplier.Password.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(3));

        supplier.confirmPass.sendKeys(confirm_password);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("The create new supplier is successfully {string}")
    public void step16(String result) {
        supplier.Save.click();

        //1- message content or equal "Validation Error"
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
