package com.qualityhouse.serenity.steps.definitions;

import com.qualityhouse.serenity.entities.ProductPreferences;
import com.qualityhouse.serenity.page_objects.ProductPage;
import com.qualityhouse.serenity.steps.libraries.ProductPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class ProductStepsDefinitions {

    @Steps
    private ProductPageActions johnny;

    ProductPage productPage;

    @When("^John adds the product with his preferences to the cart:$")
    public void johnAddsTheProductWithHisPreferencesToTheCart(List<ProductPreferences> data) {
        ProductPreferences product = data.get(0);
        johnny.addToCart(product);
    }

    @Then("^notification \"([^\"]*)\" is shown$")
    public void notificationIsShown(String success_notification) {
        assertThat(johnny.readsTextFrom(productPage.succesNotification)).containsIgnoringCase(success_notification);
    }

    @When("^John clicks on the proceed to checkout button$")
    public void johnClicksOnTheProceedToCheckoutButton() {
        johnny.clicksOnProceedToCheckOutButton();
    }



}
