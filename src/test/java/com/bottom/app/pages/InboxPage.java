package com.bottom.app.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by oleksii.iasynskyi on 4/29/2016.
 */
public class InboxPage {
    /**
     * Gets Logged element by Email
     * @return Logged element by Email
     */
    public SelenideElement getLoggedByEmail(String emailForVerification) {
        return $(By.xpath("//*[contains(@title, '" + emailForVerification + "')]"));
    }
}
