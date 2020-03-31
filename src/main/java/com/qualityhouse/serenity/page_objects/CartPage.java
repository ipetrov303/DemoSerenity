package com.qualityhouse.serenity.page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    @FindBy(css = "td.cart_description > p:nth-child(1)")
    public WebElementFacade productName;

    @FindBy(css = ".cart_quantity_input")
    public WebElementFacade quantityField;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[4]/span/span")
    public WebElementFacade priceOfOne;

    @FindBy(id = "total_shipping")
    public WebElementFacade priceOfShipping;

    @FindBy(id = "total_tax")
    public WebElementFacade totalTaxPrice;

    @FindBy(id = "total_price")
    public WebElementFacade totalPrice;


    public static final By QUANTITY_FIELD = By.cssSelector("td.cart_quantity");
}
