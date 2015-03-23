package com.sourceit.homework.work06;

import com.sourceit.hometask.exceptions.CustomException;

import java.util.*;

public class StringUtils implements com.sourceit.hometask.exceptions.StringUtils {
    @Override
    public double div(String var1, String var2) throws NullPointerException, NumberFormatException, ArithmeticException {

        if (var1 == null) throw new NullPointerException("First number are equal null");
        if (var2 == null) throw new NullPointerException("Second number are equal null");

        double i1;
        double i2;
        try {
            i1 = (Double.parseDouble(var1));
            i2 = (Double.parseDouble(var2));
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Number1 or number2 are not a numbers");
        }
        /*
        double number2 = (Double.parseDouble(var2));
        double number1 = (Double.parseDouble(var1));
        */
        if (i2 == 0) throw new ArithmeticException("number2 is equal 0");
        double answer = i1 / i2;
        return answer;
    }
    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null) throw new NullPointerException("text is equal null");
        if (word == null) throw new NullPointerException("word is equal null");

        int index = 0;
        text = text.toLowerCase();
        word = word.toLowerCase();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.indexOf(word, index) < 0) {
                break;
            }
            arr.add(text.indexOf(word, index));
            index = text.indexOf(word, index) + 1;
        }
        int[] indexArr = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            indexArr[i] = arr.get(i);
        }
        return indexArr;
    }

    @Override
    public double[] findNumbers(String s) throws CustomException {
        String[] arr = s.split("\\s");
        ArrayList<Double> arrd = new ArrayList<>();
        for (int u = 0; u < arr.length; u++) {
            try {
                double a = Double.parseDouble(arr[u]);
                arrd.add(a);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        if (arrd.size() == 0)
            throw new CustomException("There are no numbers in the text");
        double[] arrdo = new double[arrd.size()];
        for (int u = 0; u < arrd.size(); u++) {
            arrdo[u] = arrd.get(u);
        }
        return arrdo;
    }
}
