package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.stepDefs.Hooks.driver;

public class P01_HomePage {

    public P01_HomePage ()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "mfp-close")
    public WebElement popup;

    @FindBy (css = "div[class=\"login collapsed\"]")
    public WebElement registerTab;
}
