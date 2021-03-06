package com.qualityhouse.serenity.steps.libraries;

import com.qualityhouse.serenity.entities.ProductPreferences;
import com.qualityhouse.serenity.page_objects.ProductPage;
import com.qualityhouse.serenity.utils.SizeEnum;
import net.thucydides.core.annotations.Step;

import static com.qualityhouse.serenity.page_objects.components.ProductPageComponents.SIZE_DROP_DOWN;

public class ProductPageActions extends BasesActions {

    ProductPage productPage;

    @Step
    public void addToCart(ProductPreferences product) {
        selectQuantity(product.getQuantity());
        selectSize(product.getSize());
        selectColor(product.getColor());
        clicksOn(productPage.addToCartButton);
    }



    private void selectSize(String itemSize) {
        if (itemSize != null) {

            String size = SizeEnum.valueOf(itemSize).getValue();
            selectsFromDropDownAnItemByValue(SIZE_DROP_DOWN,
                    size);
        }
    }

    public double getUnitProductPrice() {
        return Double.parseDouble(readsTextFrom(productPage.unitPrice).substring(1));
    }

    public String getProductName() {
        return readsTextFrom(productPage.productName);
    }

    @Step
    public void clicksOnProceedToCheckOutButton() {

        clicksOn(productPage.proceedToCheckOutButton);

    }
    @Step
    private void selectQuantity(int quantity) {
        fillsFieldWithData(productPage.quantityField, String.valueOf(quantity));
    }
}
