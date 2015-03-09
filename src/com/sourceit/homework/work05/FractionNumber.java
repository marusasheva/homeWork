package com.sourceit.homework.work05;

public class FractionNumber implements com.sourceit.hometask.basic.FractionNumber {
    private int dividend;
    private int divisor;

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public double doubleValue() {
        return (double) dividend / divisor;
    }

    @Override
    public int compareTo(com.sourceit.hometask.basic.FractionNumber o) {
        if (doubleValue() > o.doubleValue())
            return 1;
        if (doubleValue() < o.doubleValue())
            return -1;
        //if (doubleValue()==o.doubleValue())
        return 0;
    }

    @Override
    public String toString() {
        return "FractionNumber{" +
                getDividend() +"/"+
                getDivisor() +
                '}';
    }
}
