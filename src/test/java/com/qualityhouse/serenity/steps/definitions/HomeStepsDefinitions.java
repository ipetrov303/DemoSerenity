package com.qualityhouse.serenity.steps.definitions;

import com.qualityhouse.serenity.page_objects.HomePage;
import com.qualityhouse.serenity.steps.libraries.HomeActions;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class HomeStepsDefinitions {

    HomePage homePage;


    @Steps
    private HomeActions user;

    @And("^Clicks on Sign Out Button$")
    public void clicksOnSignOutButton() {

        user.clicksOnSignOutButton();
    }
}
