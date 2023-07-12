package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.stepDefs.Hooks.driver;
public class P02_RegisterPage {

    public P02_RegisterPage ()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "a[href=\"/humhum-user/user-register\"]")
    public WebElement create;

    @FindBy (css = "input[type=\"text\"]")
    public WebElement firstName;

    @FindBy (css = "input[id=\"l-name\"]")
    public WebElement lastName;

    @FindBy (css = "input[id=\"email\"]")
    public WebElement email;

    @FindBy (css = "input[id=\"NewPassword\"]")
    public WebElement pass;

    @FindBy (css = "input[id=\"confirmPassword\"]")
    public WebElement ConfirmPass;

    @FindBy (css = "input[id=\"phone\"]")
    public WebElement phone;

    @FindBy (css = "div[class=\"py-3 custom-control custom-checkbox\"]>input[type=\"checkbox\"]+label ")
    public WebElement box;

    @FindBy (css = "div>button[type=\"submit\"]")
    public WebElement submit;
}
