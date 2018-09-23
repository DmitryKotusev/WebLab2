package com.company;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

/**
 * Класс, необхидимый для выборка первого тарифа из списка
 * тарифов, удовлетворяющего заданному диапозону параметров
 */
public class TariffRanger {
    /**
     * Метод, возвращает первый элемент коллекции, чьё количество пользователей удовлетворяет заданному диапозону
     * @param list
     * @param min
     * @param max
     * @return Tarrif
     */
    @Nullable
    public static Tariff getByAmountOfUsers(ArrayList<Tariff> list, int min, int max) {
        if (min > max) {
            int buff = min;
            min = max;
            max = buff;
        }

        for (Tariff t: list) {
            if (t.getAmountOfUsers() >= min && t.getAmountOfUsers() <= max) {
                return t;
            }
        }
        return null;
    }

    /**
     * Метод, возвращает первый элемент коллекции, чья цена в месяц удовлетворяет заданному диапозону
     * @param list
     * @param min
     * @param max
     * @return Tarrif
     */
    @Nullable
    public static Tariff getByPricePerMonth(ArrayList<Tariff> list, int min, int max) {
        if (min > max) {
            int buff = min;
            min = max;
            max = buff;
        }

        for (Tariff t: list) {
            if (t.getPricePerMonth() >= min && t.getPricePerMonth() <= max) {
                return t;
            }
        }
        return null;
    }
}
