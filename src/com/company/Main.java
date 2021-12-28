package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {6, 8, 3, -2, -4, 2};

        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;

            System.out.println(Arrays.toString(array));
    }
}}
