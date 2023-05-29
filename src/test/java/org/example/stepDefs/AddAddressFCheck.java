package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_HomePage;
import org.example.pages.P05_AddAddressFCheckPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;
public class AddAddressFCheck {

    JavascriptExecutor js = (JavascriptExecutor) driver;
    P01_HomePage home = new P01_HomePage();

    P05_AddAddressFCheckPage address = new P05_AddAddressFCheckPage();

    @Given("user enter to home page")
    public void step1()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("user press on login button")
    public void step2() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        js.executeScript("arguments[0].click();", home.popup);
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        js.executeScript("arguments[0].click();", home.registerTab);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter user name")
    public void step3() throws InterruptedException {
        address.mail.sendKeys("kerolos@gmail.com");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user input password and click on login button")
    public void step4() throws InterruptedException {
        address.password.sendKeys("Asd12312");
        Thread.sleep(Duration.ofSeconds(2));

        js.executeScript("arguments[0].click();", address.submit);
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("mouse hover on cart icon and click on checkout")
    public void step5() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(address.cart).build().perform();

        js.executeScript("arguments[0].click();", address.check);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("click on new address")
    public void step6() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        js.executeScript("arguments[0].scrollIntoView();", address.label);
        Thread.sleep(Duration.ofSeconds(2));
        js.executeScript("arguments[0].click();", address.label);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user choose country")
    public void step7() throws InterruptedException {
        address.country.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user choose province")
    public void step8() throws InterruptedException {
        address.province.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("keep city an empty")
    public void step9() throws InterruptedException {
        address.city.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter street")
    public void step10() throws InterruptedException {
        address.street.sendKeys("2");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter name")
    public void step11() throws InterruptedException {
        address.name.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter floor")
    public void step12() throws InterruptedException {
        address.floor.sendKeys("2");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter home number")
    public void step13() throws InterruptedException {
        address.homeNum.sendKeys("5246945");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter zip code")
    public void step14() throws InterruptedException {
        address.postCode.sendKeys("12569");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("new address is created successfully")
    public void step15() {
        js.executeScript("arguments[0].click();", address.btn);
    }
}
