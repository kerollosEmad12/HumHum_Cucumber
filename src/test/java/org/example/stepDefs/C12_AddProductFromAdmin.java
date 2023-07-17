package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P12_AddProductFromAdminPage;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class C12_AddProductFromAdmin {
    P12_AddProductFromAdminPage proAdmin = new P12_AddProductFromAdminPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("user enter to admin page")
    public void step1() {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-admin/dashboard");
    }

    @And("user enter  Email")
    public void step2() throws InterruptedException {
        proAdmin.Email.sendKeys("eslam@php-eg.com");
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user enter  password")
    public void step3() throws InterruptedException {
        proAdmin.Pass.sendKeys("eslam123");
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user   click   on  login")
    public void step4() throws InterruptedException {
        js.executeScript("arguments[0].click();", proAdmin.sign);
        Thread.sleep(Duration.ofSeconds(5));
    }

    @When("user click on my supply")
    public void step5() throws InterruptedException {
        js.executeScript("arguments[0].click();", proAdmin.header);
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user click on product Btn")
    public void step6() throws InterruptedException {
        js.executeScript("arguments[0].click();", proAdmin.pro);
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user click on add product")
    public void step7() throws InterruptedException {
        js.executeScript("arguments[0].click();", proAdmin.addPro);
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user enter {string} name")
    public void step8(String supplier) throws InterruptedException {
        proAdmin.supp1.sendKeys(supplier);
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.supp2.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user enter the category")
    public void step9() throws InterruptedException {
        proAdmin.cat1.click();
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.cat2.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user enter the sub category")
    public void step10() throws InterruptedException {
        proAdmin.subCat1.click();
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.subCat2.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user enter the last category")
    public void step11() throws InterruptedException {
        proAdmin.lastCat1.click();
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.lastCat2.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @When("user select the brand name")
    public void step12() throws InterruptedException {
        proAdmin.brand1.click();
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.brand2.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user enter name en")
    public void step13() throws InterruptedException {
        proAdmin.En.sendKeys("cucumber");
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user enter name ar")
    public void step14() throws InterruptedException {
        proAdmin.Ar.sendKeys("خيار");
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user select product from")
    public void step15() throws InterruptedException {
        proAdmin.country1.click();
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.country2.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user click on save Btn")
    public void step16() {
        proAdmin.save.click();
    }


    @And("user enter supplier name")
    public void step17() throws InterruptedException {
        proAdmin.supp1.sendKeys("shrouk");
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.supp2.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user  enter the category")
    public void step18() throws InterruptedException {
        proAdmin.cat1.click();
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.cat2.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user  enter the sub category")
    public void step19() throws InterruptedException {
        proAdmin.subCat1.click();
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.subCat2.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user  enter the last category")
    public void step20() throws InterruptedException {
        proAdmin.lastCat1.click();
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.lastCat2.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @When("user  select the brand name")
    public void step21() throws InterruptedException {
        proAdmin.brand1.click();
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.brand2.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user enter {string}  and {string}")
    public void step22(String name_en, String name_ar) throws InterruptedException {
        proAdmin.En.sendKeys(name_en);
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.Ar.sendKeys(name_ar);
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user  select product from")
    public void step23() throws InterruptedException {
        proAdmin.country1.click();
        Thread.sleep(Duration.ofSeconds(5));
        proAdmin.country2.click();
        Thread.sleep(Duration.ofSeconds(5));
    }

    @And("user  click on save Btn")
    public void step24() {
        proAdmin.save.click();
    }

}


