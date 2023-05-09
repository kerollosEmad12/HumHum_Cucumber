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

    @FindBy (css = "button[class=\"mfp-close\"] svg")
    public WebElement popup1;

    @FindBy (className = "product-cart")
    public WebElement product;

    @FindBy (css = "div h4 a[href=\"/humhum-user/details?id=574&type=Buy%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%202%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20Get%201\"]")
    public WebElement cart;

    @FindBy (css = "button[class=\"btn br-5 btn btn-loght border-0 outline-none shadow-none d-block add-cart cart-btn btn-secondary\"]")
    public WebElement cart2;

    @FindBy (css = "button[class=\"btn dark event-btn view-cart\"]")
    public WebElement view;

    @FindBy (css = "div[class=\"method cach\"] input[class=\"custom-control-input\"]+label")
    public WebElement cash;

    @FindBy (css = "div[class=\"terms my-4 d-inline-block custom-input custom-control custom-checkbox\"] input[type=\"checkbox\"]+label")
    public WebElement checkbox;

    @FindBy (css = "div[class=\"checkout\"] button[type=\"submit\"]")
    public WebElement checkout;
}
