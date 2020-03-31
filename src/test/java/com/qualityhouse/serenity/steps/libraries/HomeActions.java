package com.qualityhouse.serenity.steps.libraries;

import com.qualityhouse.serenity.page_objects.HomePage;
import com.qualityhouse.serenity.page_objects.LoginPage;
import com.qualityhouse.serenity.page_objects.RegistrationPage;

public class HomeActions extends BasesActions {

    private HomePage homePage;
    private RegistrationPage registrationPage;
    private LoginPage loginPage;

    public void clicksOnSignOutButton() {
        clicksOn(homePage.logOutMenu);
    }

}
