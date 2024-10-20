package org.example;

public class Bowl {
    int food;

        public Bowl(int food) {
            this.food = food;
        }

        public int getFood() {
            return food;
        }

        public void decreaseFood(int amount) {
            if (amount > 0 && food >= amount) {
                food -= amount;
            }
        }
        public void addFood(int amount) {
            if (amount > 0) {
                food += amount;
                System.out.println("В миску добавлено " + amount + " еды.");
            }
        }
        public void info() {
            System.out.println("В миске осталось " + food + " еды.");
        }
    }

