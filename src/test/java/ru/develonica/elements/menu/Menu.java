package ru.develonica.elements.menu;

import com.codeborne.selenide.*;
import ru.develonica.pages.BasePage;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


public class Menu extends MenuData {
    private SelenideElement
            menuButton = $x("(//div[@class = 'text-block-26'])[2]"),
            menuButtonInsidePages = $x("//div[@class = 'text-block-26']");

    private ElementsCollection
            menuButtons = $$x("//div[@class = 'text-block-26']"),
            menuWidgets = $$x("//div[contains(@id, 'w-nav-overlay')]//div[@class = 'v-t_nav-menu_services-link_z']");

    /**
     * метод проверки наименования виджетов - разделов меню
     *
     * @return
     */
    public Menu assertWidgetTexts() {
        menuWidgets.shouldHave(CollectionCondition.texts(menuList));
        return this;
    }

    /**
     * метод клика кнопки меню
     *
     * @return
     */
    public Menu clickMenuButton() {
        Selenide.sleep(200);
        if (menuButtons.size() > 1) {
            menuButton.click();
        } else
        menuButtonInsidePages.click();
        return this;
    }

    /**
     * метод клика по виджету меню по его наименованию
     *
     * @param widgetName
     */
    public Menu clickMenuWidget(String widgetName) {

        if (menuWidgets.findBy(Condition.text(widgetName)).is(Condition.not(Condition.visible))) {
            clickMenuButton();
        }
        menuWidgets.findBy(Condition.text(widgetName)).click();
        return this;
    }

    /**
     * метод клика каждого виджета меню и проверки наименования заголовка страницы
     */
    public Menu assertWidgetsClicking() {
        if (menuWidgets.first().is(Condition.not(Condition.exist))) {
            clickMenuButton();
        }
        List<String> menuWidgetNames = menuWidgets.texts();

        menuWidgetNames.forEach(x -> {
            if (menuWidgets.find(Condition.text(x)).is(Condition.not(Condition.visible))) {
                clickMenuButton();
            }
            menuWidgets.find(Condition.text(x)).click();
            new BasePage().getPageTitle().shouldHave(Condition.text(x));
        });
        return this;
    }
}