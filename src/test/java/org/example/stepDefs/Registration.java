package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_HomePage;
import org.example.pages.P02_RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;
public class Registration {
    public static String globalEmail;
    P01_HomePage home = new P01_HomePage();
    P02_RegisterPage register = new P02_RegisterPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("user navigate to home page")

    public void step1 ()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("user click on login icon")
    public void step2() throws InterruptedException
    {
        Thread.sleep(Duration.ofSeconds(3));

        if (home.popup.isDisplayed())
        {
            js.executeScript("arguments[0].click();", home.popup);
        }

        //Open login icon
        js.executeScript("arguments[0].click();", home.registerTab);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user click on create account button")
    public void step3() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        js.executeScript("arguments[0].click();", register.create);

    }

    @When("user select title")
    public void step4()
    {
        js.executeScript("arguments[0].click();", register.title);
    }

    @And("user write first name and last name")
    public void step5() {
        //Input the first name
        register.firstName.sendKeys("Fabrica");
        //Input the last_name
        register.lastName.sendKeys("Dev");
    }

    @And("user enter valid email")
    public void step6()
    {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        register.email.sendKeys(globalEmail);
    }

    @And("user enter valid password and confirm password")
    public void step7() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(1));
        //Input the password
        register.pass.sendKeys("Fabrica123!");
        Thread.sleep(Duration.ofSeconds(1));
        //Input the Confirmation password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("select user country code")
    public void step8()
    {
        register.country.click();
    }

    @And("user enter valid phone number")
    public void step9()
    {
        register.phone.sendKeys("01125234573");
    }

    @And("mark on Subscribe to the Newsletter checkbox")
    public void step10()
    {
        js.executeScript("arguments[0].click();", register.box);
    }

    @Then("new account is created successfully")
    public void step11()
    {
        js.executeScript("arguments[0].click();", register.submit);
    }

    @Given("User navigate to home page")
    public void step12()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("user click on login Button")
    public void step13() throws InterruptedException
    {
        if (home.popup.isDisplayed())
        {
            home.popup.click();
        }

        //Open login icon
        home.registerTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user click on create account Btn")
    public void step14() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        register.create.click();
    }

    @When("User select title")
    public void step15()
    {
        register.title.click();
    }

    @And("user write first name with one character and valid last name")
    public void step16()
    {
        //Input the first name
        register.firstName.sendKeys("F");
        //Input the last_name
        register.lastName.sendKeys("CS");
    }

    @And("User enter valid email")
    public void step17()
    {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        register.email.sendKeys(globalEmail);
    }

    @And("User enter valid password and confirm password")
    public void step18()
    {
        //Input the password
        register.pass.sendKeys("Fabrica123!");
        //Input the Confirmation password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("Select user country code")
    public void step19()
    {
        register.country.click();
    }

    @And("User enter valid phone number")
    public void step20()
    {
        register.phone.sendKeys("01274068946");
    }

    @And("Mark on Subscribe to the Newsletter checkbox")
    public void step21()
    {
        js.executeScript("arguments[0].click();", register.box);
    }

    @Then("New account is created successfully")
    public void step22()
    {
        js.executeScript("arguments[0].click();", register.submit);

        //1- message content or equal "First name is mandatory
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"col-lg-5\"] fieldset[class=\"form-group\"] div[class=\"error\"]")).getText();
        soft.assertTrue(actualMsg.contains("First name is mandatory"),
        "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"First name is mandatory"
        );

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"col-lg-5\"] fieldset[class=\"form-group\"] div[class=\"error\"]")).getCssValue("    --main-color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#EF4923");

        soft.assertAll();
    }

    @Given("user Navigate to home page")
    public void step23()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("user Click on login Button")
    public void step24() throws InterruptedException
    {
        if (home.popup.isDisplayed())
        {
            home.popup.click();
        }

        //Open login icon
        home.registerTab.click();
        Thread.sleep(Duration.ofSeconds(3));

    }

    @And("user Click on create account Btn")
    public void step25() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        register.create.click();
    }

    @When("User Select title")
    public void step26()
    {
        register.title.click();
    }

    @And("user write first name two one character and valid last name")
    public void step27()
    {
        //Input the first name
        register.firstName.sendKeys("Fa");
        //Input the last_name
        register.lastName.sendKeys("CS");
    }

    @And("User Enter valid email")
    public void step28()
    {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        register.email.sendKeys(globalEmail);
    }

    @And("User Enter valid password and confirm password")
    public void step29()
    {
        //Input the password
        register.pass.sendKeys("Fabrica123!");
        //Input the Confirmation password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("Select User country code")
    public void step30()
    {
        register.country.click();
    }

    @And("User Enter valid phone number")
    public void step31()
    {
        register.phone.sendKeys("01274068946");
    }

    @And("Mark on subscribe to the Newsletter checkbox")
    public void step32()
    {
        js.executeScript("arguments[0].click();", register.box);
    }

    @Then("New Account is created successfully")
    public void step33()
    {
        js.executeScript("arguments[0].click();", register.submit);
    }

    @Given("stepA user Navigate to home page")
    public void step34()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("stepB user Click on login Button")
    public void step35() throws InterruptedException
    {
        if (home.popup.isDisplayed())
        {
            js.executeScript("arguments[0].click();", home.popup);
        }

        //Open login icon
        home.registerTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("stepC user Click on create account Btn")
    public void step36() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button

        synchronized (driver){
            driver.wait(10000);
        }
        register.create.click();
    }

    @When("stepD User Select title")
    public void step37()
    {
        register.title.click();
    }

    @And("stepE user write valid first name and last name is an empty")
    public void step38()
    {
        //Input the first name
        register.firstName.sendKeys("Fabrica");
        //Input the last_name
        register.lastName.sendKeys("");
    }

    @And("stepF User Enter valid email")
    public void step39()
    {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        register.email.sendKeys(globalEmail);
    }

    @And("stepG User Enter valid password and confirm password")
    public void step40()
    {
        //Input the password
        register.pass.sendKeys("Fabrica123!");
        //Input the Confirmation password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("stepH Select User country code")
    public void step41()
    {
        register.country.click();
    }

    @And("stepI User Enter valid phone number")
    public void step42()
    {
        register.phone.sendKeys("01274068946");
    }

    @And("stepJ Mark on subscribe to the Newsletter checkbox")
    public void step43()
    {
        js.executeScript("arguments[0].click();", register.box);
    }

    @Then("stepK New Account is created successfully")
    public void step44()
    {
        js.executeScript("arguments[0].click();", register.submit);
    }

    @Given("step[A] user Navigate to home page")
    public void step45()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("step[B] user Click on login Button")
    public void step46() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        if (home.popup.isDisplayed())
        {
            home.popup.click();
        }

        //Open login icon
        home.registerTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[C] user Click on create account Btn")
    public void step47() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        register.create.click();
    }

    @When("step[D] User Select title")
    public void step48()
    {
        register.title.click();
    }

    @And("step[E] user write valid first name and valid last name")
    public void step49()
    {
        //Input the first name
        register.firstName.sendKeys("Fabrica");
        //Input the last_name
        register.lastName.sendKeys("Dev");
    }

    @And("step[F] User keep email is an empty")
    public void step50()
    {
        register.email.sendKeys("");
    }

    @And("step[G] User Enter valid password and confirm password")
    public void step51()
    {
        //Input the password
        register.pass.sendKeys("Fabrica123!");
        //Input the Confirmation password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("step[H] Select User country code")
    public void step52()
    {
        register.country.click();
    }

    @And("step[I] User Enter valid phone number")
    public void step53()
    {
        register.phone.sendKeys("01274068946");
    }

    @And("step[J] Mark on subscribe to the Newsletter checkbox")
    public void step54() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type=\"checkbox\"]+label")));
        js.executeScript("arguments[0].click();", register.box);
        synchronized (driver){
            driver.wait(10000);
        }
    }

    @Then("step[K] New Account is created successfully")
    public void step55() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));;
        js.executeScript("arguments[0].click();", register.submit);
    }

    @Given("Step[A] user Navigate to home page")
    public void step56()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("Step[B] user Click on login Button")
    public void step57() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        if (home.popup.isDisplayed())
        {
            home.popup.click();
        }

        //Open login icon
        home.registerTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("Step[C] user Click on create account Btn")
    public void step58() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        register.create.click();
    }

    @When("Step[D] User Select title")
    public void step59()
    {
        register.title.click();
    }

    @And("Step[E] user write valid first name and valid last name")
    public void step60()
    {
        //Input the first name
        register.firstName.sendKeys("Fabrica");
        //Input the last_name
        register.lastName.sendKeys("Dev");
    }

    @And("step[F] User keep email is invalid Email format")
    public void step61()
    {
        register.email.sendKeys("Test23@.gmail");
    }

    @And("Step[G] User Enter valid password and confirm password")
    public void step62()
    {
        //Input the password
        register.pass.sendKeys("Fabrica123!");
        //Input the Con password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("Step[H] Select User country code")
    public void step63()
    {
        register.country.click();
    }

    @And("Step[I] User Enter valid phone number")
    public void step64()
    {
        register.phone.sendKeys("01274068946");
    }

    @And("Step[J] Mark on subscribe to the Newsletter checkbox")
    public void step65() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type=\"checkbox\"]+label")));
        js.executeScript("arguments[0].click();", register.box);
        synchronized (driver){
            driver.wait(10000);
        }
    }

    @Then("Step[K] New Account is created successfully")
    public void step67() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));
        register.submit.click();
    }

    @Given("STep[A] user Navigate to home page")
    public void step68()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("STep[B] user Click on login Button")
    public void step69() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        if (home.popup.isDisplayed())
        {
            home.popup.click();
        }

        //Open login icon
        home.registerTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("STep[C] user Click on create account Btn")
    public void step70() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        register.create.click();
    }

    @When("STep[D] User Select title")
    public void step71()
    {
        register.title.click();
    }

    @And("STep[E] user write valid first name and valid last name")
    public void step72()
    {
        //Input the first name
        register.firstName.sendKeys("Fabrica");
        //Input the last_name
        register.lastName.sendKeys("Dev");
    }

    @And("step[F] User keep email is already registered in the database")
    public void step73()
    {
        register.email.sendKeys("kerolos@gamil.com");
    }

    @And("STep[G] User Enter valid password and confirm password")
    public void step74()
    {
        //Input the password
        register.pass.sendKeys("Fabrica123!");
        //Input the Con password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("STep[H] Select User country code")
    public void step75()
    {
        register.country.click();
    }

    @And("STep[I] User Enter valid phone number")
    public void step76()
    {
        register.phone.sendKeys("01274068946");
    }

    @And("STep[J] Mark on subscribe to the Newsletter checkbox")
    public void step77() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div>input[type=\"checkbox\"]+label")));
        js.executeScript("arguments[0].click();", register.box);
        synchronized (driver){
            driver.wait(10000);
        }

    }

    @Then("STep[K] New Account is created successfully")
    public void step78() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));
        js.executeScript("arguments[0].click();", register.submit);
    }

    @Given("STEp[A] user Navigate to home page")
    public void step79()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("STEp[B] user Click on login Button")
    public void step80() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        if (home.popup.isDisplayed())
        {
            home.popup.click();
        }
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        register.firstName.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("STEp[C] user Click on create account Btn")
    public void step81() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        register.create.click();
    }

    @When("STEp[D] User Select title")
    public void step82()
    {
        register.title.click();
    }

    @And("STEp[E] user write valid first name and valid last name")
    public void step83()
    {
        //Input the first name
        register.firstName.sendKeys("Fabrica");
        //Input the last_name
        register.lastName.sendKeys("Dev");
    }

    @And("Step[F] User enter valid email")
    public void step84()
    {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        register.email.sendKeys(globalEmail);
    }

    @And("STep[G] User Enter password with seven character and valid confirm password")
    public void step85()
    {
        //Input the password
        register.pass.sendKeys("Fabri1!");
        //Input the Confirmation password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("STEp[H] Select User country code")
    public void step86()
    {;
        register.country.click();
    }

    @And("STEp[I] User Enter valid phone number")
    public void step87()
    {
        register.phone.sendKeys("01274068946");
    }

    @And("STEp[J] Mark on subscribe to the Newsletter checkbox")
    public void step88() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div>input[type=\"checkbox\"]+label")));
        js.executeScript("arguments[0].click();", register.box);
        synchronized (driver){
            driver.wait(10000);
        }
    }

    @Then("STEp[K] New Account is created successfully")
    public void step89() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));
        js.executeScript("arguments[0].click();", register.submit);
    }


    @Given("STEP[A] user Navigate to home page")
    public void step90()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("STEP[B] user Click on login Button")
    public void step91() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        if (home.popup.isDisplayed())
        {
            home.popup.click();
        }
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        home.registerTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("STEP[C] user Click on create account Btn")
    public void step92() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        register.create.click();
    }


    @When("STEP[D] User Select title")
    public void step93()
    {
        register.title.click();
    }

    @And("STEP[E] user write valid first name and valid last name")
    public void step94()
    {
        //Input the first name
        register.firstName.sendKeys("Fabrica");
        //Input the last_name
        register.lastName.sendKeys("Dev");
    }

    @And("STep[F] User enter valid email")
    public void step95()
    {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        register.email.sendKeys(globalEmail);
    }

    @And("STep[G] User Enter password without special character and valid confirm password")
    public void step96()
    {
        //Input the password
        register.pass.sendKeys("Fabrica1234");
        //Input the Confirmation password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("STEP[H] Select User country code")
    public void step97()
    {
        register.country.click();
    }

    @And("STEP[I] User Enter valid phone number")
    public void step98()
    {
        register.phone.sendKeys("01274068946");
    }

    @And("STEP[J] Mark on subscribe to the Newsletter checkbox")
    public void step99() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div>input[type=\"checkbox\"]+label")));
        js.executeScript("arguments[0].click();", register.box);
        synchronized (driver){
            driver.wait(10000);
        }
    }

    @Then("STEP[K] New Account is created successfully")
    public void step100() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));
        js.executeScript("arguments[0].click();", register.submit);
    }

    @Given("STEP[A] User Navigate to home page")
    public void step101()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("STEP[B] User Click on login Button")
    public void step102() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        if (home.popup.isDisplayed())
        {
            home.popup.click();
        }
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        home.registerTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("STEP[C] User Click on create account Btn")
    public void step103() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        register.create.click();
    }

    @When("STEP[D] User Select Title")
    public void step104()
    {
        register.title.click();
    }

    @And("STEP[E] User write valid first name and valid last name")
    public void step105()
    {
        //Input the first name
        register.firstName.sendKeys("Fabrica");
        //Input the last_name
        register.lastName.sendKeys("Dev");
    }

    @And("STep[F] User Enter valid email")
    public void step106()
    {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        register.email.sendKeys(globalEmail);
    }

    @And("STep[G] User Enter password without Uppercase Letter and valid confirm password")
    public void step107()
    {
        //Input the password
        register.pass.sendKeys("fabrica123!");
        //Input the Confirmation password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("STEP[H] Select User Country code")
    public void step108()
    {
        register.country.click();
    }

    @And("STEP[I] User Enter Valid phone number")
    public void step109()
    {
        register.phone.sendKeys("01274068946");
    }

    @And("STEP[J] Mark On subscribe to the Newsletter checkbox")
    public void step110() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div>input[type=\"checkbox\"]+label")));
        js.executeScript("arguments[0].click();", register.box);
        synchronized (driver){
            driver.wait(10000);
        }
    }

    @Then("STEP[K] New Account Is created successfully")
    public void step111() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));
        js.executeScript("arguments[0].click();", register.submit);
    }

    @Given("STEP[A] User Navigate To home page")
    public void step112()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("STEP[B] User Click On login Button")
    public void step113() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        if (home.popup.isDisplayed())
        {
            home.popup.click();
        }
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        home.registerTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("STEP[C] User Click On create account Btn")
    public void step114() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        register.create.click();
    }

    @When("STEP[d] User Select Title")
    public void step115()
    {
        register.title.click();
    }

    @And("STEP[E] User Write valid first name and valid last name")
    public void step116()
    {
        //Input the first name
        register.firstName.sendKeys("Fabrica");
        //Input the last_name
        register.lastName.sendKeys("Dev");
    }

    @And("STEp[F] User Enter valid email")
    public void step117()
    {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();;
        register.email.sendKeys(globalEmail);
    }

    @And("STep[G] User Enter password without number and valid confirm password")
    public void step118()
    {
        //Input the password
        register.pass.sendKeys("Fabrica!");
        //Input the Confirmation password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("STEP[H] Select User Country Code")
    public void step119()
    {
        register.country.click();
    }

    @And("STEP[I] User Enter Valid Phone number")
    public void step120()
    {
        register.phone.sendKeys("01274068946");
    }

    @And("STEP[J] Mark On Subscribe to the Newsletter checkbox")
    public void step121() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div>input[type=\"checkbox\"]+label")));
        js.executeScript("arguments[0].click();", register.box);
        synchronized (driver){
            driver.wait(10000);
        }
    }

    @Then("STEP[K] New Account Is Created successfully")
    public void step122() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));
        js.executeScript("arguments[0].click();", register.submit);
    }

    @Given("STEP[A] User Navigate To Home page")
    public void step123()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("STEP[B] User Click On Login Button")
    public void step124() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        if (home.popup.isDisplayed())
        {
            home.popup.click();
        }
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        home.registerTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("STEP[C] User Click On Create account Btn")
    public void step125() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        register.create.click();
    }

    @When("STEP[d] USER Select Title")
    public void step126()
    {
        register.title.click();
    }

    @And("STEP[E] User Write Valid first name and valid last name")
    public void step127()
    {
        //Input the first name
        register.firstName.sendKeys("Fabrica");
        //Input the last_name
        register.lastName.sendKeys("Dev");
    }

    @And("STEp[F] User Enter Valid email")
    public void step128()
    {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        register.email.sendKeys(globalEmail);
    }

    @And("STep[G] User Enter valid password and valid confirm password")
    public void step129()
    {
        //Input the password
        register.pass.sendKeys("Fabrica123!");
        //Input the Confirmation password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("STEP[H] User select invalid county code")
    public void step130()
    {
        register.country.click();
    }

    @And("STEP[I] User Enter Valid Phone Number")
    public void step131()
    {
        register.phone.sendKeys("01274068946");
    }

    @And("STEP[J] Mark On Subscribe to the Newsletter Checkbox")
    public void step132() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div>input[type=\"checkbox\"]+label")));
        js.executeScript("arguments[0].click();", register.box);
        synchronized (driver){
            driver.wait(10000);
        }
    }

    @Then("STEP[K] New Account Is Created Successfully")
    public void step133() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));
        js.executeScript("arguments[0].click();", register.submit);
    }

    @Given("STEP[A] User Navigate To Home Page")
    public void step134()
    {
        driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
    }

    @And("STEP[B] User Click On Login button")
    public void step135() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        if (home.popup.isDisplayed())
        {
            home.popup.click();
        }
        Thread.sleep(Duration.ofSeconds(10));

        //Open login icon
        home.registerTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("STEP[C] User Click On Create Account Btn")
    public void step136() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/humhum-user/user-register\"]")));
        //Click on account button
        synchronized (driver){
            driver.wait(10000);
        }
        register.create.click();
    }

    @When("STEP[d] USER SELECT Title")
    public void step137()
    {
        register.title.click();
    }

    @And("STEP[E] User Write Valid First name and valid last name")
    public void step138()
    {
        //Input the first name
        register.firstName.sendKeys("Fabrica");
        //Input the last_name
        register.lastName.sendKeys("Dev");
    }

    @And("STEp[F] User Enter Valid Email")
    public void step139()
    {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        register.email.sendKeys(globalEmail);
    }

    @And("STep[G] User Enter valid Password and valid confirm password")
    public void step140()
    {
        //Input the password
        register.pass.sendKeys("Fabrica123!");
        //Input the Confirmation password
        register.ConfirmPass.sendKeys("Fabrica123!");
    }

    @When("STEP[H] User select valid County code")
    public void step141()
    {
        register.country.click();
    }

    @And("STEP[I] User Enter inValid Phone Number format")
    public void step142()
    {
        register.phone.sendKeys("0127406");
    }

    @And("STEP[J] Mark On Subscribe To the Newsletter Checkbox")
    public void step143() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div>input[type=\"checkbox\"]+label")));
        js.executeScript("arguments[0].click();", register.box);
        synchronized (driver){
            driver.wait(10000);
        }
    }

    @Then("STEP[K] New Account IS Created Successfully")
    public void step144() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));
        js.executeScript("arguments[0].click();", register.submit);
    }
}
