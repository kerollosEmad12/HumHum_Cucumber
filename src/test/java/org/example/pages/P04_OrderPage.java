package org.example.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.stepDefs.Hooks.driver;
public class P04_OrderPage {

    public P04_OrderPage()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "input[type=\"email\"]")
    public WebElement email;

    @FindBy (css = "input[type=\"password\"]")
    public WebElement pass;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement Btn;

    @FindBy (xpath = "(//*[@class=\"tab-pane active\"]//a//button)[2]")
    public WebElement cart;

    @FindBy (css = "button a[href=\"/humhum-user/cart\"]")
    public WebElement view;

    @FindBy (css = "input[class=\"my-2 h-100 p-3 w-100 itemInput\"]")
    public WebElement coupon;

    @FindBy (css = "button[class=\"btn login-button my-2 py-3 px-4 w-auto btn-secondary\"]")
    public WebElement apply;

    @FindBy (css = "div[class=\"method cach\"] input[class=\"custom-control-input\"]+label")
    public WebElement cash;

    @FindBy (css = "div[class=\"terms my-4 d-inline-block custom-input custom-control custom-checkbox\"] input[type=\"checkbox\"]+label")
    public WebElement checkbox;

    @FindBy (css = "div[class=\"checkout\"] button[type=\"submit\"]")
    public WebElement checkout;

    @FindBy (css = "button[class=\"btn btn-outline-success mt-4\"]")
    public WebElement orderList;
}
