package com.qualityhouse.serenity.steps.libraries;

import com.qualityhouse.serenity.page_objects.ForgottenPassPage;
import net.thucydides.core.annotations.Step;

public class ForgottenPasswordActions extends BasesActions {

    ForgottenPassPage forgottenPassPage;

    @Step
    public void requestsNewPasswordWithCredentials(String email) {
        fillsFieldWithData(forgottenPassPage.forgottenPassEmailField,
                email);
        clicksOn(forgottenPassPage.submitButton);
    }
}
