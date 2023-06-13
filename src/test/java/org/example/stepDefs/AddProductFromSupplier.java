package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_AddProductFSupplierPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;


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
        product.DynamicInput.sendKeys("test");
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

    @And("user  enter category")
    public void step30() throws InterruptedException {
        product.category1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.category2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter sub category")
    public void step31() throws InterruptedException {
        product.subCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.subCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter last category")
    public void step32() throws InterruptedException {
        product.lastCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.lastCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  add brand name")
    public void step33() throws InterruptedException {
        product.brandName1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.brandName2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("Keep name En is an empty")
    public void step34() throws InterruptedException {
        product.nameEN.sendKeys("");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter name AR")
    public void step35() throws InterruptedException {
        product.nameAR.sendKeys("عسل");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter product from")
    public void step36() throws InterruptedException {
        product.productFrom1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.productFrom2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @When("user  choose selling country")
    public void step37() throws InterruptedException {
        product.sellingCount1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount2.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount3.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.DynamicInput.sendKeys("test");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  click on save button")
    public void step38() throws InterruptedException {
        product.save1.click();
        Thread.sleep(Duration.ofSeconds(4));

        //1- message content or equal "The title en field is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"mb-3\"]:nth-child(6) div:nth-child(2)")).getText();
        soft.assertTrue(actualMsg.contains("The title en field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The title en field is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"mb-3\"]:nth-child(6) div:nth-child(2)")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");

        soft.assertAll();
    }

    @And("user  enter  category")
    public void step39() throws InterruptedException {
        product.category1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.category2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter  sub category")
    public void step40() throws InterruptedException {
        product.subCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.subCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter  last category")
    public void step41() throws InterruptedException {
        product.lastCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.lastCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  add  brand name")
    public void step42() throws InterruptedException {
        product.brandName1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.brandName2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter name En")
    public void step43() throws InterruptedException {
        product.nameEN.sendKeys("Honey");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("Keep name AR is an empty")
    public void step44() throws InterruptedException {
        product.nameAR.sendKeys("");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter  product from")
    public void step45() throws InterruptedException {
        product.productFrom1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.productFrom2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @When("user  choose  selling country")
    public void step46() throws InterruptedException {
        product.sellingCount1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount2.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount3.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.DynamicInput.sendKeys("test");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  click  on save button")
    public void step47() throws InterruptedException {
        product.save1.click();
        Thread.sleep(Duration.ofSeconds(4));

        //1- message content or equal "The title en field is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"mb-3 ng-star-inserted\"]:nth-child(7) div:nth-child(2)")).getText();
        soft.assertTrue(actualMsg.contains("The title ar field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The title ar field is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"mb-3 ng-star-inserted\"]:nth-child(7) div:nth-child(2)")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");

        soft.assertAll();
    }

    @And("user   enter  category")
    public void step48() throws InterruptedException {
        product.category1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.category2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter  sub category")
    public void step49() throws InterruptedException {
        product.subCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.subCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter  last category")
    public void step50() throws InterruptedException {
        product.lastCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.lastCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   add  brand name")
    public void step51() throws InterruptedException {
        product.brandName1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.brandName2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter name En")
    public void step52() throws InterruptedException {
        product.nameEN.sendKeys("Honey");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter name AR")
    public void step53() throws InterruptedException {
        product.nameAR.sendKeys("عسل");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter  product from")
    public void step54() throws InterruptedException {
        product.productFrom1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.productFrom2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @When("user  choose  selling country without dynamic input")
    public void step55() throws InterruptedException {
        product.sellingCount1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount2.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount3.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.DynamicInput.sendKeys("");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   click  on save button")
    public void step56() throws InterruptedException {
        product.save1.click();
        Thread.sleep(Duration.ofSeconds(4));

        //1- message content or equal "The title en field is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"mb-3 ng-star-inserted\"]:nth-child(10) div:nth-child(2)")).getText();
        soft.assertTrue(actualMsg.contains("this field is mandatory"),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"this field is mandatory"
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"mb-3 ng-star-inserted\"]:nth-child(10) div:nth-child(2)")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");

        soft.assertAll();
    }

    @And("user   enter category")
    public void step57() throws InterruptedException {
        product.category1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.category2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter sub category")
    public void step58() throws InterruptedException {
        product.subCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.subCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter last category")
    public void step59() throws InterruptedException {
        product.lastCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.lastCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   add brand name")
    public void step60() throws InterruptedException {
        product.brandName1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.brandName2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter  name En")
    public void step61() throws InterruptedException {
        product.nameEN.sendKeys("Grapes");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter  name AR")
    public void step62() throws InterruptedException {
        product.nameAR.sendKeys("عنب");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter product from")
    public void step63() throws InterruptedException {
        product.productFrom1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.productFrom2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @When("user   choose selling country")
    public void step64() throws InterruptedException {
        product.sellingCount1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount2.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount3.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.DynamicInput.sendKeys("Test");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   click on save button")
    public void step65() throws InterruptedException {
        product.save1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.ok1.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter main image")
    public void step66() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", product.image1);
        product.image1.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\5.jpeg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter product image")
    public void step67() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", product.image2);
        product.image2.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\5.jpeg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @Then("product  is created successfully")
    public void step68() throws InterruptedException {
        product.save2.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.ok2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("Keep BtoB is an empty")
    public void step69() throws InterruptedException {
        product.priceB2B.sendKeys("");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter wight")
    public void step70() throws InterruptedException {
        product.weightB2B.sendKeys("300");
        Thread.sleep(Duration.ofSeconds(2));
        product.unit1.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.unit2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter stock quantity")
    public void step71() throws InterruptedException {
        product.quantity.sendKeys("1000");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter main order")
    public void step72() throws InterruptedException {
        product.mainOrder.sendKeys("5");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter low stock")
    public void step73() throws InterruptedException {
        product.lowStock.sendKeys("500");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  enter return time")
    public void step74() throws InterruptedException {
        product.ReturnTime1.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.ReturnTime2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  choose delivery time")
    public void step75() throws InterruptedException {
        product.delivery1.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.delivery2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  click on ask admin to publish button")
    public void step76() throws InterruptedException {
        product.ask.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("BtoB  is publish successfully")
    public void step77() throws InterruptedException {
        product.save3.click();
        Thread.sleep(Duration.ofSeconds(2));

        //1- message content or equal "The price field is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("app-product-meta-form div div:nth-child(2) div div:nth-child(2) div:nth-child(2)")).getText();
        soft.assertTrue(actualMsg.contains("The price field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The price field is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("app-product-meta-form div div:nth-child(2) div div:nth-child(2) div:nth-child(2)")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");

        soft.assertAll();
    }

    @And("user   enter   category")
    public void step78() throws InterruptedException {
        product.category1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.category2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter   sub category")
    public void step79() throws InterruptedException {
        product.subCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.subCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter   last category")
    public void step80() throws InterruptedException {
        product.lastCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.lastCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   add   brand name")
    public void step81() throws InterruptedException {
        product.brandName1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.brandName2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter   name En")
    public void step82() throws InterruptedException {
        product.nameEN.sendKeys("Grapes");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter   name AR")
    public void step83() throws InterruptedException {
        product.nameAR.sendKeys("عنب");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter  product  from")
    public void step84() throws InterruptedException {
        product.productFrom1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.productFrom2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @When("user   choose  selling country")
    public void step85() throws InterruptedException {
        product.sellingCount1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount2.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount3.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.DynamicInput.sendKeys("Test");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   click on  save button")
    public void step86() throws InterruptedException {
        product.save1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.ok1.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter  main image")
    public void step87() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", product.image1);
        product.image1.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\5.jpeg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter  product image")
    public void step88() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", product.image2);
        product.image2.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\5.jpeg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @Then("product  is  created successfully")
    public void step89() throws InterruptedException {
        product.save2.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.ok2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter  BtoB price")
    public void step90() throws InterruptedException {
        product.priceB2B.sendKeys("12.5");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("keep wight is an empty")
    public void step91() throws InterruptedException {
        product.weightB2B.sendKeys("");
        Thread.sleep(Duration.ofSeconds(2));
        product.unit1.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.unit2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  stock quantity")
    public void step92() throws InterruptedException {
        product.quantity.sendKeys("1000");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  main order")
    public void step93() throws InterruptedException {
        product.mainOrder.sendKeys("5");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  low stock")
    public void step94() throws InterruptedException {
        product.lowStock.sendKeys("500");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  enter  return time")
    public void step95() throws InterruptedException {
        product.ReturnTime1.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.ReturnTime2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  choose  delivery time")
    public void step96() throws InterruptedException {
        product.delivery1.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.delivery2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  click on  ask admin to publish button")
    public void step97() throws InterruptedException {
        product.ask.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("BtoB  is publish  successfully")
    public void step98() throws InterruptedException {
        product.save3.click();
        Thread.sleep(Duration.ofSeconds(2));

        //1- message content or equal "The weight field is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div:nth-child(2) div:nth-child(5) div[class=\"text-danger mt-1 ng-star-inserted\"]:nth-child(2)")).getText();
        soft.assertTrue(actualMsg.contains("The weight field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The weight field is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div:nth-child(2) div:nth-child(5) div[class=\"text-danger mt-1 ng-star-inserted\"]:nth-child(2)")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");

        soft.assertAll();
    }

    @And("user   enter    category")
    public void step99() throws InterruptedException {
        product.category1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.category2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter    sub category")
    public void step100() throws InterruptedException {
        product.subCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.subCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter    last category")
    public void step101() throws InterruptedException {
        product.lastCategory1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.lastCategory2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   add    brand name")
    public void step102() throws InterruptedException {
        product.brandName1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.brandName2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter    name En")
    public void step103() throws InterruptedException {
        product.nameEN.sendKeys("Grapes");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter    name AR")
    public void step104() throws InterruptedException {
        product.nameAR.sendKeys("عنب");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   enter   product  from")
    public void step105() throws InterruptedException {
        product.productFrom1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.productFrom2.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @When("user   choose   selling country")
    public void step106() throws InterruptedException {
        product.sellingCount1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount2.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.sellingCount3.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.DynamicInput.sendKeys("Test");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   click on   save button")
    public void step107() throws InterruptedException {
        product.save1.click();
        Thread.sleep(Duration.ofSeconds(4));
        product.ok1.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter  main  image")
    public void step108() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", product.image1);
        product.image1.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\5.jpeg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  enter  product  image")
    public void step109() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", product.image2);
        product.image2.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\5.jpeg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @Then("product  is  created  successfully")
    public void step110() throws InterruptedException {
        product.save2.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.ok2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter  BtoB  price")
    public void step111() throws InterruptedException {
        product.priceB2B.sendKeys("12.5");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter wight with character")
    public void step112() throws InterruptedException {
        product.weightB2B.sendKeys("v");
        Thread.sleep(Duration.ofSeconds(2));
        product.unit1.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.unit2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  stock  quantity")
    public void step113() throws InterruptedException {
        product.quantity.sendKeys("1000");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  main  order")
    public void step114() throws InterruptedException {
        product.mainOrder.sendKeys("5");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  low  stock")
    public void step115() throws InterruptedException {
        product.lowStock.sendKeys("500");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  enter  return  time")
    public void step116() throws InterruptedException {
        product.ReturnTime1.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.ReturnTime2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  choose  delivery  time")
    public void step117() throws InterruptedException {
        product.delivery1.click();
        Thread.sleep(Duration.ofSeconds(2));
        product.delivery2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  click on  ask admin to  publish button")
    public void step118() throws InterruptedException {
        product.ask.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("BtoB  is  publish  successfully")
    public void step119() throws InterruptedException {
        product.save3.click();
        Thread.sleep(Duration.ofSeconds(2));

        //1- message content or equal "The weight must be a number."
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div:nth-child(2) div:nth-child(5) div[class=\"text-danger mt-1 ng-star-inserted\"]:nth-child(2)")).getText();
        soft.assertTrue(actualMsg.contains("The weight must be a number."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The weight must be a number."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div:nth-child(2) div:nth-child(5) div[class=\"text-danger mt-1 ng-star-inserted\"]:nth-child(2)")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");

        soft.assertAll();
    }
}
