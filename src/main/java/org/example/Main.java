package org.example;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        try {
            String[][] s1 = {
                    {"1", "2", "3","4"},
                    {"5", "6", "7", "8"},  // Создан один массив для двух методов.
                                            // Чтобы выдать исключение, нужно внести изменения.
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };
            checkSize(s1);
            convertSize(s1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void checkSize(String[][] s1) throws MyArraySizeException{
        if (s1.length != 4) {
            throw new MyArraySizeException("Массив должен содержать 4 строки");
        }
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].length != 4) {
                throw new MyArraySizeException("Строка " + (i + 1) + " должна содержать 4 элемента.");
            }
        }
    } public static void convertSize(String[][]s1) throws MyArrayDataException{

        int[][] intArray = new int[s1.length][s1[0].length];

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length; j++) {
                throw new MyArrayDataException("Ошибка преобразования в строке " + i + ", столбец " + j + ": " + s1[i][j]);
                }
            }
        }
    }