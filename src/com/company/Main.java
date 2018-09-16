package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

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
    }
}
