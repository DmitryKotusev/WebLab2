package com.company;

/**
 * Основной класс тариф, содержащий базовые поля и методы
 */
public abstract class Tariff implements Comparable<Tariff> {
    /**
     * Трафик вне сети в минутах
     */
    protected int outGoingOutside;
    /**
     * Трафик внутри сети в минутах
     */
    protected int outGoingInside;
    /**
     * Количество пользователей, использующих тариф
     */
    protected int amountOfUsers;
    /**
     * Цена за тариф в месяц
     */
    protected double pricePerMonth;
    /**
     * Цена за штрафную минуту вне сети
     */
    protected double exceedPenaltyOutside;
    /**
     * Цена за штрафную минуту внутри сети
     */
    protected double exceedPenaltyInside;

    public int compareTo(Tariff t) {
        if (pricePerMonth < t.pricePerMonth)
            return -1;
        if (pricePerMonth > t.pricePerMonth)
            return 1;
        return 0;
    }

    /**
     * Возвращает цену за штрафные минуты вне сети
     * @return цена за штраыне минуты вне сети
     */
    public double getPenaltyOutside() {
        return exceedPenaltyOutside;
    }

    /**
     * Возвращает цену за штрафные минуты внутри сети
     * @return цена за штраыне минуты внутри сети
     */
    public double getPenaltyInside() {
        return exceedPenaltyInside;
    }

    /**
     * Возвращает цену за тариф в месяц
     * @return цена за тариф в месяц
     */
    public double getPricePerMonth() {
        return pricePerMonth;
    }

    /**
     * Возвращает количество доступных минут вне сети
     * @return количество доступных минут вне сети
     */
    public int getOutGoingOutside() {
        return outGoingOutside;
    }

    /**
     * Возвращает количество доступных минут внутри сети
     * @return количество доступных минут внутри сети
     */
    public int getOutGoingInside() {
        return outGoingInside;
    }

    /**
     * Возвращает количество пользователй тарифа
     * @return количество пользователй тарифа
     */
    public int getAmountOfUsers() {
        return amountOfUsers;
    }

    /**
     * Добавляет одного пользователя на пользование текущим тарифом
     * @return новое число пользователей
     */
    public int addUser() {
        return ++amountOfUsers;
    }

    /**
     * Добавляет заданное количество пользователей
     * @param users
     * @return новое число пользователей
     */
    public int addUsers(int users) {
        amountOfUsers += users;
        return amountOfUsers;
    }

    /**
     * Удалаяет одного пользователя тарифа
     * @return новое число пользователей
     */
    public int removeUser() {
        if (amountOfUsers >= 1) {
            return --amountOfUsers;
        } else {
            return 0;
        }
    }

    /**
     * Удалаяет заданное число пользователей тарифа
     * Если число удалаяемых пользователей больше,
     * чем число текущих, то в результате число
     * текущих пользователей станет равно 0
     * @param users
     * @return новое число пользователей
     */
    public int removeUsers(int users) {
        if (amountOfUsers - users >= 0) {
            amountOfUsers -= users;
        } else {
            amountOfUsers = 0;
        }
        return amountOfUsers;
    }

    /**
     * Задает число минут вне сети
     * @param newOutGoingOutside
     * @return успешна ли операция
     */
    public boolean setOutGoingOutside(int newOutGoingOutside) {
        if (newOutGoingOutside < 0) {
            return false;
        } else {
            outGoingInside = newOutGoingOutside;
            return true;
        }
    }

    /**
     * Задаёт число минут внутри сети
     * @param newOutGoingInside
     * @return успешна ли операция
     */
    public boolean setOutGoingInside(int newOutGoingInside) {
        if (newOutGoingInside < 0) {
            return false;
        } else {
            outGoingOutside = newOutGoingInside;
            return true;
        }
    }

    /**
     * Задаёт новый штраф за одну лишнюю минуту разговора вне сети
     * @param newPenaltyOutside
     * @return успешна ли операция
     */
    public boolean setPenaltyOutside(double newPenaltyOutside) {
        if (newPenaltyOutside < 0) {
            return false;
        } else {
            exceedPenaltyOutside = newPenaltyOutside;
            return true;
        }
    }

    /**
     * Задаёт новый штраф за одну лишнюю минуту разговора внутри сети
     * @param newPenaltyInside
     * @return успешна ли операция
     */
    public boolean setPenaltyInside(double newPenaltyInside) {
        if (newPenaltyInside < 0) {
            return false;
        } else {
            exceedPenaltyInside = newPenaltyInside;
            return true;
        }
    }

    /**
     * Задаёт новую цену за тариф в месяц
     * @param newPrice
     * @return успешна ли операция
     */
    public boolean setPricePerMonth(double newPrice) {
        if (newPrice < 0) {
            return false;
        } else {
            pricePerMonth = newPrice;
            return true;
        }
    }

    /**
     * Переопределение метода toString
     */
    public String toString() {
        return super.getClass().toString();
    }
}
