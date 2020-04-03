package com.qualityhouse.serenity.page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    public static final By SUCCESS_MESSAGE_ADDED_TO_CART = By.cssSelector(".layer_cart_product h2:nth-child(2)");
    public static final By QUANTITY_FIELD_LOCATOR = By.id("quantity_wanted");
    public static final By UNIT_PRICE_LOCATOR = By.id("our_price_display");


    @FindBy(name = "Submit")
    public WebElementFacade addToCartButton;

    @FindBy(xpath = "//*[@title = 'Proceed to checkout']")
    public WebElementFacade proceedToCheckOutButton;

    @FindBy(css = ".layer_cart_product h2:nth-child(2)")
    public WebElementFacade successNotification;

    @FindBy(id = "quantity_wanted")
    public WebElementFacade quantityField;

    @FindBy(css = "h1[itemprop = 'name']")
    public WebElementFacade productName;

    @FindBy(id = "our_price_display")
    public WebElementFacade unitPrice;



}
