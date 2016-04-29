package com.bottom.app;

import com.bottom.app.pages.InboxPage;
import com.bottom.app.pages.LoginPage;
import com.codeborne.selenide.Condition;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by oleksii.iasynskyi on 4/28/2016.
 */
public class GmailLoginTest {

    protected LoginPage loginPage;
    protected InboxPage inboxPage;
    private String gmailUsername = System.getProperty("gmail.username");
    private String gmailPassword = System.getProperty("gmail.password");

    @BeforeTest
    public void setup() {
        loginPage = new LoginPage();
        inboxPage = new InboxPage();
        Selenide.open("https://mail.google.com/");
    }

    @Test
    public void testName() throws Exception {
        //this block may be moved into separate Feature section
        loginPage.getLoginField().setValue(gmailUsername);
        loginPage.getNextButton().click();
        loginPage.getPassField().setValue(gmailPassword);
        loginPage.getSignButton().click();

        //waiting until inbox page is loaded
        waitUntilPagesIsLoaded(inboxPage.getLoggedByEmail(gmailUsername));

        //verifying that login is performed with correct email
        inboxPage.getLoggedByEmail(gmailUsername).shouldBe(Condition.present);
    }

    // may be moved to general utils section, or to the Base page module
    protected void waitUntilPagesIsLoaded(SelenideElement elementForWaiting) {
        elementForWaiting.waitUntil(Condition.appears, 20000);
    }
}
