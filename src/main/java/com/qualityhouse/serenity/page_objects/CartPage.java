package com.qualityhouse.serenity.page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php?controller=order")
public class CartPage extends PageObject {

    public static final By PRODUCT_UNIT_PRICE = By.xpath("//td[@class = 'cart_unit']//span");
    public static final By PRODUCT_QUANTITY = By.cssSelector(".cart_quantity_input");
    public static final By PRODUCT_TOTAL_SHIPPING = By.id("total_shipping");
    public static final By PRODUCT_TOTAL_TAX = By.id("total_tax");
    public static final By PRODUCT_TOTAL_PRICE = By.id("total_price");
    public static final By PRODUCT_NAME = By.cssSelector("td.cart_description > p:nth-child(1)");
    public static final By TOTAL_PRODUCT_PRICE = By.id("total_product");


    @FindBy(css = "td.cart_description > p:nth-child(1)")
    public WebElementFacade productNameCart;

    @FindBy(css = ".cart_quantity_input")
    public WebElementFacade quantityField;

    @FindBy(xpath = "//td[@class = 'cart_unit']//span")
    public WebElementFacade unitPrice;

    @FindBy(id = "total_shipping")
    public WebElementFacade priceOfShipping;

    @FindBy(id = "total_tax")
    public WebElementFacade totalTaxPrice;

    @FindBy(id = "total_product")
    public WebElementFacade totalProductPrice;

    @FindBy(id = "total_price")
    public WebElementFacade totalPrice;

}
