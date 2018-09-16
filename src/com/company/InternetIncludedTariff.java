package com.company;

public abstract class InternetIncludedTariff extends Tariff {
    protected int internetTraffic;
    protected double exceedPenaltyInternet;

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public double getExceedPenaltyInternet() {
        return exceedPenaltyInternet;
    }

    public boolean setInternetTraffic(int newInternetTraffic) {
        if (newInternetTraffic < 0) {
            return false;
        } else {
            internetTraffic = newInternetTraffic;
            return true;
        }
    }

    public boolean setPenaltyInternet(int newPenaltyInternet) {
        if (newPenaltyInternet < 0) {
            return false;
        } else {
            exceedPenaltyInternet = newPenaltyInternet;
            return true;
        }
    }
}
