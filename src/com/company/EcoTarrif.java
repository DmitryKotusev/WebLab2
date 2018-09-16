package com.company;

public class EcoTarrif extends Tariff {
    private static EcoTarrif ecoTariff;

    private EcoTarrif() {
        outGoingOutside = 100;
        outGoingInside = 5;
        amountOfUsers = 0;
        pricePerMonth = 10;
        exceedPenaltyOutside = 0.1;
        exceedPenaltyInside = 0.5;
    }

    public static EcoTarrif getInstance() {
        if (ecoTariff == null) {
            ecoTariff = new EcoTarrif();
        }
        return ecoTariff;
    }
}
