package com.qualityhouse.serenity.page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://automationpractice.com/index.php?id_category=3&controller=category")

public class WomensClothingPage extends PageObject {


    @FindBy(css = "li.ajax_block_product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h5:nth-child(1) > a:nth-child(1)")
    public WebElementFacade firstProductOnPage;

    @FindBy(css = "li.ajax_block_product:nth-child(1)")
    public WebElementFacade firsPoduct;

    @FindBy(className = "fancybox-iframe")
    public WebElementFacade iFrame;

    @FindBy(css = "a.btn.button-plus")
    public WebElementFacade plusButton;

    @FindBy(css = "button.exclusive")
    public WebElementFacade addToCartButton;


}
