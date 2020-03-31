package com.qualityhouse.serenity.steps.definitions;

import com.qualityhouse.serenity.page_objects.WomensClothingPage;
import com.qualityhouse.serenity.steps.libraries.WomensClothingPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class WomensClothingStepsDefinitions {

    WomensClothingPage womensClothingPage;

    @Steps
    private WomensClothingPageActions johnny;

    @Given("^John is on the Women's Product Page$")
    public void womensProductPageIsOpen() {
        womensClothingPage.open();
    }

    @When("^John has selected first product on Women's Clothing Page$")
    public void johnHasSelectedFirstProductOnWomenSClothingPage() {
        johnny.clicksOnFirstProductOnPage();
    }
}
