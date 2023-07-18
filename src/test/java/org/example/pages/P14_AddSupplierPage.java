package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.stepDefs.Hooks.driver;
public class P14_AddSupplierPage {

    public P14_AddSupplierPage ()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    public WebElement Mail;

    @FindBy (id = "password")
    public WebElement Pass;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement sub;

    @FindBy (className = "header")
    public WebElement head;

    @FindBy (css = "span[class=\"mat-expansion-indicator ng-tns-c39-8 ng-trigger ng-trigger-indicatorRotate ng-star-inserted\"]")
    public WebElement sup;

    @FindBy (css = "div div[class=\"mat-expansion-panel-body ng-tns-c38-7\"] div[class=\"router-item p-3 pe-0 dark_color ng-star-inserted\"]:nth-child(1) span")
    public WebElement supp;

    @FindBy (css = "div[class=\"col-md-6 col-lg-3\"] app-statistic-cards a div div:nth-child(2) div[class=\"font-size-sm fw-500 text-uppercase text-muted\"]")
    public WebElement AddSup;

    @FindBy (id = "first_name")
    public WebElement First;

    @FindBy (id = "last_name")
    public WebElement Last;

    @FindBy (id = "company_name_en")
    public WebElement compNameEn;

    @FindBy (id = "company_name_ar")
    public WebElement compNameAr;

    @FindBy (css = "ng-select[id=\"selling_for\"] span[class=\"ng-arrow-wrapper\"]")
    public WebElement sell1;

    @FindBy (css = "div[class=\"ng-dropdown-panel-items scroll-host\"] div div:nth-child(3)")
    public WebElement sell2;

    @FindBy (id = "job_title")
    public WebElement title;

    @FindBy (css = "input[type=\"email\"]")
    public WebElement em;

    @FindBy (css = "ng-select[id=\"country_code\"] div span[class=\"ng-arrow-wrapper\"]")
    public WebElement code1;

    @FindBy (css = "div[class=\"ng-dropdown-panel-items scroll-host\"] div div:nth-child(64)")
    public WebElement code2;

    @FindBy (css = "input[type=\"number\"]")
    public WebElement mobile;

    @FindBy (id = "password")
    public WebElement Password;

    @FindBy (id = "password_confirmation")
    public WebElement confirmPass;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement Save;
}
