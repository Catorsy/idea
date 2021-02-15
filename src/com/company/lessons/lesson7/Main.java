package com.company.lessons.lesson7;

public class Main {
    public static void main (String [] args) {

        String name;
        String [] catNames = {"Машка", "Мишка", "Ракета", "Боня", "Мурзик", "Павлик", "Рыжик", "Белый", "Смелый", "Вася"};
        Cat [] cats = new Cat [5];
        System.out.println();

        for (int i = 0; i < 5; i++) {
        int random = (int) (Math.random() * 10);
        name = catNames[random];
        int appetite = (int) (Math.random() * 5 + 1);

            Cat cat = new Cat(name, appetite, false);
            cats[i] = cat;
            cat.catInfo();
        }

        Plate plate = new Plate(10);
        plate.info();
        for (Cat cat: cats) {
            cat.eat(plate);
        }
        plate.info();
        for (Cat cat: cats) {
            cat.catFull();
        }

        plate.addFood(0);
        plate.info();

    }

}
