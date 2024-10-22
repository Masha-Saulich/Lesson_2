package org.example;

public class Rectangle implements Shape, Border, Fill {
    double width; //Ширина
    double height; //Высота
    String borderColor; // Цвет границы
    String fillColor;// Цвет заливки

    public Rectangle (double width, double height, String borderColor, String fillColor){
        this.width = width;
        this.height = height;
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
        return 2 * (width+height); //Периметр прямоугольника
    }

    @Override
    public double calculaterArea() {
        return width*height; // Площадь прямоугольника
    }
}
