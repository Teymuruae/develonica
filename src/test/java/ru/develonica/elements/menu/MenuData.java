package ru.develonica.elements.menu;



import java.util.Arrays;
import java.util.List;


public class MenuData {

    protected String
            customDevelopment = "Заказная разработка",
            appDevelopment = "Разработка приложений",
            decisions = "Решения",
            testing = "Тестирование";

    protected List<String> menuList = Arrays.asList(customDevelopment, appDevelopment, decisions, testing);

    public String getCustomDevelopment() {
        return customDevelopment;
    }

    public String getAppDevelopment() {
        return appDevelopment;
    }

    public String getDecisions() {
        return decisions;
    }

    public String getTesting() {
        return testing;
    }

    public List<String> getMenuList() {
        return menuList;
    }
}