package com.qualityhouse.serenity.page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * @author yakimfb
 * @since 12.03.20
 **/

@DefaultUrl("http://test.automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage
        extends PageObject {

    public static final By CLICK_ON = By.name("SubmitCreate");

    @FindBy(name = "email")
    public WebElementFacade emailField;

    @FindBy(name = "passwd")
    public WebElementFacade passwordField;

    @FindBy(name = "SubmitLogin")
    public WebElementFacade loginButton;

    @FindBy(name = "email_create")
    public WebElementFacade registrationMailField;

    @FindBy(name = "SubmitCreate")
    public WebElementFacade createAnAccountButton;

    @FindBy(css = "div.alert.alert-danger")
    public WebElementFacade loginErrorMessages;

}
