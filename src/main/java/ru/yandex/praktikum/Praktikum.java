package ru.yandex.praktikum;

public class Praktikum {

    public static void main(String[] args) {
        String fullName = "Имя фамилия";

        Account account = new Account(fullName);
        account.checkNameToEmboss();
        System.out.println(fullName);
    }
}
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

