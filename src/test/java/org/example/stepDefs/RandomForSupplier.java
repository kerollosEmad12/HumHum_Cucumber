package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P08_RandomForSupplierPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static org.example.stepDefs.Hooks.driver;

public class RandomForSupplier {

    P08_RandomForSupplierPage rand = new P08_RandomForSupplierPage();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("user   enter to supplier page")
    public void Step1()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-supplier/auth/login");
    }

    @And("user   enter Email")
    public void Step2() throws InterruptedException {
        rand.mail.sendKeys("m.elzoghbi24@gmail.com");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   enter pass")
    public void Step3() throws InterruptedException {
        rand.pass.sendKeys("Asd12312");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   click on login")
    public void Step4() throws InterruptedException {
        js.executeScript("arguments[0].click();", rand.login);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @And("user   change language")
    public void Step5() throws InterruptedException {
        js.executeScript("arguments[0].click();", rand.language);
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Then("user choose random list and click")
    public void Step6() throws InterruptedException {
        List<WebElement> mainLinks = driver.findElements(By.cssSelector("mat-sidenav div[class=\"w-100 ng-tns-c147-1\"] ul"));
        Random rand = new Random();
        int randomIndex = rand.nextInt(mainLinks.size());
        Actions action = new Actions(driver);
        System.out.println(mainLinks.get(3).getText());
        int count = mainLinks.size();     //3
        System.out.println(count);

        int min = 0;
        int max = count-1;
        int selectedUser =  (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(selectedUser);
        action.moveToElement(mainLinks.get(randomIndex)).click().perform();
        Thread.sleep(2000);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
