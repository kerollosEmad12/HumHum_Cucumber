package org.example.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P09_AddBuyXGetYPage {

    public P09_AddBuyXGetYPage()
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

    @FindBy (css = "mat-sidenav div div:nth-child(3) li:nth-child(5) ul li:nth-child(3) a")
    public WebElement BuyXBtn;

    @FindBy (css = "a[href=\"/humhum-supplier/buy-get-promotions/add\"]")
    public WebElement add;

    @FindBy (css = "ng-select[id=\"product_type\"] div span:nth-child(2)")
    public WebElement productType1;

    @FindBy (css = "ng-dropdown-panel div div div:nth-child(2) span")
    public WebElement productType2;

    @FindBy (css = "ng-select[id=\"products_ids\"] div div:nth-child(2) input")
    public WebElement searchProduct1;

    @FindBy (css = "ng-dropdown-panel div div div:nth-child(3)")
    public WebElement searchProduct2;

    @FindBy (id = "buy_x")
    public WebElement inputBuyX;

    @FindBy (id = "get_y")
    public WebElement inputGetY;

    @FindBy (css = "div[class=\"col-12 mb-3\"] div:nth-child(3) button")
    public WebElement dateBtn;

    @FindBy (css = "div[class=\"ngb-dp-week ng-star-inserted\"]:nth-child(4) div:nth-child(4)")
    public WebElement startDate;

    @FindBy (css = "div[class=\"ngb-dp-week ng-star-inserted\"]:nth-child(6) div:nth-child(5)")
    public WebElement endDate;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement submit;

    @FindBy (css = "div[class=\"swal2-actions\"] button:nth-child(2)")
    public WebElement ok;
}
