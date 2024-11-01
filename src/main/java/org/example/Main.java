package org.example;

public class Main {
    public static void main(String[] args) {
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
        }
    }