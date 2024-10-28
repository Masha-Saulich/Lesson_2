package org.example;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        try {
            Size();
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void Size() throws MyArraySizeException, MyArrayDataException {
        String[][] s1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "8"},
                {"9", "q", "11", "12"},
                {"13", "14", "15", "16"}};

        if (s1.length != 4) {
            throw new MyArraySizeException("Массив должен содержать 4 строки");
        }
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].length != 4) {
                throw new MyArraySizeException("Строка " + (i + 1) + " должна содержать 4 элемента.");
            }
        }

        int[][] intArray = new int[s1.length][s1[0].length];

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length; j++) {
                try {
                    intArray[i][j] = Integer.parseInt(s1[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка преобразования в строке " + i + ", столбец " + j + ": " + s1[i][j]);
                }
            }
        }
    }
}