package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.stepDefs.Hooks.driver;
public class P03_LoginPage {

    public P03_LoginPage ()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "input[type=\"email\"]")
    public WebElement email;

    @FindBy (css = "input[type=\"password\"]")
    public WebElement pass;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement Btn;
}
