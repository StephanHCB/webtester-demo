package de.example.webtester.tests;

import de.example.webtester.pages.LoginPage;
import info.novatec.testit.webtester.browser.Browser;
import info.novatec.testit.webtester.browser.factories.MarionetteFactory;
import info.novatec.testit.webtester.junit5.EnableWebTesterExtensions;
import info.novatec.testit.webtester.junit5.extensions.browsers.CreateUsing;
import info.novatec.testit.webtester.junit5.extensions.browsers.EntryPoint;
import info.novatec.testit.webtester.junit5.extensions.browsers.Managed;
import info.novatec.testit.webtester.junit5.extensions.pages.Initialized;
import org.junit.jupiter.api.Test;

@EnableWebTesterExtensions
public class SampleTest {
    @Managed
    @CreateUsing(MarionetteFactory.class)
    @EntryPoint(LoginPage.START_URL)
    static Browser browser;

    @Initialized
    LoginPage loginPage;

    @Test
    void checkLoginPage() {
        loginPage.interact();
    }
}
