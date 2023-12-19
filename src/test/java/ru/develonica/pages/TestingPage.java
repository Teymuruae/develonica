package ru.develonica.pages;

import com.codeborne.selenide.ElementsCollection;

import ru.develonica.pages.datas.TestingPageData;

import static com.codeborne.selenide.Selenide.$$;


public class TestingPage extends TestingPageData {

    private ElementsCollection
            testTypesTitles = $$(".test-item-info .test-item-title");

    public ElementsCollection getTestTypesTitles() {
        return testTypesTitles;
    }
}
