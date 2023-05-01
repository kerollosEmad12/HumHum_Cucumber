package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {

    static WebDriver driver = null;

    @Before
    public void open_Browser ()
    {
        //Define System.property if needed

        //Additional Step: ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // 2- Initialize new object
        driver = new ChromeDriver(options);

        //3- Set Browser Config
        //3.1 maximize window
        driver.manage().window().maximize();

        //3.2 Set Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }

    @After
    public void quitDriver () throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        driver.quit();
    }
}
