package org.example;

public class Main {
    public static void main(String[] args) throws MyArraySizeException {
        massive();
    }

    public static void massive() throws MyArraySizeException {
        try {
            String[][] s1 = {
                {"1", "2", "b", "4" },
                {"5", "6", "7", "8" },
                {"9", "10", "11", "12" },
                {"13", "14", "15", "16" }
        };
        String[][] s2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7" },
                {"9", "10", "11" },
                {"13", "14", "15" }
        };  checkArraySize(s1);
            checkArraySize(s2);
        }
        catch (MyArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());

        }
    }

    public static void checkArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен быть 4х4");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Строка " + (i + 1) + " должна содержать 4 элемента.");

            }
        }
    }
}

