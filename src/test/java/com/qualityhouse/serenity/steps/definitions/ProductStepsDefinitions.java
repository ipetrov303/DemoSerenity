package com.qualityhouse.serenity.steps.definitions;

import com.qualityhouse.serenity.entities.ProductPreferences;
import com.qualityhouse.serenity.page_objects.ProductPage;
import com.qualityhouse.serenity.steps.libraries.ProductPageActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class ProductStepsDefinitions {

    @Steps
    private ProductPageActions johnny;

    ProductPage productPage;

    @And("^John has selected preferred option on Product Page:$")
    public void johnHasSelectedPreferredOptionOnProductPage(List<ProductPreferences> data) {
        ProductPreferences preferences = data.get(0);
        johnny.purchaseToTheCart(preferences);
    }

    @Then("^John should see a popup window with notification \"([^\"]*)\"$")
    public void johnShouldSeeAPopupWindowWithNotification(String success_notification) {

        assertThat(johnny.readsTextFrom(productPage.succesNotification)).containsIgnoringCase(success_notification);
    }


    @When("^John has clicked on the proceed to checkout button$")
    public void johnHasClickedOnTheProceedToCheckoutButton() {
        johnny.clicksOnProceedToCheckOutButton();
    }
}
