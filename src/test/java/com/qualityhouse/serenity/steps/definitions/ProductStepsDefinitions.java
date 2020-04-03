package com.qualityhouse.serenity.steps.definitions;

import com.qualityhouse.serenity.entities.ProductPreferences;
import com.qualityhouse.serenity.page_objects.ProductPage;
import com.qualityhouse.serenity.steps.libraries.ProductPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static com.qualityhouse.serenity.page_objects.ProductPage.*;
import static org.assertj.core.api.Assertions.assertThat;


public class ProductStepsDefinitions {

    static ProductPreferences product;

    @Steps
    private ProductPageActions johnny;
    private ProductPage productPage;

    @When("^he adds product to the cart with order details:$")
    public void heSelectsOrderOptions(List<ProductPreferences> data) {
        product = data.get(0);

        product.setName(johnny.readsTextFrom(productPage.productName));
        product.setUnitPrice(johnny.readsDoubleFrom(UNIT_PRICE_LOCATOR));

        johnny.addToCart(product);
    }

    @Then("^notification \"([^\"]*)\" is shown$")
    public void notificationIsShown(String success_notification) {
        assertThat(johnny.readsTextFrom(SUCCESS_MESSAGE_ADDED_TO_CART)).containsIgnoringCase(success_notification);
    }

}
