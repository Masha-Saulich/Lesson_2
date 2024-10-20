package org.example;

class Cat extends Animal {
   static int catCount = 0;
   boolean satiety;

   public Cat(String name) {
      super(name);
      catCount++;
      this.satiety = false; // Изначально кот голоден
   }

   public static int getCatCount() {
      return catCount;
   }

   @Override
   public void run(int distance) {
      System.out.println("Кот " + name + " пробежал " + distance + " м.");
   }

   // Коты обычно не плавают, поэтому переопределяем метод
   @Override
   public void swim(int distance) {
      System.out.println("Кот " + name + " не умеет плавать!");
   }
   public void eat(Bowl bowl, int amount) {
      if (bowl.getFood() >= amount) {
         bowl.decreaseFood(amount);
         this.satiety = true; // Кот сыт
         System.out.println(name + " покушал и теперь сыт.");
      } else {
         System.out.println(name + " не трогает еду, так как её недостаточно.");
      }
   }
   public boolean isSatiety() {
      return satiety;
   }
}


