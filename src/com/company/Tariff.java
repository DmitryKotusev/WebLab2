package com.company;

public abstract class Tariff implements Comparable<Tariff> {
    protected int outGoingOutside;
    protected int outGoingInside;
    //protected int internetTraffic;
    protected int amountOfUsers;
    protected double pricePerMonth;
    protected double exceedPenaltyOutside;
    protected double exceedPenaltyInside;

    public int compareTo(Tariff t) {
        if (pricePerMonth < t.pricePerMonth)
            return -1;
        if (pricePerMonth > t.pricePerMonth)
            return 1;
        return 0;
    }

    public double getPenaltyOutside() {
        return exceedPenaltyOutside;
    }

    public double getPenaltyInside() {
        return exceedPenaltyInside;
    }

    public double getPricePerMonth() {
        return pricePerMonth;
    }

    public int getOutGoingOutside() {
        return outGoingOutside;
    }

    public int getOutGoingInside() {
        return outGoingInside;
    }

    public int getAmountOfUsers() {
        return amountOfUsers;
    }

    public int addUser() {
        return ++amountOfUsers;
    }

    public int addUsers(int users) {
        amountOfUsers += users;
        return amountOfUsers;
    }

    public int removeUser() {
        if (amountOfUsers >= 1) {
            return --amountOfUsers;
        } else {
            return 0;
        }
    }

    public int removeUsers(int users) {
        if (amountOfUsers - users >= 0) {
            amountOfUsers -= users;
        } else {
            amountOfUsers = 0;
        }
        return amountOfUsers;
    }

    public boolean setOutGoingOutside(int newOutGoingOutside) {
        if (newOutGoingOutside < 0) {
            return false;
        } else {
            outGoingInside = newOutGoingOutside;
            return true;
        }
    }

    public boolean setOutGoingInside(int newOutGoingInside) {
        if (newOutGoingInside < 0) {
            return false;
        } else {
            outGoingOutside = newOutGoingInside;
            return true;
        }
    }

    public boolean setPenaltyOutside(double newPenaltyOutside) {
        if (newPenaltyOutside < 0) {
            return false;
        } else {
            exceedPenaltyOutside = newPenaltyOutside;
            return true;
        }
    }

    public boolean setPenaltyInside(double newPenaltyInside) {
        if (newPenaltyInside < 0) {
            return false;
        } else {
            exceedPenaltyInside = newPenaltyInside;
            return true;
        }
    }

    public boolean setPricePerMonth(double newPrice) {
        if (newPrice < 0) {
            return false;
        } else {
            pricePerMonth = newPrice;
            return true;
        }
    }
}
