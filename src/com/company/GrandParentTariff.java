package com.company;

/**
 * Класс тариф "Пенсионный"
 */
public class GrandParentTariff extends Tariff {
    private static GrandParentTariff grandParentTariff;

    private GrandParentTariff() {
        outGoingOutside = 150;
        outGoingInside = 15;
        amountOfUsers = 0;
        pricePerMonth = 17;
        exceedPenaltyOutside = 0.08;
        exceedPenaltyInside = 0.2;
    }

    public static GrandParentTariff getInstance() {
        if (grandParentTariff == null) {
            grandParentTariff = new GrandParentTariff();
        }
        return grandParentTariff;
    }
}
