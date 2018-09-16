package com.company;

public class AllInclusiveTariff extends InternetIncludedTariff {
    private static AllInclusiveTariff allInclusiveTariff;

    private AllInclusiveTariff() {
        outGoingOutside = 1200;
        outGoingInside = 200;
        amountOfUsers = 0;
        pricePerMonth = 35;
        exceedPenaltyOutside = 0.05;
        exceedPenaltyInside = 0.1;
        internetTraffic = 10000;
        exceedPenaltyInternet = 0.001;
    }

    public static AllInclusiveTariff getInstance() {
        if (allInclusiveTariff == null) {
            allInclusiveTariff = new AllInclusiveTariff();
        }
        return allInclusiveTariff;
    }
}
