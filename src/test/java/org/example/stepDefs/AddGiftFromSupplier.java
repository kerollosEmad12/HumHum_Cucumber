package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P10_AddGiftFromSupplierPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class AddGiftFromSupplier {

    P10_AddGiftFromSupplierPage gift = new P10_AddGiftFromSupplierPage();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    Actions action = new Actions(driver);

    @Given("user  enter  to supplier  page")
    public void step1 ()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-supplier/auth/login");
    }


    @And("user  enter   Email")
    public void step2() throws InterruptedException {
        gift.mail.sendKeys("m.elzoghbi24@gmail.com");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter   pass")
    public void step3() throws InterruptedException {
        gift.pass.sendKeys("Asd12312");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  click  on  login")
    public void step4() throws InterruptedException {
        js.executeScript("arguments[0].click();", gift.login);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  change   language")
    public void step5() throws InterruptedException {
        js.executeScript("arguments[0].click();", gift.language);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  choose   marketing tool")
    public void step6() throws InterruptedException {
        js.executeScript("arguments[0].click();", gift.markList);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user choose Buy X Gift Y")
    public void step7() throws InterruptedException {
        js.executeScript("arguments[0].click();", gift.getGift);
        Thread.sleep(Duration.ofSeconds(2));

        js.executeScript("arguments[0].click();", gift.add);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user choose product  type")
    public void step8() throws InterruptedException {
        gift.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));

        gift.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("Keep Buy product is an empty")
    public void step9() throws InterruptedException {
        gift.buyProduct1.sendKeys("");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter the gift product")
    public void step10() throws InterruptedException {
        gift.giftProduct1.sendKeys("test");
        Thread.sleep(Duration.ofSeconds(2));

        gift.giftProduct2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter buy number")
    public void step11() throws InterruptedException {
        gift.buyNumber.sendKeys("3");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter gift number")
    public void step12() throws InterruptedException {
        gift.giftNumber.sendKeys("1");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter promotion period start date and end date")
    public void step13() throws InterruptedException {
        js.executeScript("arguments[0].click();", gift.Btn);
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(gift.startDate).perform();
        action.click(gift.startDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(gift.endDate).perform();
        action.click(gift.endDate).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("The  Buy X Gift Y is created successfully")
    public void step14() throws InterruptedException {
        gift.done.click();
        Thread.sleep(Duration.ofSeconds(2));
        js.executeScript("arguments[0].click();", gift.Ok);
        Thread.sleep(Duration.ofSeconds(2));

        //1- message content or equal "The buy product supplier id field is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"text-danger mt-1 ng-star-inserted\"]:nth-child(3)")).getText();
        soft.assertTrue(actualMsg.contains("The buy product supplier id field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The products ids field is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"text-danger mt-1 ng-star-inserted\"]:nth-child(3)")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");
    }

    @When("user choose  product  type")
    public void step15() throws InterruptedException {
        gift.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));

        gift.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter Buy product")
    public void step16() throws InterruptedException {
        gift.buyProduct1.sendKeys("apple");
        Thread.sleep(Duration.ofSeconds(2));

        gift.buyProduct2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("Keep gift product is an empty")
    public void step17() throws InterruptedException {
        gift.giftProduct1.sendKeys("");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter  buy number")
    public void step18() throws InterruptedException {
        gift.buyNumber.sendKeys("3");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter  gift number")
    public void step19() throws InterruptedException {
        gift.giftNumber.sendKeys("1");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter  promotion period start date and end date")
    public void step20() throws InterruptedException {
        js.executeScript("arguments[0].click();", gift.Btn);
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(gift.startDate).perform();
        action.click(gift.startDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(gift.endDate).perform();
        action.click(gift.endDate).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("The  Buy X  Gift Y is created successfully")
    public void step21() throws InterruptedException {
        gift.done.click();
        Thread.sleep(Duration.ofSeconds(2));
        js.executeScript("arguments[0].click();", gift.Ok);
        Thread.sleep(Duration.ofSeconds(2));

        //1- message content or equal "The gift product supplier id field is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div:nth-child(3) div[class=\"text-danger mt-1 ng-star-inserted\"]")).getText();
        soft.assertTrue(actualMsg.contains("The gift product supplier id field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The gift product supplier id field is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div:nth-child(3) div[class=\"text-danger mt-1 ng-star-inserted\"]")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");
    }

    @When("user  choose  product  type")
    public void step22() throws InterruptedException {
        gift.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));

        gift.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter Buy product")
    public void step23() throws InterruptedException {
        gift.buyProduct1.sendKeys("apple");
        Thread.sleep(Duration.ofSeconds(2));

        gift.buyProduct2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter gift product")
    public void step24() throws InterruptedException {
        gift.giftProduct1.sendKeys("test");
        Thread.sleep(Duration.ofSeconds(2));

        gift.giftProduct2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("Keep buy number is an empty")
    public void step25() throws InterruptedException {
        gift.buyNumber.sendKeys("");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  gift number")
    public void step26() throws InterruptedException {
        gift.giftNumber.sendKeys("1");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  promotion period start date and end date")
    public void step27() throws InterruptedException {
        js.executeScript("arguments[0].click();", gift.Btn);
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(gift.startDate).perform();
        action.click(gift.startDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(gift.endDate).perform();
        action.click(gift.endDate).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("The  Buy  X  Gift Y is created successfully")
    public void step28() throws InterruptedException {
        gift.done.click();
        Thread.sleep(Duration.ofSeconds(2));
        js.executeScript("arguments[0].click();", gift.Ok);
        Thread.sleep(Duration.ofSeconds(2));

        //1- message content or equal "The buy x field is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div:nth-child(4) div[class=\"text-danger mt-1 ng-star-inserted\"]")).getText();
        soft.assertTrue(actualMsg.contains("The buy x field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The buy x field is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div:nth-child(4) div[class=\"text-danger mt-1 ng-star-inserted\"]")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");
    }

    @When("user  choose   product  type")
    public void step29() throws InterruptedException {
        gift.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));

        gift.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  Buy product")
    public void step30() throws InterruptedException {
        gift.buyProduct1.sendKeys("apple");
        Thread.sleep(Duration.ofSeconds(2));

        gift.buyProduct2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter gift product")
    public void step31() throws InterruptedException {
        gift.giftProduct1.sendKeys("test");
        Thread.sleep(Duration.ofSeconds(2));

        gift.giftProduct2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter buy number")
    public void step32() throws InterruptedException {
        gift.buyNumber.sendKeys("3");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("Keep gift number is an empty")
    public void step33() throws InterruptedException {
        gift.giftNumber.sendKeys("");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  promotion  period start date and end date")
    public void step34() throws InterruptedException {
        js.executeScript("arguments[0].click();", gift.Btn);
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(gift.startDate).perform();
        action.click(gift.startDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(gift.endDate).perform();
        action.click(gift.endDate).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("The  Buy  X  Gift  Y is created successfully")
    public void step35() throws InterruptedException {
        gift.done.click();
        Thread.sleep(Duration.ofSeconds(2));
        js.executeScript("arguments[0].click();", gift.Ok);
        Thread.sleep(Duration.ofSeconds(2));

        //1- message content or equal "The gift y field is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div:nth-child(5) div[class=\"text-danger mt-1 ng-star-inserted\"]")).getText();
        soft.assertTrue(actualMsg.contains("The gift y field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The gift y field is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div:nth-child(5) div[class=\"text-danger mt-1 ng-star-inserted\"]")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");
    }

    @When("user  choose   product   type")
    public void step36() throws InterruptedException {
        gift.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));

        gift.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  Buy  product")
    public void step37() throws InterruptedException {
        gift.buyProduct1.sendKeys("apple");
        Thread.sleep(Duration.ofSeconds(2));

        gift.buyProduct2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  gift product")
    public void step38() throws InterruptedException {
        gift.giftProduct1.sendKeys("test");
        Thread.sleep(Duration.ofSeconds(2));

        gift.giftProduct2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  buy number")
    public void step39() throws InterruptedException {
        gift.buyNumber.sendKeys("3");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  gift  number")
    public void step40() throws InterruptedException {
        gift.giftNumber.sendKeys("1");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enters a date prior to the current date")
    public void step41() throws InterruptedException {
        js.executeScript("arguments[0].click();", gift.Btn);
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(gift.startDate).perform();
        action.click(gift.startDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(gift.endDate).perform();
        action.click(gift.endDate).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("The  Buy  X  Gift  Y  is created successfully")
    public void step42() throws InterruptedException {
        gift.done.click();
        Thread.sleep(Duration.ofSeconds(2));
        js.executeScript("arguments[0].click();", gift.Ok);
        Thread.sleep(Duration.ofSeconds(2));

        //1- message content or equal "The start date must be a date after yesterday.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div:nth-child(6) div[class=\"text-danger mt-1 ng-star-inserted\"]")).getText();
        soft.assertTrue(actualMsg.contains("The start date must be a date after yesterday."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The start date must be a date after yesterday."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div:nth-child(6) div[class=\"text-danger mt-1 ng-star-inserted\"]")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");
    }

    @When("user   choose   product   type")
    public void step43() throws InterruptedException {
        gift.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));

        gift.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  Buy   product")
    public void step44() throws InterruptedException {
        gift.buyProduct1.sendKeys("apple");
        Thread.sleep(Duration.ofSeconds(2));

        gift.buyProduct2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  gift  product")
    public void step45() throws InterruptedException {
        gift.giftProduct1.sendKeys("test");
        Thread.sleep(Duration.ofSeconds(2));

        gift.giftProduct2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  buy  number")
    public void step46() throws InterruptedException {
        gift.buyNumber.sendKeys("3");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  gift   number")
    public void step47() throws InterruptedException {
        gift.giftNumber.sendKeys("1");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  promotion  period start date  and end date")
    public void step48() throws InterruptedException {
        js.executeScript("arguments[0].click();", gift.Btn);
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(gift.startDate).perform();
        action.click(gift.startDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(gift.endDate).perform();
        action.click(gift.endDate).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("The  Buy  X  Gift  Y  is created  successfully")
    public void step49() throws InterruptedException {
        gift.done.click();
        Thread.sleep(Duration.ofSeconds(2));
        js.executeScript("arguments[0].click();", gift.Ok);
        Thread.sleep(Duration.ofSeconds(2));
    }
}
