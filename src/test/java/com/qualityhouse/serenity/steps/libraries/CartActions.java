package com.qualityhouse.serenity.steps.libraries;

import com.qualityhouse.serenity.page_objects.CartPage;
import net.thucydides.core.annotations.Step;

public class CartActions extends BasesActions {
    private CartPage cartPage;

    @Step
    public void opensCartPage() {
        cartPage.open();
    }

}
