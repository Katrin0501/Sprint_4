package ru.yandex.praktikum;

import io.qameta.allure.Step;

public class Account {

    private final String name;


    public Account(String name) {
        this.name = name;
    }

@Step("Валидация ввода Имени и Фамилии")
    public boolean checkNameToEmboss() {
          boolean result = false;

        // проверяет, пустую строку, null, пробелы вместо символов, длина <=2 и >19
        if (name == null || name.isBlank() || name.length() <= 2 || name.length() > 19) {
            System.out.println("Некорректное Имя:" + name);
            result = false;
        } else if (name.startsWith(" ") || name.endsWith(" ")) { // проверяет, что вначале или в конце имени Пробелы
            System.out.println("Пробел до или после Имени:" + name);
            result = false;
        } else if (name.length() >= 3 && name.length() <= 19 && name.contains(" ")&& name.indexOf(" ") == name.lastIndexOf(" ")) {
            // проверяет, что длинна имени входит в диапазон символов от 3 - 19 символов
            System.out.println("Имя соответствует: " + name);;
            result =  true;
        }else
        System.out.println("Что-то пошло не так!:" + name);
        return result;

    }

}



        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */


