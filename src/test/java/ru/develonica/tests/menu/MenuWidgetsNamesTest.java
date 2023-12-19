package ru.develonica.tests.menu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.develonica.tests.TestBase;

public class MenuWidgetsNamesTest extends TestBase {

    @DisplayName("Тест наименований виджетов меню")
    @Test
    void menuWidgetsNamesTest() {
        menu.clickMenuButton()
                .assertWidgetTexts();
    }
}