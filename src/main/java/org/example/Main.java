package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing(5,6);
        printColor();
        compareNumbers(30,20);
        checkNumber(9,3);
        positiveNegative();
        negativePositive(7);
        stringLine("Строка с буквами");
        leapYear(2021);
        massive(new int[]{1, 0, 1, 0, 1, 1, 1, 0, 0});
        massive100();
        massive12();
        twomassive();
        massive5();


    }

    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");

    }

    public static void checkSumSing(int a,int b) {
        int i = (a + b);
        if (i >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = -1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if ((value > 0) && (value <= 100)) {
            System.out.println("Жельый");
        } else {
            System.out.println("Зеленый");
        }


    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkNumber(int a, int b) {
        boolean result;
        int c = b + a;
        if ((c >= 10) && (c <= 20))
            result = true;
        else {
            result = false;
        }
        System.out.println(result);
        return result;
    }

    public static void positiveNegative() {
        int a = 10;
        if (a >= 0) {
            System.out.println("число положительное");
        } else System.out.println("Число отрицательное");
    }

    public static boolean negativePositive(int a) {
        boolean result;
        if (a >= 0) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
        return result;
    }

    public static void stringLine(String a) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.println(a);
        }
    }

    static boolean leapYear(int year) {
        boolean result;
        if ((year % 100 != 0) && (year % 4 == 0) && (year % 400 == 0)) result = true;
        result = false;
        System.out.println(result);
        return result;
    }


    public static void massive(int[] replaceValues ) {
        for (int i = 0; i < replaceValues.length; i++) {
            replaceValues[i] = (replaceValues[i] > 0) ? 0 : 1;
            System.out.print(replaceValues[i] + " ");

        }
    }

    public static void massive100() {
        int size = 100;
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.println(fillArr[i] + " ");
        }


    }

    public static void massive12() {
        int[] myltiTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myltiTwo.length; i++) {
            if (myltiTwo[i] < 6) {
                myltiTwo[i] = myltiTwo[i] * 2;
            }
            System.out.println(myltiTwo[i] + " ");
        }
    }

    public static void twomassive() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }
    }

    public static void massive5() {
        int len = 5;
        int initialValue = 6;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }


    }
}


