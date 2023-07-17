package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.stepDefs.Hooks.driver;

public class P13_AddBuyerPage {

    public P13_AddBuyerPage ()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "email")
    public WebElement Mail;

    @FindBy (id = "password")
    public WebElement Pass;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement sub;

    @FindBy (className = "header")
    public WebElement head;

    @FindBy (css = "mat-expansion-panel mat-expansion-panel-header span[class=\"mat-content ng-tns-c39-16\"]")
    public WebElement buyer;

    @FindBy (css = "div[class=\"mat-expansion-panel-body ng-tns-c38-15\"] div:nth-child(1) span")
    public WebElement b2b;

    @FindBy (css = "div[class=\"actions text-end my-3\"] button")
    public WebElement ADD;

    @FindBy (css = " input[formcontrolname=\"first_name\"]")
    public WebElement first;

    @FindBy (css = " input[formcontrolname=\"last_name\"]")
    public WebElement last;

    @FindBy (css = " input[formcontrolname=\"email\"]")
    public WebElement E;

    @FindBy (css = " input[formcontrolname=\"company_name_en\"]")
    public WebElement name_En;

    @FindBy (css = " input[formcontrolname=\"company_name_ar\"]")
    public WebElement name_AR;

    @FindBy (css = "input[formcontrolname=\"job_title\"]")
    public WebElement job;

    @FindBy (css = "input[formcontrolname=\"mobile_number\"]")
    public WebElement num;

    @FindBy (css = "input[formcontrolname=\"password\"]")
    public WebElement Password;

    @FindBy (css = "input[formcontrolname=\"password_confirmation\"]")
    public WebElement conPass;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement save;
}
