package org.example.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;
public class P11_AddBasketFromSupplierPage {

    public P11_AddBasketFromSupplierPage ()
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

    @FindBy (css = "mat-sidenav div div:nth-child(3) li:nth-child(5) ul li:nth-child(5) a")
    public WebElement Basket;

    @FindBy (css = "a[href=\"/humhum-supplier/basket-promotions/add\"]")
    public WebElement Add;

    @FindBy (css = "ng-select[id=\"product_type\"]")
    public WebElement productType1;

    @FindBy (css = "ng-dropdown-panel div:nth-child(2) div:nth-child(2)")
    public WebElement productType2;

    @FindBy (css = " ng-select[id=\"products_ids\"] div div input")
    public WebElement searchProduct1;

    @FindBy (css = "ng-dropdown-panel div div div")
    public WebElement searchProduct2;

    @FindBy (css = "ng-dropdown-panel div div div:nth-child(1)")
    public WebElement searchProduct3;

    @FindBy (css = "div[class=\"col-6 mb-3\"]:nth-child(3) div:nth-child(3) button")
    public WebElement Period;

    @FindBy (css = "div[class=\"ngb-dp-week ng-star-inserted\"]:nth-child(5) div:nth-child(2)")
    public WebElement StartDate;

    @FindBy (css = "div[class=\"ngb-dp-arrow right\"] button")
    public WebElement EndDate1;

    @FindBy (css = "div[class=\"ngb-dp-week ng-star-inserted\"]:nth-child(6) div:nth-child(7)")
    public WebElement EndDate2;

    @FindBy (id = "return_time_id")
    public WebElement Time1;

    @FindBy (css = "ng-dropdown-panel div div div:nth-child(1)")
    public WebElement Time2;

    @FindBy (id = "title_en")
    public WebElement En;

    @FindBy (id = "title_ar")
    public WebElement Ar;

    @FindBy (css = "ngx-dropzone[name=\"promotion_main_image\"] input")
    public WebElement MainImage;

    @FindBy (css = "ngx-dropzone[name=\"promotion_images\"] input")
    public WebElement Images;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement Submit;

    @FindBy(css = "div[class=\"swal2-actions\"] button[type=\"button\"]:nth-child(2)")
    public WebElement Ok;

    @FindBy (css = "div tbody tr td input[id=\"product_quantity_0\"]")
    public WebElement quantity1;

    @FindBy (id = "product_quantity_1")
    public WebElement quantity2;
}
