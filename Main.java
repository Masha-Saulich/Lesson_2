package org.example;

import org.example.Park.Attraction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee emptyEmployee = new Employee();
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "893123123", 40000, 35);
        persArray[2] = new Employee("Sidorov Sidr", "Developer", "sidorov@mailbox.com", "894512312", 50000, 28);
        persArray[3] = new Employee("Kuznetsov Kuzma", "Designer", "kuznetsov@mailbox.com", "895512312", 45000, 40);
        persArray[4] = new Employee("Smirnov Smir", "Tester", "smirnov@mailbox.com", "896712312", 35000, 25);
        for (Employee employee : persArray) {
            employee.printInfo();
            emptyEmployee.printInfo();
            Attraction();

        }
    } public static void Attraction() {
        Attraction Attractions = new Attraction ("Ромашка", "10:00 - 20:00", 125);
        Attractions.displayInfo();
        Attraction Attractions1 = new Attraction ("Машинки", "12:00 - 18:00", 150);
        Attractions.displayInfo();
    }
}
