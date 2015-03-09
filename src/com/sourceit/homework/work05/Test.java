package com.sourceit.homework.work05;

import com.sourceit.hometask.basic.FractionNumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        FractionNumber fractionNumber1 = new com.sourceit.homework.work05.FractionNumber();
        fractionNumber1.setDividend(2);
        fractionNumber1.setDivisor(3);
        System.out.println(fractionNumber1.toString() + "=" + fractionNumber1.doubleValue() + "\n");

        FractionNumber fractionNumber2 = new com.sourceit.homework.work05.FractionNumber();
        fractionNumber2.setDividend(2);
        fractionNumber2.setDivisor(3);
        System.out.println(fractionNumber2.toString() + "=" + fractionNumber2.doubleValue() + "\n");

        FractionNumberOperation operation = new FractionNumberOperation();
        System.out.println("SUM:" + operation.add(fractionNumber1, fractionNumber2).toString() + "=" +
                operation.add(fractionNumber1, fractionNumber2).doubleValue());
        System.out.println("MULTIPLICATION:" + operation.mul(fractionNumber1, fractionNumber2).toString() + "=" +
                operation.mul(fractionNumber1, fractionNumber2).doubleValue());
        System.out.println("DIVISION:" + operation.div(fractionNumber1, fractionNumber2).toString() + "=" +
                operation.div(fractionNumber1, fractionNumber2).doubleValue());
        System.out.println("SUBTRACTION:" + operation.sub(fractionNumber1, fractionNumber2).toString() + "=" +
                operation.sub(fractionNumber1, fractionNumber2).doubleValue());

        System.out.print("\n"+"UNSORTED: ");

        FractionNumber[] array = new FractionNumber[6];
        for (int k = 0; k < array.length; k++) {
            FractionNumber fr = new com.sourceit.homework.work05.FractionNumber();
            fr.setDividend((int) (Math.random() * 100));
            fr.setDivisor((int) (Math.random() * 100));
            array[k] = fr;
        }
        for (FractionNumber k:array) {
            System.out.print(Objects.toString(k) + " ");
        }
        System.out.print("\n"+"SORTED: ");

        Arrays.sort(array, new Comparator<FractionNumber>() {
            public int compare(FractionNumber o1, FractionNumber o2) {
                return o1.compareTo(o2);
            }
        });

        for (FractionNumber k : array) {
            System.out.print(Objects.toString(k) + " ");
        }
        System.out.println();
        System.out.println();
       // for (FractionNumber sort : arrFn) {
           // System.out.print(sort.doubleValue() + " ");
        //}
    }
}
