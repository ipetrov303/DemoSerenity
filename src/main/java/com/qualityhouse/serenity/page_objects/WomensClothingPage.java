package com.qualityhouse.serenity.page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://automationpractice.com/index.php?id_category=3&controller=category")

public class WomensClothingPage extends PageObject {


    @FindBy(css = ".product_list li:nth-child(1) h5:nth-child(1) a:nth-child(1)")
    public WebElementFacade firstProductOnPage;

    @FindBy(className = "fancybox-iframe")
    public WebElementFacade iFrame;

    @FindBy(css = "a.btn.button-plus")
    public WebElementFacade plusButton;



}
