package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(12));

    }

    static String getSeason(int monthNumber) {
        String result = "";
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                result += "зима";
                break;
            case 3:
            case 4:
            case 5:
                result += "весна";
                break;
            case 6:
            case 7:
            case 8:
                result += "лето";
                break;
            case 9:
            case 10:
            case 11:
                result += "осень";
                break;
            default:
                result += "Invalid month";
                break;
        }
        return result;
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}