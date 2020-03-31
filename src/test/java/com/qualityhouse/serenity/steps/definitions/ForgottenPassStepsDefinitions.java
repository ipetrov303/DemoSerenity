package com.qualityhouse.serenity.steps.definitions;

import com.qualityhouse.serenity.page_objects.ForgottenPassPage;
import com.qualityhouse.serenity.steps.libraries.ForgottenPasswordActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ForgottenPassStepsDefinitions {

    @Steps
    private ForgottenPasswordActions petko;

    ForgottenPassPage forgottenPassPage;

    @Given("^John is on the forgotten password page$")
    public void forgottenPassPageIsOpen() {

        forgottenPassPage.open();
    }

    @When("^John submits password reset request with \"([^\"]*)\" email$")
    public void johnSubmitsPasswordResetRequestWithEmail(String email) {
        petko.requestsNewPasswordWithCredentials(email);
    }


    @Then("^success message \"([^\"]*)\" should be displayed$")
    public void successMessageShouldBeDisplayed(String success_message) {
        assertThat(petko.readsTextFrom(forgottenPassPage.forgottenPassSuccess))
                .as("Success message should be displayed").containsIgnoringCase(success_message);
    }
}
