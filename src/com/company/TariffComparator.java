package com.company;

import java.util.Comparator;

public class TariffComparator implements Comparator<Tariff>{
    public int compare(Tariff a, Tariff b){

        return a.getAmountOfUsers() - b.getAmountOfUsers();
    }
}
