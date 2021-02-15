package com.company.lessons.lesson8;

public class GenerateRunable {

    public static Runable [] getRunables(){
        Runable cat = new Cat("Барсик", 3);
        Runable dog = new Dog ("Васёк", 6);
        Runable robot = new Robot ();
        return new Runable[] {cat, dog, robot}; //возвращаем массив
    }

}
