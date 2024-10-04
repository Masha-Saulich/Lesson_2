package org.example;

public class Park {

    public static class Attraction {
        static String name; // название аттракциона
        static String timeWork; // время работы
        static double price; // стоимость

        public Attraction(String _name, String _timeWork, double _price) {
            name = _name;
            timeWork = _timeWork;
            price = _price;
        }
        public void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + timeWork);
            System.out.println("Стоимость посещения: " + price);
        }
    }
}