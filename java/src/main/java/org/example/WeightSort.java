package org.example;

public class WeightSort {

    public static String orderWeight(String str) {
        String[] numbers = str.trim().split("\\s+");

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                int weightA = calculateWeight(numbers[j]);
                int weightB = calculateWeight(numbers[j + 1]);

                if (weightA > weightB) {
                    swap(numbers, j, j + 1);
                } else if (weightA == weightB && numbers[j].compareTo(numbers[j + 1]) > 0) {
                    swap(numbers, j, j + 1);
                }
            }
        }

        return String.join(" ", numbers);
    }


    public static int calculateWeight(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum;
    }

    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
