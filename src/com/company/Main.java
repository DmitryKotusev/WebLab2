package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Главный класс, содержащий метод main
 */
public class Main {

    /**
     * Метод, с которого начинается выполнение программы
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Tariff> list = new ArrayList<Tariff>();

        GameTariff.getInstance().addUsers(35);
        list.add(GameTariff.getInstance());

        AllInclusiveTariff.getInstance().addUsers(11);
        list.add(AllInclusiveTariff.getInstance());

        ComfortTariff.getInstance().addUsers(107);
        list.add(ComfortTariff.getInstance());

        EcoTarrif.getInstance().addUsers(122);
        list.add(EcoTarrif.getInstance());

        GrandParentTariff.getInstance().addUsers(82);
        list.add(GrandParentTariff.getInstance());

        int allUsers = 0;
        for (Tariff t: list) {
            allUsers += t.getAmountOfUsers();
        }
        System.out.println("Количество всех пользователей: " + allUsers);

        System.out.println("Несортированный список тарифов:");
        for (Tariff t: list) {
            System.out.println(t);
        }
        System.out.println();
        Collections.sort(list);
        System.out.println("Отсортированный по встроенному механизму сравнения список тарифов (по цене):");
        for (Tariff t: list) {
            System.out.print(t.getPricePerMonth() + ": ");
            System.out.println(t);
        }

        System.out.println();
        Collections.sort(list, new TariffComparator());
        System.out.println("Отсортированный по внешнему компаратору список тарифов (по количеству пользователей):");
        for (Tariff t: list) {
            System.out.print(t.getAmountOfUsers() + ": ");
            System.out.println(t);
        }

        System.out.println();
        System.out.println("Первый тарифф в списке, чьё количество пользователей лежит в диапозоне от 5 до 10");
        System.out.println(TariffRanger.getByAmountOfUsers(list, 5, 10));

        System.out.println();
        System.out.println("Первый тарифф в списке, чья цена в месяц лежит в диапозоне от 15 до 20");
        System.out.println(TariffRanger.getByPricePerMonth(list, 15, 20));
    }
}
