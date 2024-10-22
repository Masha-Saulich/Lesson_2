package org.example;

public class Triangle implements Shape, Border, Fill {
    double sideA, sideB, sideC; // три стороны треугольника
    String borderColor;
    String fillColor;

    public Triangle (double sideA, double sideB, double sideC, String borderColor, String fillColor){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.borderColor = borderColor;
        this.fillColor = fillColor;

    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public double calculaterPerimetr() {
        return sideA + sideB + sideC; //Периметр треугольника
    }

    @Override
    public double calculaterArea() {
        double s = calculaterPerimetr() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Площадь треугольника
    }
}
