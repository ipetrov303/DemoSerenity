package com.qualityhouse.serenity.steps.libraries;

import com.qualityhouse.serenity.page_objects.WomensClothingPage;
import net.thucydides.core.annotations.Step;

public class WomensClothingPageActions extends BasesActions {

    WomensClothingPage womensClothingPage;



    @Step
    public void clicksOnFirstProductOnPage() {
        clicksOn(womensClothingPage.firstProductOnPage);
    }
}
