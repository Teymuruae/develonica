package ru.develonica.pages.datas;

import java.util.Arrays;
import java.util.List;


public class TestingPageData {

    private List<String> testingTypes = Arrays.asList("Аудит ИТ-системы и архитектуры", "Функциональное тестирование", "Мобильное тестирование",
            "Тестирование UI", "Создание выделенных центров тестирования", "Автоматизация тестирования", "Тестирование безопасности",
            "Оценка качества разработки ПО");

    public List<String> getTestingTypes() {
        return testingTypes;
    }
}