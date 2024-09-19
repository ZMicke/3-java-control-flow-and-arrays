package com.example.task08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = new int[0];
        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        long mul = 1;
        if (arr.length > 0){
            for (int i = 0; i < arr.length; i++){
                mul *= arr[i];
            }
        }
        else{
            mul = 0;
        }
        return mul;
    }

}