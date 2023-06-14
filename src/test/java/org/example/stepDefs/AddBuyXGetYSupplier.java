package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P09_AddBuyXGetYPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class AddBuyXGetYSupplier {
    P09_AddBuyXGetYPage BuyX = new P09_AddBuyXGetYPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    Actions action = new Actions(driver);

    @Given("user  enter to supplier  page")
    public void step1()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-supplier/auth/login");
    }

    @And("user  enter  Email")
    public void step2() throws InterruptedException {
        BuyX.mail.sendKeys("m.elzoghbi24@gmail.com");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  pass")
    public void step3() throws InterruptedException {
        BuyX.pass.sendKeys("Asd12312");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  click on  login")
    public void step4() throws InterruptedException {
        js.executeScript("arguments[0].click();", BuyX.login);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  change  language")
    public void step5() throws InterruptedException {
        js.executeScript("arguments[0].click();", BuyX.language);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  choose  marketing tool")
    public void step6() throws InterruptedException {
        js.executeScript("arguments[0].click();", BuyX.markList);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user choose Buy X Get Y")
    public void step7() throws InterruptedException {
        js.executeScript("arguments[0].click();", BuyX.BuyXBtn);
        Thread.sleep(Duration.ofSeconds(2));

        js.executeScript("arguments[0].click();", BuyX.add);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user choose product type")
    public void step8() throws InterruptedException {
        BuyX.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));
        BuyX.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("keep search product is an empty")
    public void step9() throws InterruptedException {
        BuyX.searchProduct1.sendKeys("");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter buy")
    public void step10() throws InterruptedException {
        BuyX.inputBuyX.sendKeys("2");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter get")
    public void step11() throws InterruptedException {
        BuyX.inputGetY.sendKeys("1");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user enter promotion period")
    public void step12() throws InterruptedException {
        js.executeScript("arguments[0].click();", BuyX.dateBtn);
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(BuyX.startDate).perform();
        action.click(BuyX.startDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(BuyX.endDate).perform();
        action.click(BuyX.endDate).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("The Buy X Get Y is created successfully")
    public void step13() throws InterruptedException {
        js.executeScript("arguments[0].click();", BuyX.submit);
        Thread.sleep(Duration.ofSeconds(2));

        js.executeScript("arguments[0].click();", BuyX.ok);
        Thread.sleep(Duration.ofSeconds(2));

        //1- message content or equal "The products ids field is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"col-6 mb-3\"]:nth-child(2) div:nth-child(3)")).getText();
        soft.assertTrue(actualMsg.contains("The products ids field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The products ids field is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"col-6 mb-3\"]:nth-child(2) div:nth-child(3)")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");
    }

    @And("user  choose product type")
    public void step14() throws InterruptedException {
        BuyX.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));
        BuyX.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter search product")
    public void step15() throws InterruptedException {
        BuyX.searchProduct1.sendKeys("apple");
        Thread.sleep(Duration.ofSeconds(2));
        BuyX.searchProduct2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("keep buy is an empty")
    public void step16() throws InterruptedException {
        BuyX.inputBuyX.sendKeys("");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter get")
    public void step17() throws InterruptedException {
        BuyX.inputGetY.sendKeys("1");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  enter promotion period")
    public void step18() throws InterruptedException {
        js.executeScript("arguments[0].click();", BuyX.dateBtn);
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(BuyX.startDate).perform();
        action.click(BuyX.startDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(BuyX.endDate).perform();
        action.click(BuyX.endDate).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("The  Buy X Get Y is created successfully")
    public void step19() throws InterruptedException {
        js.executeScript("arguments[0].click();", BuyX.submit);
        Thread.sleep(Duration.ofSeconds(2));

        js.executeScript("arguments[0].click();", BuyX.ok);
        Thread.sleep(Duration.ofSeconds(2));

        //1- message content or equal "The buy x field is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"col-6 mb-3\"]:nth-child(3) div:nth-child(3)")).getText();
        soft.assertTrue(actualMsg.contains("The buy x field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The buy x field is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"col-6 mb-3\"]:nth-child(3) div:nth-child(3)")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");
    }
}
