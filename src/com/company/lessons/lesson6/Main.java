package com.company.lessons.lesson6;

public class Main {
    public static void main (String[] args){
        Cat cat = new Cat ("Мявка", "рыжий", 6);
        Dog dog = new Dog ("Бен", "чёрный", 3);
        Fish fish = new Fish("Дашка", "золотой", 4);
        cat.info(); //сначала отрабатывает метод частный, потом общий
        dog.info();
        fish.info();
        cat.run();
        dog.run();
        fish.run();
        fish.swimming();
    }
}
