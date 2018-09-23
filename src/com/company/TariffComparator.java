package com.company;

import java.util.Comparator;

/**
 * Класс, реализующий интерфейс Comparator для сравнения объектов
 * класса тариф по количеству пользователей
 */
public class TariffComparator implements Comparator<Tariff> {
    public int compare(Tariff a, Tariff b){
        return a.getAmountOfUsers() - b.getAmountOfUsers();
    }
}
