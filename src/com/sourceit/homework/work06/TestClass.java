package com.sourceit.homework.work06;

import com.sourceit.hometask.exceptions.*;

public class TestClass {
    public static void main(String[] args) throws CustomException {
        com.sourceit.hometask.exceptions.StringUtils str=new StringUtils();
        int[] ar = str.findWord("сала слон сал сала сала","сала");
        for (int i = 0; i < ar.length ; i++) {
            System.out.print(ar[i] + " ");
        }
        double[]arr=str.findNumbers("ajfiue 35.7 khgg 45");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
