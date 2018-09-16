package com.company;

public class ComfortTariff extends InternetIncludedTariff {
    private static ComfortTariff comfortTariff;

    private ComfortTariff() {
        outGoingOutside = 120;
        outGoingInside = 15;
        amountOfUsers = 0;
        pricePerMonth = 15;
        exceedPenaltyOutside = 0.05;
        exceedPenaltyInside = 0.1;
        internetTraffic = 4000;
        exceedPenaltyInternet = 0.01;
    }

    public static ComfortTariff getInstance() {
        if (comfortTariff == null) {
            comfortTariff = new ComfortTariff();
        }
        return comfortTariff;
    }
}
