package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P05_AddAddressFCheckPage {

    public P05_AddAddressFCheckPage()
    {
        PageFactory.initElements(driver , this);
    }

    @FindBy (xpath = "//input[@type=\"email\"]")
    public WebElement mail;

    @FindBy (css = "input[type=\"password\"]")
    public WebElement password;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement submit;

    @FindBy (css = "div[class=\"cart d-flex justify-content-between align-items-center\"]")
    public WebElement cart;

    @FindBy (css = "div a[href=\"/humhum-user/cart\"]")
    public WebElement check;

    @FindBy (css = "label input[value=\"newAddress\"]")
    public WebElement label;

    @FindBy (css = "form[class=\"account-information-form\"] div[class=\"col-lg-4\"]:nth-of-type(1) select[class=\"custom-select\"]>option[value=\"2\"]")
    public WebElement country;

    @FindBy (css = "form[class=\"account-information-form\"] div[class=\"col-lg-4\"]:nth-of-type(2) select option[value=\"3\"]")
    public WebElement province;

    @FindBy (css = "form[class=\"account-information-form\"] div[class=\"col-lg-4\"]:nth-of-type(3) select option[value=\"null\"]")
    public WebElement city1;

    @FindBy (css = "form[class=\"account-information-form\"] div[class=\"col-lg-4\"]:nth-of-type(3) select option[value=\"6\"]")
    public WebElement city2;

    @FindBy (id = "street")
    public WebElement street;

    @FindBy (css = "form[class=\"account-information-form\"] div[class=\"col-lg-6\"]:nth-of-type(5) select[class=\"custom-select\"]>option[value=\"Office\"]")
    public WebElement name1;

    @FindBy (css = "form[class=\"account-information-form\"] div[class=\"col-lg-6\"]:nth-of-type(5) select[class=\"custom-select\"]>option[value=\"null\"]")
    public WebElement name2;

    @FindBy (id = "floor")
    public WebElement floor;

    @FindBy (id = "homeNumber")
    public WebElement homeNum;

    @FindBy (id = "postCode")
    public WebElement postCode;

    @FindBy (css = "button[class=\"btn login-button bg-main m-0 mt-4 py-3 px-5 text-white text-center w-auto btn-secondary\"]")
    public WebElement btn;
}
