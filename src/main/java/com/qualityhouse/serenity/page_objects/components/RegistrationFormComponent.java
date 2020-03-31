package com.qualityhouse.serenity.page_objects.components;

import org.openqa.selenium.By;

/**
 * @author yakimfb
 * @since 19.03.20
 **/
public abstract class RegistrationFormComponent {
    public static final By MR_RADIO_BUTTON = By.id("id_gender1");
    public static final By MRS_RADIO_BUTTON = By.id("id_gender2");
    public static final By FIRST_NAME_FIELD = By.name("customer_firstname");
    public static final By LAST_NAME_FIELD = By.name("customer_lastname");
    public static final By EMAIL_FIELD = By.name("email");
    public static final By PASSWORD_FIELD = By.name("passwd");
    public static final By DAY_OF_BIRTH_DROP_DOWN_LOCATOR = By.name("days");
    public static final By MONTH_OF_BIRTH_DROP_DOWN_LOCATOR = By.name("months");
    public static final By YEAR_OF_BIRTH_DROP_DOWN_LOCATOR = By.name("years");
    public static final By address1Field = By.name("address1");
    public static final By addressCityField = By.name("city");
    public static final By ADDRESS_STATE_DROP_DOWN_LOCATOR = By.name("id_state");
    public static final By addressZipCodeField = By.name("postcode");
    public static final By ADDRESS_COUNTRY_DROP_DOWN_LOCATOR = By.name("id_country");
    public static final By addressMobilePhoneField = By.name("phone_mobile");
    public static final By addressAliasField = By.name("alias");
}
