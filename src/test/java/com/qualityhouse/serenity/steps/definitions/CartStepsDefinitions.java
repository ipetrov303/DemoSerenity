package com.qualityhouse.serenity.steps.definitions;

import com.qualityhouse.serenity.steps.libraries.CartActions;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.SoftAssertions;


import static com.qualityhouse.serenity.page_objects.CartPage.*;


public class CartStepsDefinitions {

    @Steps
    private CartActions johnny;


    @Then("^correct order details are displayed on the cart page:$")
    public void correctOrderDetailsAreDisplayed() {
        johnny.opensCartPage();
        SoftAssertions softly = new SoftAssertions();

        double expectedTotalPrice = ProductStepsDefinitions.product.getUnitPrice()
                * ProductStepsDefinitions.product.getQuantity();

        softly.assertThat(johnny.readsTextFrom(PRODUCT_NAME)
        ).containsIgnoringCase(ProductStepsDefinitions.product.getName());

        softly.assertThat(johnny.readsDoubleFrom(TOTAL_PRODUCT_PRICE))
                .isEqualTo(expectedTotalPrice);

        softly.assertThat(johnny.readsNumericValueFrom(PRODUCT_QUANTITY))
                .isEqualTo(ProductStepsDefinitions.product.getQuantity());

        softly.assertAll();
    }
}