package com.company;

/**
 * Класс тариф "Игровой"
 */
public class GameTariff extends InternetIncludedTariff {
    private static GameTariff gameTariff;

    private GameTariff() {
        outGoingOutside = 180;
        outGoingInside = 20;
        amountOfUsers = 0;
        pricePerMonth = 20;
        exceedPenaltyOutside = 0.1;
        exceedPenaltyInside = 0.5;
        internetTraffic = 10000;
        exceedPenaltyInternet = 0.001;
    }

    public static GameTariff getInstance() {
        if (gameTariff == null) {
            gameTariff = new GameTariff();
        }
        return gameTariff;
    }
}
