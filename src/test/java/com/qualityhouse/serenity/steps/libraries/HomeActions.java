package com.qualityhouse.serenity.steps.libraries;

import com.qualityhouse.serenity.page_objects.HomePage;

public class HomeActions extends BasesActions {

    private HomePage homePage;

    public void clicksOnSignOutButton() {
        clicksOn(homePage.logOutMenu);
    }

}
