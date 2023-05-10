package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_HomePage;
import org.example.pages.P04_OrderPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;
public class Order {
    P01_HomePage home = new P01_HomePage();
    P04_OrderPage order = new P04_OrderPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions action = new Actions(driver);

    @Given("user go to home page")
    public void step1 ()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("user click on login Btn")
    public void step2 () throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));

        if (home.popup.isDisplayed())
        {
            home.popup.click();
        }

        //Open login icon
        home.registerTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter email")
    public void step3() throws InterruptedException {
        order.email.sendKeys("kerolos@gmail.com");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter password")
    public void step4() throws InterruptedException {
        order.pass.sendKeys("Asd12312");
        Thread.sleep(Duration.ofSeconds(2));
        //Login button
        js.executeScript("arguments[0].click();", order.Btn);
    }

    @And("user choose product promotion")
    public void step6() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        synchronized (driver){
            driver.wait(10000);
        }
        WebElement popup1 = driver.findElement(By.cssSelector("button[class=\"mfp-close\"]"));
        popup1.click();

        Thread.sleep(Duration.ofSeconds(3));
        js.executeScript("arguments[0].scrollIntoView();", order.cart);
        js.executeScript("arguments[0].click();", order.cart);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user click on view cart button")
    public void step7() throws InterruptedException {
        order.view.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter coupon")
    public void step8()
    {
        order.coupon.sendKeys("6666666");
        order.apply.click();
    }

    @And("mark on payment checkbox")
    public void step9() throws InterruptedException {
        js.executeScript("arguments[0].click();", order.cash);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("mark on I accept checkbox")
    public void step10() throws InterruptedException {
        js.executeScript("arguments[0].click();", order.checkbox);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user click on checkout button")
    public void step11() throws InterruptedException {
        js.executeScript("arguments[0].click();", order.checkout);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("user click on track your order")
    public void step12() {
        js.executeScript("arguments[0].click();", order.orderList);
    }
}
