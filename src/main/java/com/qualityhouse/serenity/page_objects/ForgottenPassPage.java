package com.qualityhouse.serenity.page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php?controller=password")
public class ForgottenPassPage extends PageObject {


    @FindBy(name = "email")
    public WebElementFacade forgottenPassEmailField;

    @FindBy(css = "button.btn:nth-child(1)")
    public WebElementFacade submitButton;

    @FindBy(css = "div.alert.alert-danger")
    public WebElementFacade forgottenPassErrors;

    @FindBy(css = ".alert")
    public WebElementFacade forgottenPassSuccess;
}
