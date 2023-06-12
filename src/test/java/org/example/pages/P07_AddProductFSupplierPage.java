package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P07_AddProductFSupplierPage {
    public P07_AddProductFSupplierPage()
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

    @FindBy (css = "mat-sidenav :nth-of-type(4) div:nth-child(1) div span")
    public WebElement pro;

    @FindBy (css = "mat-sidenav div div:nth-child(3) ul:nth-child(1) li:nth-child(4) ul li:nth-child(2) a")
    public WebElement list;

    @FindBy (css = "app-product-basic-form div div:nth-child(2) div div:nth-child(1) div ng-select div span:nth-child(3)")
    public WebElement category1;

    @FindBy (css = "ng-dropdown-panel div div:nth-child(23)")
    public WebElement category2;

    @FindBy (css = "app-product-basic-form div:nth-child(2) div div:nth-child(2) div ng-select div:nth-child(1) span:nth-child(2)")
    public WebElement subCategory1;

    @FindBy (css = "ng-dropdown-panel div div div:nth-child(4)")
    public WebElement subCategory2;

    @FindBy (css = "app-product-basic-form div:nth-child(2) div div:nth-child(3) div ng-select div:nth-child(1) span:nth-child(2)")
    public WebElement lastCategory1;

    @FindBy (css = "ng-dropdown-panel div div div:nth-child(2)")
    public WebElement lastCategory2;

    @FindBy (css = "app-product-basic-form div div:nth-child(2) div div:nth-child(5) div div ng-select div span:nth-child(3)")
    public WebElement brandName1;

    @FindBy (css = "ng-dropdown-panel div div div:nth-child(3)")
    public WebElement brandName2;

    @FindBy (id = "title_en")
    public  WebElement nameEN;

    @FindBy (id = "title_ar")
    public WebElement nameAR;

    @FindBy (css = "app-product-basic-form div div:nth-child(2) div div:nth-child(8) div ng-select div span:nth-child(3)")
    public WebElement productFrom1;

    @FindBy (css = "ng-dropdown-panel:nth-child(2) div div div:nth-child(69)")
    public WebElement productFrom2;

    @FindBy (css = "app-product-basic-form div div:nth-child(2) div div:nth-child(9) div ng-select div div span:nth-child(1)")
    public WebElement sellingCount1;

    @FindBy (css = "app-product-basic-form div div:nth-child(2) div div:nth-child(9) div ng-select span:nth-child(2)")
    public WebElement sellingCount2;

    @FindBy (css = "ng-dropdown-panel div div div:nth-child(65)")
    public WebElement sellingCount3;

    @FindBy (css = "app-product-basic-form div div:nth-child(2) div div:nth-child(10) div input")
    public WebElement DynamicInput;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement save1;

    @FindBy (css = "div[class=\"swal2-container swal2-center swal2-backdrop-show\"] div:nth-child(15) button[class=\"swal2-confirm swal2-styled\"]")
    public WebElement ok1;

    @FindBy (css = "app-product-images-form div div:nth-child(2) div div:nth-child(1) ngx-dropzone input")
    public WebElement image1;

    @FindBy (css = "app-product-images-form div div:nth-child(2) div div:nth-child(2) ngx-dropzone input")
    public WebElement image2;

    @FindBy (css = "app-product-images-form div div button")
    public WebElement save2;

    @FindBy (css = "div[class=\"swal2-container swal2-center swal2-backdrop-show\"] div:nth-child(15) button[class=\"swal2-confirm swal2-styled\"]")
    public WebElement ok2;

    @FindBy (css = "div:nth-child(2) div div:nth-child(2) div input[id=\"b2bprice\"]")
    public WebElement priceB2B;

    @FindBy (id = "b2bweight")
    public WebElement weightB2B;

    @FindBy (id = "b2bunit_id")
    public WebElement unit1;

    @FindBy (css = "select[id=\"b2bunit_id\"] option:nth-child(2)")
    public WebElement unit2;

    @FindBy (id = "b2bquantity")
    public WebElement quantity;

    @FindBy (id = "b2bmin_order_quantity")
    public WebElement mainOrder;

    @FindBy (id = "b2balert_quantity")
    public WebElement lowStock;

    @FindBy (id = "b2breturn_time_id")
    public WebElement ReturnTime1;

    @FindBy (css = "select[id=\"b2breturn_time_id\"] option:nth-child(2)")
    public WebElement ReturnTime2;

    @FindBy (id = "b2bdelivery_time_id")
    public WebElement delivery1;

    @FindBy (css = "select[id=\"b2bdelivery_time_id\"] option:nth-child(2)")
    public WebElement delivery2;

    @FindBy (id = "b2bstatus")
    public WebElement ask;

    @FindBy (css = "app-product-meta-form:nth-child(1) div div button[type=\"submit\"]")
    public WebElement save3;
}

