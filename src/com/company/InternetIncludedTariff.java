package com.company;

/**
 * Класс тарифов, в которых доступна услуга пользования интернетом
 */
public abstract class InternetIncludedTariff extends Tariff {
    /**
     * Количество доступных мегабайт интернета
     */
    protected int internetTraffic;
    /**
     * Штраф за один мегабайт превышения пользования интернетом
     */
    protected double exceedPenaltyInternet;

    /**
     * Возвращает количество доступных мегабайт интернета
     * @return количество доступных мегабайт интернета
     */
    public int getInternetTraffic() {
        return internetTraffic;
    }

    /**
     * Возвращает штраф за один мегабайт превышения пользования интернетом
     * @return штраф за один мегабайт превышения пользования интернетом
     */
    public double getExceedPenaltyInternet() {
        return exceedPenaltyInternet;
    }

    /**
     * Устанавливает новое количество интернет-трафика
     * @param newInternetTraffic
     * @return успешна ли операция
     */
    public boolean setInternetTraffic(int newInternetTraffic) {
        if (newInternetTraffic < 0) {
            return false;
        } else {
            internetTraffic = newInternetTraffic;
            return true;
        }
    }

    /**
     * Устанавливает новый штраф за один мегабайт интернет-трафика выше максимума
     * @param newPenaltyInternet
     * @return успешна ли операция
     */
    public boolean setPenaltyInternet(int newPenaltyInternet) {
        if (newPenaltyInternet < 0) {
            return false;
        } else {
            exceedPenaltyInternet = newPenaltyInternet;
            return true;
        }
    }
}
