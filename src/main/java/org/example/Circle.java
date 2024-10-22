package org.example;

public class Circle implements Shape, Border, Fill {
    double radius; // Радиус
    String borderColor; // Цвет границы
    String fillColor; // Цвет заливки

    public Circle(double radius, String borderColor, String fillColor) {
        this.radius = radius;
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
    public double calculaterPerimetr() { //Периметр круга(длина окружности)
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculaterArea() { // Площадь круга
        return Math.PI * radius * radius;
    }
}

