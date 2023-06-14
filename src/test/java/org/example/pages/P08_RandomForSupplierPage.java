package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P08_RandomForSupplierPage {

    public P08_RandomForSupplierPage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[type=\"email\"]")
    public WebElement mail;

    @FindBy (id = "password")
    public WebElement pass;

    @FindBy (css = "button[class=\"btn btn-alt-primary\"]")
    public WebElement login;

    @FindBy (css = "div button[class=\"btn admin-btn ng-star-inserted\"]")
    public WebElement language;
}
