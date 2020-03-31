package com.qualityhouse.serenity.page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy(css = "a.btn.button-plus")
    public WebElementFacade plusButton;

    @FindBy(css = "button.exclusive")
    public WebElementFacade addToCartButton;

    @FindBy(css = "a.btn:nth-child(2)")
    public WebElementFacade proceedToCheckOutButton;

    @FindBy(css = ".layer_cart_product > h2:nth-child(2)")
    public WebElementFacade succesNotification;

    @FindBy(id = "quantity_wanted")
    public WebElementFacade quantityField;

    @FindBy(id = "color_13")
    public WebElementFacade Orange;

    @FindBy(id = "color_14")
    public WebElementFacade Blue;

    @FindBy(id = "color_to_pick_list")
    public WebElementFacade listOfColors;
}
