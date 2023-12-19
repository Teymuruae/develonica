package ru.develonica.tests.menu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.develonica.tests.TestBase;

public class ClickMenuWidgetsTest extends TestBase {

    @DisplayName("Тест прокликивания виджетов меню и проверка заголовка отдельного виджета")
    @Test
    void clickMenuWidgetsTest() {
        menu
                .assertWidgetsClicking();
    }
}