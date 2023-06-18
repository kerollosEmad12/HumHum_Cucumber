package org.example.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import  static org.example.stepDefs.Hooks.driver;

public class P10_AddGiftFromSupplierPage {

    public P10_AddGiftFromSupplierPage ()
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

    @FindBy (css = "mat-sidenav div div:nth-child(3) li:nth-child(5) div div div")
    public WebElement markList;

    @FindBy (css = "mat-sidenav div div:nth-child(3) li:nth-child(5) ul li:nth-child(4) a")
    public WebElement getGift;

    @FindBy (css = "a[href=\"/humhum-supplier/buy-gift-promotions/add\"]")
    public WebElement add;

    @FindBy (css = "ng-select[id=\"product_type\"]")
    public WebElement productType1;

    @FindBy (css = "ng-dropdown-panel div div div:nth-child(2)")
    public WebElement productType2;

    @FindBy (css = "ng-select[id=\"buy_product_supplier_id\"] div div:nth-child(2) input")
    public WebElement buyProduct1;

    @FindBy (css = "ng-dropdown-panel div div div:nth-child(4)")
    public WebElement buyProduct2;

    @FindBy (css = "ng-select[id=\"gift_product_supplier_id\"] div div:nth-child(2) input")
    public WebElement giftProduct1;

    @FindBy (css = "ng-dropdown-panel div div div")
    public WebElement giftProduct2;

    @FindBy (id = "buy_x")
    public WebElement buyNumber;

    @FindBy (id = "gift_y")
    public WebElement giftNumber;

    @FindBy (css = "div[class=\"input-group\"]:nth-child(3) button")
    public WebElement Btn;

    @FindBy (css = "ngb-datepicker-month div[class=\"ngb-dp-week ng-star-inserted\"]:nth-child(4) div:nth-child(6)")
    public WebElement startDate;

    @FindBy (css = "ngb-datepicker-month div[class=\"ngb-dp-week ng-star-inserted\"]:nth-child(6) div:nth-child(5)")
    public WebElement endDate;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement done;

    @FindBy (css = "button[class=\"swal2-confirm swal2-styled\"]")
    public WebElement Ok;
}
