package com.sourceit.homework.work05;

import com.sourceit.hometask.basic.FractionNumber;

public class FractionNumberOperation implements com.sourceit.hometask.basic.FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber var1, FractionNumber var2) {
        //com.sourceit.homework.work05.
        FractionNumber fractionNumber = new com.sourceit.homework.work05.FractionNumber();
        fractionNumber.setDivisor(var1.getDivisor() * var2.getDivisor());
        fractionNumber.setDividend(var1.getDividend() * var2.getDivisor() + var1.getDivisor() * var2.getDividend());
        return fractionNumber;
    }

    @Override
    public FractionNumber sub(FractionNumber var1, FractionNumber var2) {
        FractionNumber fractionNumber = new com.sourceit.homework.work05.FractionNumber();
        fractionNumber.setDivisor(var1.getDivisor() * var2.getDivisor());
        fractionNumber.setDividend(var1.getDividend() * var2.getDivisor() - var1.getDivisor() * var2.getDividend());
        return fractionNumber;
    }

    @Override
    public FractionNumber mul(FractionNumber var1, FractionNumber var2) {
        FractionNumber fractionNumber = new com.sourceit.homework.work05.FractionNumber();
        fractionNumber.setDivisor(var1.getDivisor() * var2.getDivisor());
        fractionNumber.setDividend(var1.getDividend() * var2.getDividend());
        return fractionNumber;
    }

    @Override
    public FractionNumber div(FractionNumber var1, FractionNumber var2) {
        FractionNumber fractionNumber = new com.sourceit.homework.work05.FractionNumber();
        fractionNumber.setDivisor(var1.getDivisor() * var2.getDividend());
        fractionNumber.setDividend(var1.getDividend() * var2.getDivisor());
        return fractionNumber;
    }

    @Override
    public FractionNumber parseFractionNumber(String var1) {
        com.sourceit.homework.work05.FractionNumber fractionNumber = new com.sourceit.homework.work05.FractionNumber();
        int i = var1.indexOf("/");
        if (i < 0) {
            fractionNumber.setDividend(Integer.parseInt(var1));
            fractionNumber.setDivisor(fractionNumber.DEFAULT_DIVISOR_VALUE);
            return fractionNumber;
        }
        fractionNumber.setDividend(Integer.valueOf(var1.substring(0, i)));
        fractionNumber.setDivisor(Integer.valueOf(var1.substring(i + 1, var1.length())));
        return fractionNumber;
    }
}

