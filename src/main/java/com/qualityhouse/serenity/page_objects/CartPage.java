package com.qualityhouse.serenity.page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

    @FindBy(linkText = "Faded Short Sleeve T-shirts")
    public WebElementFacade productName;

    @FindBy(css = ".cart_quantity_input")
    public WebElementFacade quantityField;

    @FindBy(xpath = "//td[@class = 'cart_unit']//span")
    public WebElementFacade unitPrice;

    @FindBy(id = "total_shipping")
    public WebElementFacade priceOfShipping;

    @FindBy(id = "total_tax")
    public WebElementFacade totalTaxPrice;

    @FindBy(id = "total_price")
    public WebElementFacade totalPrice;

}
