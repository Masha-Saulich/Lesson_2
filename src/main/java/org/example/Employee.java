package org.example;

public class Employee {
    String name;
    String position;
    String email;
    String phoneNumber;
    double salary;
    int age;

    public Employee(String _name, String _position, String _email, String _phoneNumber, double _salary, int _age) {
        name = _name;
        position = _position;
        email = _email;
        phoneNumber = _phoneNumber;
        salary = _salary;
        age = _age;
    }
    public Employee() {
        System.out.println("Конструктор класса Сотрудник");
        name = "Ivanov Ivan Ivanovich";
        position = "QA Engineer";
        email = "ivanov.ivanov@gmail.com";
        phoneNumber = "+7 (999) 999-99-99";
        salary = 2550;
        age = 32;
    }
    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary + " руб.");
        System.out.println("Возраст: " + age + " лет");
    }
}


