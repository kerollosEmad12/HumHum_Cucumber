package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_CouponFromSupplierPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class CouponFromSupplier {

    JavascriptExecutor js = (JavascriptExecutor) driver;
    P06_CouponFromSupplierPage coupon = new P06_CouponFromSupplierPage();

    @Given("user enter to supplier page")
    public void step1()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-supplier/auth/login");
    }


    @And("user enter Email")
    public void step2() throws InterruptedException {
        coupon.mail.sendKeys("m.elzoghbi24@gmail.com");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter pass")
    public void step3() throws InterruptedException {
        coupon.pass.sendKeys("Asd12312");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user click on login")
    public void step4() throws InterruptedException {
        js.executeScript("arguments[0].click();", coupon.login);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user change language")
    public void step5() throws InterruptedException {
        js.executeScript("arguments[0].click();", coupon.language);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user choose marketing tool")
    public void step6() throws InterruptedException {
        js.executeScript("arguments[0].click();", coupon.market);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user click on coupon button")
    public void step7() throws InterruptedException {
        js.executeScript("arguments[0].click();", coupon.Coup);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user click on add coupon")
    public void step8() throws InterruptedException {
        js.executeScript("arguments[0].click();", coupon.add);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user add coupon type")
    public void step9() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ng-select[id=\"coupon_type\"] div span span[class=\"ng-arrow\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        coupon.couponType1.click();
        Thread.sleep(Duration.ofSeconds(2));
        coupon.couponType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user choose client")
    public void step10() throws InterruptedException {
        coupon.client1.sendKeys("ker");
        Thread.sleep(Duration.ofSeconds(5));
        coupon.client2.click();
        Thread.sleep(Duration.ofSeconds(5));
        coupon.client1.clear();
        Thread.sleep(Duration.ofSeconds(5));
        coupon.form.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user choose product")
    public void step11() throws InterruptedException {
        coupon.product1.sendKeys("test");
        Thread.sleep(Duration.ofSeconds(5));
        js.executeScript("arguments[0].click();", coupon.product2);
        Thread.sleep(Duration.ofSeconds(5));
        coupon.form.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user enter code")
    public void step12() throws InterruptedException {
        coupon.code.sendKeys("5555555555");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter discount type")
    public void step13() throws InterruptedException {
        coupon.disType1.click();
        Thread.sleep(Duration.ofSeconds(2));
        coupon.disType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter discount")
    public void step14() throws InterruptedException {
        coupon.dis.sendKeys("10");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter max discount")
    public void step15() throws InterruptedException {
        coupon.maxDis.sendKeys("100");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter Minimum Purchase Amount")
    public void step16() throws InterruptedException {
        coupon.minDis.sendKeys("50");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter count of use")
    public void step17() throws InterruptedException {
        coupon.countUse.sendKeys("5656");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user choose Start Date")
    public void step18() throws InterruptedException {
        js.executeScript("arguments[0].click();", coupon.startDate1);
        Thread.sleep(Duration.ofSeconds(2));
        js.executeScript("arguments[0].click();", coupon.startDate2);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter start time")
    public void step19() throws InterruptedException {
        coupon.startTime1.sendKeys("10");
        Thread.sleep(Duration.ofSeconds(2));
        coupon.startTime2.sendKeys("00");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user choose end date")
    public void step20() throws InterruptedException {
        js.executeScript("arguments[0].click();", coupon.endDate1);
        Thread.sleep(Duration.ofSeconds(2));
        js.executeScript("arguments[0].click();", coupon.endDate2);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter end time")
    public void step21() throws InterruptedException {
        coupon.endTime1.sendKeys("10");
        Thread.sleep(Duration.ofSeconds(2));
        coupon.endTime2.sendKeys("00");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user select Can be used with promotions")
    public void step22() throws InterruptedException {
        js.executeScript("arguments[0].click();", coupon.usePromotion);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("coupon is created successfully")
    public void step23() {
        coupon.submit.click();
    }
}
