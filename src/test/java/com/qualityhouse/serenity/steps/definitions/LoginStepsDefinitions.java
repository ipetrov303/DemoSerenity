package com.qualityhouse.serenity.steps.definitions;

import com.qualityhouse.serenity.entities.User;
import com.qualityhouse.serenity.page_objects.HomePage;
import com.qualityhouse.serenity.page_objects.LoginPage;
import com.qualityhouse.serenity.steps.libraries.LoginActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.SoftAssertions;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author yakimfb
 * @since 12.03.20
 **/
public class
LoginStepsDefinitions {

    LoginPage loginPage;
    HomePage homePage;

    @Steps
    private LoginActions ivancho;

    @Given("^(?:.*) is on the login page$")
    public void loginPageIsOpen() {
        loginPage.open();
    }

    @Then("^I should lend on my home page$")
    public void iShouldLendOnMyHomePage() {
    }


    @When("^(?:.*) logs in with:$")
    public void johnLogsInWith(List<User> data) {
        User user = data.get(0);
        ivancho.logsInWithCredentials(user);
    }

    @Then("^(.*) is logged in successfully$")
    public void userShouldLoginSuccessfully(String userName) {
        SoftAssertions assertSoftly = new SoftAssertions();
        assertSoftly.assertThat(ivancho.canSeeElement(homePage.logOutMenu))
                .as("Logout menu should be visible, when user is logged in")
                .isTrue();

        assertSoftly.assertThat(ivancho.readsTextFrom(homePage.userMenu))
                .as("User Menu items should contain the user name")
                .containsIgnoringCase(userName);

        assertSoftly.assertAll();
    }

    @Then("^error \"([^\"]*)\" message should display on login page$")
    public void errorMessageShouldDisplayOnLoginPage(String error_message) {
        assertThat(ivancho.readsTextFrom(loginPage.loginErrorMessages))
                .as("Login page should contain corresponding error message").contains(error_message);
    }
}
