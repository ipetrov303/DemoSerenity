package com.qualityhouse.serenity.steps.libraries;

import com.qualityhouse.serenity.page_objects.BasePage;
import com.qualityhouse.serenity.page_objects.CartPage;
import com.qualityhouse.serenity.page_objects.ProductPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.qualityhouse.serenity.page_objects.components.ProductPageComponents.COLOR_OPTIONS;


/**
 * @author yakimfb
 * @since 19.03.20
 **/
public class BasesActions {
    private BasePage currentPage;
    private ProductPage productPage;
    private CartPage cartPage;
    WebDriver driver;

    @Step("Enters '{1}' in field {0}")
    protected void fillsFieldWithData(WebElementFacade fieldElement,
                                      String data) {
        if (data != null) {
            fieldElement.waitUntilEnabled()
                    .type(data);
        }
    }

    @Step("Selects '{1}' item from drop down {0}")
    protected void selectsFromDropDownAnItemByValue(WebElementFacade dropDownElement,
                                                    String itemValue) {
        if (itemValue != null) {
            dropDownElement.selectByValue(itemValue);
        }
    }

    protected void fillsFieldWithData(By fieldElement,
                                      String data) {
        fillsFieldWithData((WebElementFacade) currentPage.find(fieldElement),
                data);
    }

    protected void selectsFromDropDownAnItemByValue(By dropDownLocator,
                                                    String itemValue) {
        this.selectsFromDropDownAnItemByValue((WebElementFacade) currentPage.find(dropDownLocator),
                itemValue);
    }

    protected void selectsFromDropDownAnItemByVisibleText(By dropDownLocator,
                                                          String itemValue) {
        this.selectsFromDropDownAnItemByVisibleText((WebElementFacade) currentPage.find(dropDownLocator),
                itemValue);
    }

    @Step("Selects '{1}' item from drop down {0}")
    protected void selectsFromDropDownAnItemByVisibleText(WebElementFacade dropDownElement,
                                                          String itemValue) {
        if (itemValue != null) {
            dropDownElement.selectByVisibleText(itemValue);
        }
    }

    @Step
    protected void clicksOn(WebElementFacade buttonOrLink) {
        buttonOrLink.waitUntilClickable()
                .click();
    }


    @Step
    public boolean canSeeElement(WebElementFacade webElement) {
        return webElement.isVisible();
    }

    @Step
    public String readsTextFrom(WebElementFacade webElement) {
        return webElement.waitUntilVisible()
                .getText()
                .trim();
    }

    @Step
    public String getQuantityOfProduct(WebElementFacade webElement) {

        return webElement.waitUntilVisible().getAttribute("value");
    }

    @Step
    protected void clicksOnDesiredColor(String color) {
        if (color.equalsIgnoreCase("Orange")) {
            clicksOn(productPage.Orange);
        } else if (color.equalsIgnoreCase("Blue")) {
            clicksOn(productPage.Blue);
        }
    }

    @Step
    protected void selectColor(String desiredColor) {
        WebElementFacade colorOptions = currentPage.find(COLOR_OPTIONS);
        List<WebElementFacade> allColorOption = colorOptions.thenFindAll(By.tagName("a"));
        for (WebElementFacade colorOption : allColorOption) {
            if (colorOption.getAttribute("name").equalsIgnoreCase(desiredColor)) {
                colorOption.click();
                break;
            }
        }
    }

    @Step
    public Double calculateTotalPrice() {
        double totalShipping = Double.parseDouble(readsTextFrom(cartPage.priceOfShipping).substring(1));
        double unitPrice = Double.parseDouble(readsTextFrom(cartPage.priceOfOne).substring(1));
        double totalTax = Double.parseDouble(readsTextFrom(cartPage.totalTaxPrice).substring(1));
        double totalQuantity = Double.parseDouble(getQuantityOfProduct(cartPage.quantityField));

        return unitPrice * totalQuantity + totalShipping + totalTax;
    }
}
