package de.example.webtester.pages;

import static info.novatec.testit.webtester.support.assertj.WebTesterAssertions.assertThat;

import info.novatec.testit.webtester.pagefragments.TextField;
import info.novatec.testit.webtester.pagefragments.annotations.IdentifyUsing;
import info.novatec.testit.webtester.pages.Page;

import javax.annotation.PostConstruct;

public interface LoginPage extends Page {
    String START_URL = "https://www.example.de/index.html";

    @IdentifyUsing("#name")
    TextField nameField();

    @PostConstruct
    default void correctPageIsDisplayed() {
        assertThat(nameField()).isVisible();
    }

    default void interact() {
        nameField().setText("hallo");
    }
}
