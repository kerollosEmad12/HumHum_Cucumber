package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.stepDefs.Hooks.driver;

public class P06_CouponFromSupplierPage {

    public P06_CouponFromSupplierPage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "input[type=\"email\"]")
    public WebElement mail;

    @FindBy (id = "password")
    public WebElement pass;

    @FindBy (css = "button[class=\"btn btn-alt-primary\"]")
    public WebElement login;

    @FindBy (css = "div button[class=\"btn admin-btn ng-star-inserted\"]")
    public WebElement language;

    @FindBy (css = "mat-sidenav :nth-of-type(5) span[class=\"list-text ng-tns-c147-1 ng-star-inserted\"]")
    public WebElement market;

    @FindBy (css = "mat-sidenav div div:nth-child(3) ul li:nth-child(5) ul li:nth-child(2)")
    public WebElement Coup;

    @FindBy (css = "a[href=\"/humhum-supplier/coupons/add\"]")
    public WebElement add;


    @FindBy (css = "ng-select[id=\"coupon_type\"] div span[class=\"ng-arrow-wrapper\"]")
    public WebElement couponType1;

    @FindBy (css = "div[class=\"ng-dropdown-panel-items scroll-host\"] div:nth-of-type(2) div:nth-of-type(1)")
    public WebElement couponType2;

    @FindBy (css = "form div[class=\"col-12 mb-3\"]:nth-child(5) div input[type=\"text\"]")
    public WebElement client1;

    @FindBy (css = "div[class=\"ng-dropdown-panel-items scroll-host\"] div div:nth-child(1)")
    public WebElement client2;

    @FindBy (css = "ng-select[id=\"product_ids\"] div input")
    public WebElement product1;

    @FindBy (css = "form ng-dropdown-panel div:nth-child(2) div:nth-child(1) span")
    public WebElement product2;

    @FindBy (css = "form[class=\"row gx-3 ng-invalid ng-star-inserted ng-touched ng-dirty\"]")
    public WebElement form;

    @FindBy (id = "code")
    public WebElement code;

    @FindBy (css = "form:nth-of-type(1) div:nth-child(9) ng-select div span:nth-child(2)")
    public WebElement disType1;

    @FindBy (css = "form:nth-of-type(1) div:nth-child(9) ng-select ng-dropdown-panel div:nth-child(2) div:nth-child(1)")
    public WebElement disType2;

    @FindBy (id = "discount")
    public WebElement dis;

    @FindBy (id = "max_discount")
    public WebElement maxDis;

    @FindBy (id = "min_buy")
    public WebElement minDis;

    @FindBy (id = "count_of_use")
    public WebElement countUse;

    @FindBy (css = "form div:nth-child(14) div button")
    public WebElement startDate1;

    @FindBy (css = "form div:nth-child(14) ngb-datepicker div:nth-child(2) div ngb-datepicker-month div:nth-child(2) div:nth-child(6) div")
    public WebElement startDate2;

    @FindBy (css = "div[class=\"ngb-tp\"] div input")
    public WebElement startTime1;

    @FindBy (css = "div[class=\"ngb-tp\"] div:nth-child(3) input")
    public WebElement startTime2;

    @FindBy (css = "form div:nth-child(16) div button")
    public WebElement endDate1;

    @FindBy (css = "form div:nth-child(16) ngb-datepicker div:nth-child(2) div ngb-datepicker-month div:nth-child(6) div:nth-child(5) div")
    public WebElement endDate2;

    @FindBy (css = "div[class=\"col-6 mb-3\"] ngb-timepicker[id=\"end_time\"] input")
    public WebElement endTime1;

    @FindBy (css = "div[class=\"col-6 mb-3\"] ngb-timepicker[id=\"end_time\"] div[class=\"ngb-tp-input-container ngb-tp-minute\"] input")
    public WebElement endTime2;

    @FindBy (css = "input[id=\"promotion_flag\"]")
    public WebElement usePromotion;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement submit;
}
