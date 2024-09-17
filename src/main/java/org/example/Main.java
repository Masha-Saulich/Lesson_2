package org.example;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
            System.out.println(isSumInRange()); // Вывод результата метода;
            checkNumber();
            System.out.println(isNegative());   // Вывод результата метода;
            printString();
            isLeapYear();
            test10();
            test11 ();
            test12 ();
            test13 ();
            test14 ();
        }
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");

        }
        public static void checkSumSign() {
            int a = 4;
            int b = -9;
            int sum = a + b;
            if (sum >=0) System.out.println("Сумма положительная");
            else System.out.println("Сумма отрицательная");
        }
        public static void printColor() {
            int value = 57;
            if (value <=0) System.out.println("Красный");
            if (value >0 && value <=100) System.out.println("Желтый");
            if (value >100) System.out.println("Зеленый");
        }
        public static void compareNumbers() {
            int a = 67;
            int b = -13;
            if (a >=b) System.out.println("a >=b");
            else System.out.println("a < b");
        }
        public static boolean isSumInRange() {
            int a = 3;
            int b = 19;
            int sum = a + b;
            return sum >= 10 && sum <= 20;
        }
        public static void checkNumber() {
            int number = 1;
            if (number >=0) {
            System.out.println("Число положительное");
            } else {
            System.out.println("Число отрицательное");
        }
        }
        public static boolean isNegative() {
            int number = 450;
            return number < 0;
        }
        public static void printString() {
            String str = "Делаю очень долго";
            int count = 3;
            for (int a = 0; a < count; a++) {
                System.out.println(str);
            };
        }
        public static void isLeapYear() {
            int year = 2024;
            if ((year % 4 == 0 && year % 100!= 0) || year % 400 == 0) {
                System.out.println(year + " - високосный год");
            } else {
                System.out.println(year + " - невисокосный год");
            }
        }
        public static void test10 () {
            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println(Arrays.toString(array));
            for (int i = 0; i <array.length; i++) {
                if (array[i] == 0) {
                    array[i] = 1;
                } else if (array[i] == 1) {
                    array[i] = 0;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        public static void test11 () {
            int[] arr = new int[100];
            System.out.print(Arrays.toString(arr));
            for (int i = 0; i < 100; i++) {
                arr[i] = i;
            }
            System.out.println(Arrays.toString(arr));
        }
        public static void test12 () {
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 11};
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
                int[] arr = new int [12];
                arr[i] = i;
                if (array[i] < 6) {
                    array[i] *= 2;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        public static void test13 () {
            int[][] pen = new int [5][5];
            System.out.println(Arrays.deepToString(pen));
            for (int i = 0; i < 5; i++) {
                pen[i][i] = 1;}
            System.out.println(Arrays.deepToString(pen));
        }
        public static void test14 () {
            int len = 4;
            int initialValue = 14;
            int[] arr = new int [len];
            for (int i = 0; i < 4; i++) {
                arr[i] = initialValue;
            }
            System.out.println(Arrays.toString(arr));
        }
    }