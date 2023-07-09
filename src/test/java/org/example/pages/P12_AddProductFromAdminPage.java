package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import static org.example.stepDefs.Hooks.driver;

public class P12_AddProductFromAdminPage {
    public P12_AddProductFromAdminPage ()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "email")
    public WebElement Email;

    @FindBy (id = "password")
    public WebElement Pass;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement sign;

    @FindBy (className = "header")
    public WebElement header;

    @FindBy (css = "mat-expansion-panel mat-expansion-panel-header span[class=\"mat-content ng-tns-c39-6\"]")
    public WebElement pro;

    @FindBy (css = "div div[class=\"mat-expansion-panel-body ng-tns-c38-5\"] div:nth-child(3)")
    public WebElement addPro;

    @FindBy (css = "ng-select div div:nth-child(2) input")
    public WebElement supp1;

    @FindBy (css = "ng-dropdown-panel div div div:nth-child(2)")
    public WebElement supp2;

    @FindBy (name = "main_category_id")
    public WebElement cat1;

    @FindBy (css = "ng-dropdown-panel div div div:nth-child(12)")
    public WebElement cat2;

    @FindBy (name = "sub_category_id1")
    public WebElement subCat1;

    @FindBy (css = "ng-dropdown-panel div  div div:nth-child(2)")
    public WebElement subCat2;

    @FindBy (name = "sub_category_id2")
    public WebElement lastCat1;

    @FindBy (css = "ng-dropdown-panel div  div div:nth-child(2)")
    public WebElement lastCat2;

    @FindBy (id = "brand_id")
    public WebElement brand1;

    @FindBy (css = "ng-dropdown-panel div  div div")
    public WebElement brand2;

    @FindBy (id = "title_en")
    public WebElement En;

    @FindBy (id = "title_ar")
    public WebElement Ar;

    @FindBy (id = "country_id")
    public WebElement country1;

    @FindBy (css = "ng-dropdown-panel div  div div:nth-child(69)")
    public WebElement country2;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement save;
}
