package ru.yandex.praktikum;

import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        System.out.println("Введите Имя и Фамилия через пробел");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Account account = new Account(name);
        account.checkNameToEmboss();


    }

    }

        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

