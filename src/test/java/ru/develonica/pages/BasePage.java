package ru.develonica.pages;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$;


public class BasePage {

    private SelenideElement
            pageTitle = $("h1");

    public SelenideElement getPageTitle() {
        return pageTitle;
    }
}
