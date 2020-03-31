package com.qualityhouse.serenity.steps.definitions;

import com.qualityhouse.serenity.entities.ProductPreferences;
import com.qualityhouse.serenity.page_objects.CartPage;
import com.qualityhouse.serenity.steps.libraries.CartActions;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.SoftAssertions;

import java.util.List;

public class CartStepsDefinitions {

    @Steps
    private CartActions johnny;

    CartPage cartPage;


    @Then("^John should be redirected to the cart and see the product and quantities that he selected$")
    public void johnShouldBeRedirectedToTheCartAndSeeTheProductAndQuantitiesThatHeSelected(List<ProductPreferences> data) {

        ProductPreferences preferences = data.get(0);
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(johnny.readsTextFrom(cartPage.productName)).containsIgnoringCase(preferences.getProduct());
        softly.assertThat(johnny.getQuantityOfProduct(cartPage.quantityField)).containsIgnoringCase(preferences.getQuantity());
        softly.assertThat(johnny.calculateTotalPrice()).isEqualByComparingTo(preferences.getTotal_price());
        softly.assertAll();
    }
}