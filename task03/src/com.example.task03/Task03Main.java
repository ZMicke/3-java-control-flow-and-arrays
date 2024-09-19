package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getNameOfWeekDays(7));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String result = "";
        switch (weekDaysNumber){
            case 1:
                result += "понедельник";
                break;
            case 2:
                result += "вторник";
                break;
            case 3:
                result += "среда";
                break;
            case 4:
                result += "четверг";
                break;
            case 5:
                result += "пятница";
                break;
            case 6:
                result += "суббота";
                break;
            case 7:
                result += "воскресенье";
                break;
        }
        return result;
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}