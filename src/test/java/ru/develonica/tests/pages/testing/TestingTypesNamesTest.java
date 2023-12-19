package ru.develonica.tests.pages.testing;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.develonica.tests.TestBase;

public class TestingTypesNamesTest extends TestBase {

    @BeforeEach
    void enter() {
        menu.clickMenuWidget(menu.getTesting());

    }

    @DisplayName("Тест наименований видов тестирования на странице тестирования")
    @Test
    void testingTypesNamesTest() {
        testingPage.getTestTypesTitles().shouldHave(CollectionCondition.textsInAnyOrder(testingPage.getTestingTypes()));
    }
}