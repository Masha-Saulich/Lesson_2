package org.example;

public class Dog extends Animal {
    static int dogCount = 0;
            public Dog(String name) {
            super(name);
            dogCount++;
        }

    public static int getDogCount() {
        return dogCount;
    }


        public void run(int distance) {
            System.out.println("Собака " + name + " пробежала " + distance + " м.");
        }

        public void swim(int distance) {
            System.out.println("Собака " + name + " проплыла " + distance + " м.");
        }
    }
