package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P11_AddBasketFromSupplierPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class AddBasketFromSupplier {
    P11_AddBasketFromSupplierPage basket = new P11_AddBasketFromSupplierPage();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    Actions action = new Actions(driver);

    @Given("user  enter  to  supplier  page")
    public void step1 ()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-supplier/auth/login");
    }

    @And("user   enter   Email")
    public void step2() throws InterruptedException {
        basket.mail.sendKeys("m.elzoghbi24@gmail.com");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   enter   pass")
    public void step3() throws InterruptedException {
        basket.pass.sendKeys("Asd12312");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   click  on  login")
    public void step4() throws InterruptedException {
        js.executeScript("arguments[0].click();", basket.login);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   change   language")
    public void step5() throws InterruptedException {
        js.executeScript("arguments[0].click();", basket.language);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  choose   marketing  tool")
    public void step6() throws InterruptedException {
        js.executeScript("arguments[0].click();", basket.markList);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user choose Basket promotion")
    public void step7() throws InterruptedException {
        js.executeScript("arguments[0].click();", basket.Basket);
        Thread.sleep(Duration.ofSeconds(2));

        js.executeScript("arguments[0].click();", basket.Add);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  choose product  type")
    public void step8() throws InterruptedException {
        basket.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));

        basket.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("Keep search product is an empty")
    public void step9() throws InterruptedException {
        basket.searchProduct1.sendKeys("");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user choose Promotion Period")
    public void step10() throws InterruptedException {
        basket.Period.click();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(basket.StartDate).perform();
        action.click(basket.StartDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        basket.EndDate1.click();
        Thread.sleep(Duration.ofSeconds(2));
        action.moveToElement(basket.EndDate2).perform();
        action.click(basket.EndDate2).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user choose Return Time Limit")
    public void step11() throws InterruptedException {
        basket.Time1.click();
        Thread.sleep(Duration.ofSeconds(2));
        basket.Time2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter Title En")
    public void step12() throws InterruptedException {
        basket.En.sendKeys("Honey");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter Title AR")
    public void step13() throws InterruptedException {
        basket.Ar.sendKeys("عسل");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user enter Main image")
    public void step14() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", basket.MainImage);
        basket.MainImage.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user input images")
    public void step15() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", basket.Images);
        basket.Images.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user click on submit Btn")
    public void step16() throws InterruptedException {
        basket.Submit.click();
        Thread.sleep(Duration.ofSeconds(4));

        basket.Ok.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @When("User  choose  product  type")
    public void step17() throws InterruptedException {
        basket.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));

        basket.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter search product")
    public void step18() throws InterruptedException {
        basket.searchProduct1.sendKeys("Honey");
        Thread.sleep(Duration.ofSeconds(2));
        basket.searchProduct2.click();
        Thread.sleep(Duration.ofSeconds(2));

        basket.searchProduct1.sendKeys("apple");
        Thread.sleep(Duration.ofSeconds(2));
        basket.searchProduct3.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  choose Promotion Period")
    public void step19() throws InterruptedException {
        basket.Period.click();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(basket.StartDate).perform();
        action.click(basket.StartDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        basket.EndDate1.click();
        Thread.sleep(Duration.ofSeconds(2));
        action.moveToElement(basket.EndDate2).perform();
        action.click(basket.EndDate2).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("keep Return Time Limit is an empty")
    public void step20() throws InterruptedException {
        basket.Time1.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter Title En")
    public void step21() throws InterruptedException {
        basket.En.sendKeys("Honey");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter Title AR")
    public void step22() throws InterruptedException {
        basket.Ar.sendKeys("عسل");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter Main image")
    public void step23() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", basket.MainImage);
        basket.MainImage.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  input images")
    public void step24() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", basket.Images);
        basket.Images.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  click on submit Btn")
    public void step25() throws InterruptedException {
        basket.Submit.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @When("User  choose   product  type")
    public void step26() throws InterruptedException {
        basket.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));

        basket.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  search product")
    public void step27() throws InterruptedException {
        basket.searchProduct1.sendKeys("Honey");
        Thread.sleep(Duration.ofSeconds(2));
        basket.searchProduct2.click();
        Thread.sleep(Duration.ofSeconds(4));

        basket.searchProduct1.sendKeys("apple");
        Thread.sleep(Duration.ofSeconds(2));
        basket.searchProduct3.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  choose  Promotion Period")
    public void step28() throws InterruptedException {
        basket.Period.click();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(basket.StartDate).perform();
        action.click(basket.StartDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        basket.EndDate1.click();
        Thread.sleep(Duration.ofSeconds(2));
        action.moveToElement(basket.EndDate2).perform();
        action.click(basket.EndDate2).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user  enter Return  Time Limit")
    public void step29() throws InterruptedException {
        basket.Time1.click();
        Thread.sleep(Duration.ofSeconds(2));
        basket.Time2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("Keep Title En is an empty")
    public void step30() throws InterruptedException {
        basket.En.sendKeys("");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  Title AR")
    public void step31() throws InterruptedException {
        basket.Ar.sendKeys("عسل");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  Main image")
    public void step32() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", basket.MainImage);
        basket.MainImage.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  input  images")
    public void step33() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", basket.Images);
        basket.Images.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user  click  on submit Btn")
    public void step34() throws InterruptedException {
        basket.Submit.click();
        Thread.sleep(Duration.ofSeconds(4));


        //1- message content or equal "The title en field is mandatory. ".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.id("swal2-html-container")).getText();
        soft.assertTrue(actualMsg.contains("The title en field is mandatory. "),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The title en field is mandatory. "
        );
    }

    @When("User   choose   product  type")
    public void step35() throws InterruptedException {
        basket.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));

        basket.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   enter  search product")
    public void step36() throws InterruptedException {
        basket.searchProduct1.sendKeys("Honey");
        Thread.sleep(Duration.ofSeconds(2));
        basket.searchProduct2.click();
        Thread.sleep(Duration.ofSeconds(4));

        basket.searchProduct1.sendKeys("apple");
        Thread.sleep(Duration.ofSeconds(2));
        basket.searchProduct3.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   choose  Promotion Period")
    public void step37() throws InterruptedException {
        basket.Period.click();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(basket.StartDate).perform();
        action.click(basket.StartDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        basket.EndDate1.click();
        Thread.sleep(Duration.ofSeconds(2));
        action.moveToElement(basket.EndDate2).perform();
        action.click(basket.EndDate2).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user   enter Return  Time Limit")
    public void step38() throws InterruptedException {
        basket.Time1.click();
        Thread.sleep(Duration.ofSeconds(2));
        basket.Time2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  Title En")
    public void step39() throws InterruptedException {
        basket.En.sendKeys("Honey");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("Keep Title Ar is an empty")
    public void step40() throws InterruptedException {
        basket.Ar.sendKeys("");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   enter  Main image")
    public void step41() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", basket.MainImage);
        basket.MainImage.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   input  images")
    public void step42() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", basket.Images);
        basket.Images.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   click  on submit Btn")
    public void step43() throws InterruptedException {
        basket.Submit.click();
        Thread.sleep(Duration.ofSeconds(4));


        //1- message content or equal "The title ar field is mandatory.".
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.id("swal2-html-container")).getText();
        soft.assertTrue(actualMsg.contains("The title ar field is mandatory."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The title ar field is mandatory. "
        );
    }

    @When("User   choose   product   type")
    public void step44() throws InterruptedException {
        basket.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));

        basket.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   enter  search  product")
    public void step45() throws InterruptedException {
        basket.searchProduct1.sendKeys("Honey");
        Thread.sleep(Duration.ofSeconds(2));
        basket.searchProduct2.click();
        Thread.sleep(Duration.ofSeconds(4));

        basket.searchProduct1.sendKeys("apple");
        Thread.sleep(Duration.ofSeconds(2));
        basket.searchProduct3.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   choose  Promotion  Period")
    public void step46() throws InterruptedException {
        basket.Period.click();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(basket.StartDate).perform();
        action.click(basket.StartDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        basket.EndDate1.click();
        Thread.sleep(Duration.ofSeconds(2));
        action.moveToElement(basket.EndDate2).perform();
        action.click(basket.EndDate2).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("user   enter Return  Time  Limit")
    public void step47() throws InterruptedException {
        basket.Time1.click();
        Thread.sleep(Duration.ofSeconds(2));
        basket.Time2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user  enter  Title  En")
    public void step48() throws InterruptedException {
        basket.En.sendKeys("Honey");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   enter Title AR")
    public void step49() throws InterruptedException {
        basket.Ar.sendKeys("عسل");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   enter  Main  image")
    public void step50() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", basket.MainImage);
        basket.MainImage.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   input   images")
    public void step51() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", basket.Images);
        basket.Images.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("keep quantity from first product is an empty")
    public void step52() throws InterruptedException {
        basket.quantity1.clear();
        Thread.sleep(Duration.ofSeconds(1));
        basket.quantity1.sendKeys("0");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user enter from last product quantity")
    public void step53() throws InterruptedException {
        basket.quantity2.clear();
        Thread.sleep(Duration.ofSeconds(1));
        basket.quantity2.sendKeys("2");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user   click  on submit  Btn")
    public void step54() throws InterruptedException {
        basket.Submit.click();
        Thread.sleep(Duration.ofSeconds(4));
    }

    @When("User   Choose   product   type")
    public void step55() throws InterruptedException {
        basket.productType1.click();
        Thread.sleep(Duration.ofSeconds(2));

        basket.productType2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("User   enter  search  product")
    public void step56() throws InterruptedException {
        basket.searchProduct1.sendKeys("Honey");
        Thread.sleep(Duration.ofSeconds(2));
        basket.searchProduct2.click();
        Thread.sleep(Duration.ofSeconds(4));

        basket.searchProduct1.sendKeys("apple");
        Thread.sleep(Duration.ofSeconds(2));
        basket.searchProduct3.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("User   choose  Promotion  Period")
    public void step57() throws InterruptedException {
        basket.Period.click();
        Thread.sleep(Duration.ofSeconds(2));

        action.moveToElement(basket.StartDate).perform();
        action.click(basket.StartDate).perform();
        Thread.sleep(Duration.ofSeconds(2));

        basket.EndDate1.click();
        Thread.sleep(Duration.ofSeconds(2));
        action.moveToElement(basket.EndDate2).perform();
        action.click(basket.EndDate2).perform();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @When("User   enter Return  Time  Limit")
    public void step58() throws InterruptedException {
        basket.Time1.click();
        Thread.sleep(Duration.ofSeconds(2));
        basket.Time2.click();
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("User  enter  Title  En")
    public void step59() throws InterruptedException {
        basket.En.sendKeys("Honey");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("User   enter Title AR")
    public void step60() throws InterruptedException {
        basket.Ar.sendKeys("عسل");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("User   enter  Main  image")
    public void step61() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", basket.MainImage);
        basket.MainImage.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("User   input   images")
    public void step62() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", basket.Images);
        basket.Images.sendKeys("C:\\Users\\Fabrica Dev\\Pictures\\iTop Screenshot\\HumHum\\4.jpg");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("user enter quantity from first product")
    public void step63() throws InterruptedException {
        basket.quantity1.clear();
        Thread.sleep(Duration.ofSeconds(1));
        basket.quantity1.sendKeys("1");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("User enter from last product quantity")
    public void step64() throws InterruptedException {
        basket.quantity2.clear();
        Thread.sleep(Duration.ofSeconds(1));
        basket.quantity2.sendKeys("3");
        Thread.sleep(Duration.ofSeconds(4));
    }

    @And("User   click  on submit  Btn")
    public void step65() throws InterruptedException {
        basket.Submit.click();
        Thread.sleep(Duration.ofSeconds(4));
    }
}
