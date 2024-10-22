package org.example;

public class Main {
    public static void main (String[] args) {
        Dog dogMyxtar = new Dog("Мухтар");
        Cat catFil = new Cat("Фил");
        Dog dogMyxa = new Dog("Муха");
        Cat catFilip = new Cat("Филип");
        Bowl bowl = new Bowl(30);

        dogMyxtar.run(157);
        dogMyxtar.swim(9);

        dogMyxa.run(43);
        dogMyxa.swim(3);

        catFil.run(100);
        catFil.swim(39);

        catFilip.run(45);
        catFilip.swim(12);

        System.out.println("Всего животных:" + Animal.getAnimalCount());
        System.out.println("Всего собак:" + Dog.getDogCount());
        System.out.println("Всего котов:" + Cat.getCatCount());

        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Мурзик"),
                new Cat("Снежок"),
                new Cat("Кузя"),
                new Cat("Рыжик")};

        // Коты пытаются покушать
        for (Cat cat : cats) {
            cat.eat(bowl, 10); // Каждый кот пытается съесть 10 единиц еды
        }

        // Информация о сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        // Информация о количестве еды в миске
        bowl.info();

        // Добавляем еду в миску
        bowl.addFood(20);
        bowl.info();

        Circle circle = new Circle(3, "красный", "желтый");

        System.out.println("Периметр круга:" + circle.calculaterPerimetr());
        System.out.println("Площадь круга:" + circle.calculaterArea());
        System.out.println("Цвет границы:" + circle.borderColor);
        System.out.println("Цвет заливки:" + circle.fillColor);

        Rectangle rectangle = new Rectangle(4, 7, "черный", "синий");

        System.out.println("Периметр прямоугольника:" +rectangle.calculaterPerimetr());
        System.out.println("Площадь прямоугольника:" +rectangle.calculaterArea());
        System.out.println("Цвет границы:" +rectangle.borderColor);
        System.out.println("Цвет заливки:" +rectangle.fillColor);

        Triangle triangle = new Triangle(13, 7, 9,"Зеленый", "Розовый");

        System.out.println("Периметр треуголика:" + triangle.calculaterPerimetr());
        System.out.println("Площадь треугольника:" + triangle.calculaterArea());
        System.out.println("Цвет границы:" + triangle.borderColor);
        System.out.println("Цвет заливки:"+ triangle.fillColor);
    }
}

