package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_HomePage;
import org.example.pages.P05_AddAddressFCheckPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

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
        address.city1.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter street")
    public void step10() throws InterruptedException {
        address.street.sendKeys("2");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter name")
    public void step11() throws InterruptedException {
        address.name1.click();
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

        address.browse.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\2.png");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("new address is created successfully")
    public void step15() {
        js.executeScript("arguments[0].click();", address.btn);

        //1- message content or equal "The City field is mandatory".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("form[class=\"account-information-form\"] div[class=\"col-lg-4\"] div[class=\"error\"]")).getText();
        soft.assertTrue(actualMsg.contains("The City field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The City field is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("form[class=\"account-information-form\"] div[class=\"col-lg-4\"]:nth-of-type(3) div[class=\"error\"]")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#ef4923");

        soft.assertAll();
    }

    @And("user click on cart icon and click on checkout")
    public void step16() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(address.cart).build().perform();

        js.executeScript("arguments[0].click();", address.check);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("click  on new address")
    public void step17() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        js.executeScript("arguments[0].scrollIntoView();", address.label);
        Thread.sleep(Duration.ofSeconds(2));
        js.executeScript("arguments[0].click();", address.label);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  choose province")
    public void step18() throws InterruptedException {
        address.province.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter the city")
    public void step19() throws InterruptedException {
        address.city2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter street")
    public void step20() throws InterruptedException {
        address.street.sendKeys("2");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("keep the name is an empty")
    public void step21() throws InterruptedException {
        address.name2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter floor")
    public void step22() throws InterruptedException {
        address.floor.sendKeys("2");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter home number")
    public void step23() throws InterruptedException {
        address.homeNum.sendKeys("5246945");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter zip code")
    public void step24() throws InterruptedException {
        address.postCode.sendKeys("12569");
        Thread.sleep(Duration.ofSeconds(2));

        address.browse.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\2.png");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("new  address is created successfully")
    public void step25() {
        js.executeScript("arguments[0].click();", address.btn);

        //1- message content or equal "The name field is mandatory".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("form[class=\"account-information-form\"] div[class=\"col-lg-6\"]:nth-of-type(5) div[class=\"error\"]")).getText();
        soft.assertTrue(actualMsg.contains("The name field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The name field is mandatory."
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("form[class=\"account-information-form\"] div[class=\"col-lg-6\"]:nth-of-type(5) div[class=\"error\"]")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#ef4923");

        soft.assertAll();
    }

    @And("user click on  cart icon and click on checkout")
    public void step26() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(address.cart).build().perform();

        js.executeScript("arguments[0].click();", address.check);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("click  on  new address")
    public void step27() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        js.executeScript("arguments[0].scrollIntoView();", address.label);
        Thread.sleep(Duration.ofSeconds(2));
        js.executeScript("arguments[0].click();", address.label);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  choose  province")
    public void step28() throws InterruptedException {
        address.province.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter  the city")
    public void step29() throws InterruptedException {
        address.city2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  street")
    public void step30() throws InterruptedException {
        address.street.sendKeys("2");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter name")
    public void step31() throws InterruptedException {
        address.name1.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  floor")
    public void step32() throws InterruptedException {
        address.floor.sendKeys("2");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  home number")
    public void step33() throws InterruptedException {
        address.homeNum.sendKeys("5246945");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  zip code")
    public void step34() throws InterruptedException {
        address.postCode.sendKeys("12569");
        Thread.sleep(Duration.ofSeconds(2));

        address.browse.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\2.png");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("new  address  is created successfully")
    public void step35() {
        js.executeScript("arguments[0].click();", address.btn);
    }
}
