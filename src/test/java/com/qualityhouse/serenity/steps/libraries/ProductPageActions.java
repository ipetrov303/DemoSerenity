package com.qualityhouse.serenity.steps.libraries;

import com.qualityhouse.serenity.entities.ProductPreferences;
import com.qualityhouse.serenity.page_objects.ProductPage;
import com.qualityhouse.serenity.utils.SizeEnum;
import net.thucydides.core.annotations.Step;

import static com.qualityhouse.serenity.page_objects.components.ProductPageComponents.SIZE_DROP_DOWN;

public class ProductPageActions extends BasesActions {

    ProductPage productPage;

    @Step
    public void purchaseToTheCart(ProductPreferences preferences) {
        fillsFieldWithData(productPage.quantityField, preferences.getQuantity());
        selectSize(preferences.getSize());
        selectColor(preferences.getColor());
        clicksOn(productPage.addToCartButton);
    }

    @Step
    public void clicksOnProceedToCheckOutButton() {

        clicksOn(productPage.proceedToCheckOutButton);

    }

    private void selectSize(String itemSize) {
        if (itemSize != null) {

            String size = SizeEnum.valueOf(itemSize).getValue();
            selectsFromDropDownAnItemByValue(SIZE_DROP_DOWN,
                    size);
        }
    }

}
