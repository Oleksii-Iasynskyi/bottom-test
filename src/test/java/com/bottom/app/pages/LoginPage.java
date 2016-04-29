package com.bottom.app.pages;

import com.bottom.app.locators.Locators;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Oleksii.Iasynskyi on 4/29/2016.
 */
public class LoginPage {

    /**
     * Gets emailLogin field control
     * @return emailLogin field control
     */
    public SelenideElement getLoginField() {
        return $(By.id(Locators.Login.LOGIN_FIELD));
    }

    /**
     * Gets Next button control
     * @return Next button control
     */
    public SelenideElement getNextButton() {
        return $(By.id(Locators.Login.NEXT_FIELD));
    }

    /**
     * Gets Password field control
     * @return Password field control
     */
    public SelenideElement getPassField() {
        return $(By.id(Locators.Login.PASSWORD_FIELD));
    }

    /**
     * Gets Sign button control
     * @return Sign button control
     */
    public SelenideElement getSignButton() {
        return $(By.id(Locators.Login.SIGNIN_FIELD));
    }
}
