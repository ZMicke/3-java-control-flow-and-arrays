package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null) {
            return null;
        }
        int count = 0;
        for (int k : arr) {
            if (k < 1000) {
                count++;
            }
        }

        int[] newArr = new int[count];

        int j = 0;
        for (int k : arr) {
            if (k < 1000) {
                newArr[j] = k;
                j++;
            }
        }

        return newArr;
    }

}