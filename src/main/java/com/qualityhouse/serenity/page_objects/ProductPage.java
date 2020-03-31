package com.qualityhouse.serenity.page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy(name = "Submit")
    public WebElementFacade addToCartButton;

    @FindBy(xpath = "//*[@title = 'Proceed to checkout']")
    public WebElementFacade proceedToCheckOutButton;

    @FindBy(css = ".layer_cart_product > h2:nth-child(2)")
    public WebElementFacade successNotification;

    @FindBy(id = "quantity_wanted")
    public WebElementFacade quantityField;

}
