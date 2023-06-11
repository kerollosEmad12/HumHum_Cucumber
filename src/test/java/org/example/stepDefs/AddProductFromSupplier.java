package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_AddProductFSupplierPage;
import org.openqa.selenium.JavascriptExecutor;


import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class AddProductFromSupplier {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    P07_AddProductFSupplierPage product = new P07_AddProductFSupplierPage();
    @Given("user  enter to supplier page")
    public void step1 ()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-supplier/auth/login");
    }

    @And("user  enter Email")
    public void step2() throws InterruptedException {
        product.mail.sendKeys("m.elzoghbi24@gmail.com");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter pass")
    public void step3() throws InterruptedException {
        product.pass.sendKeys("Asd12312");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  click on login")
    public void step4() throws InterruptedException {
        js.executeScript("arguments[0].click();", product.login);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  change language")
    public void step5() throws InterruptedException {
        js.executeScript("arguments[0].click();", product.language);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  choose marketing tool")
    public void step6() throws InterruptedException {
        js.executeScript("arguments[0].click();", product.pro);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user click on list new product")
    public void step7() throws InterruptedException {
        js.executeScript("arguments[0].click();", product.list);
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user enter category")
    public void step8() throws InterruptedException {
        product.category1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.category2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user enter sub category")
    public void step9() throws InterruptedException {
        product.subCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.subCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user enter last category")
    public void step10() throws InterruptedException {
        product.lastCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.lastCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user add brand name")
    public void step11() throws InterruptedException {
        product.brandName1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.brandName2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user enter name En")
    public void step12() throws InterruptedException {
        product.nameEN.sendKeys("Honey2");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user enter name AR")
    public void step14() throws InterruptedException {
        product.nameAR.sendKeys("عسل");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user enter product from")
    public void step15() throws InterruptedException {
        product.productFrom1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.productFrom2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @When("user choose selling country")
    public void step16() throws InterruptedException {
        product.sellingCount1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount2.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount3.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.test.sendKeys("test");
        Thread.sleep(Duration.ofSeconds(4));

    }

    @And("user click on save button")
    public void step17() throws InterruptedException {
        product.save1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.ok1.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user enter main image")
    public void step18() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", product.image1);
        product.image1.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user enter product image")
    public void step19() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", product.image2);
        product.image2.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @Then("product is created successfully")
    public void step20() throws InterruptedException {
        product.save2.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.ok2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter price BtoB")
    public void step21() throws InterruptedException {
        product.priceB2B.sendKeys("12.5");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter wight")
    public void step22() throws InterruptedException {
        product.weightB2B.sendKeys("300");
        Thread.sleep(Duration.ofSeconds(2));
        product.unit1.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.unit2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter stock quantity")
    public void step23() throws InterruptedException {
        product.quantity.sendKeys("1000");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter main order")
    public void step24() throws InterruptedException {
        product.mainOrder.sendKeys("5");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter low stock")
    public void step25() throws InterruptedException {
        product.lowStock.sendKeys("500");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user enter return time")
    public void step26() throws InterruptedException {
        product.ReturnTime1.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.ReturnTime2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user choose delivery time")
    public void step27() throws InterruptedException {
        product.delivery1.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.delivery2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user click on ask admin to publish button")
    public void step28() throws InterruptedException {
        product.ask.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("BtoB is publish successfully")
    public void step29() throws InterruptedException {
        product.save3.click();
        Thread.sleep(Duration.ofSeconds(2));
    }
}
