package ru.yandex.praktikum;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TestParamFullNameBankCart {

    private final String name;
    private final boolean expected;

    public TestParamFullNameBankCart(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }
    @Parameterized.Parameters
    @DisplayName("Ввод данных Имя и Фамилия") // имя теста
    @Description("Параметризованный тест - вариации ввода данных строки Name На банковской карте")
    public static Object[][] getName() {
        return new Object[][] {
                { "M Х", true},
                { "Maximum Characters!", true},
                { "", false},
                { null, false},
                { "Ка", false},
                { " ", false},
                { "Кузнечик Кузнечиковский", false},
                { "min", false},
                { "MaximumCharacters!!", false},
                { "Maximum  Characters", false},
                { " Maximum Characters", false},
                { "Maximum Characters ", false},

        };
    }

    @Test
    public void testParameterized() throws Exception {
        Account account = new Account(name);
        boolean actual = (account.checkNameToEmboss());
        assertEquals(expected,actual);

    }
}
