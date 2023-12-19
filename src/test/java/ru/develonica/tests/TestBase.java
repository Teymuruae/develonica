package ru.develonica.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.develonica.helpers.configs.Configs;
import ru.develonica.helpers.configs.Dev;

public class TestBase extends PagesManager {
    private static Dev devConfigs = ConfigFactory.create(Dev.class, System.getProperties());
    private static Configs configs = ConfigFactory.create(Configs.class, System.getProperties());
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = configs.getBrowserSize();
        Configuration.browser = configs.getBrowser();
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 10000;
    }

    @BeforeEach
    void setUp(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        Selenide.open(devConfigs.getBaseUrl());
    }

    @AfterEach
    void tearDown(){
        Selenide.closeWebDriver();
    }
}