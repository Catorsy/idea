package com.company.lessons.lesson6;

public abstract class Animal { //abstract - значит, мы не можем создать объект new Animal
    //public final abstract class Animal так мы запретим наследование
    protected String name;
    protected String color;
    protected int age;

    public Animal (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }



    public void run(){ //abstract усли даем методу, то методу удаляем тело. Если хоть 1 метод абстрактный, то и класс тоже
        System.out.println("Бежит");
    }
    //public final void run() чтобы не переопределялся

    public abstract void eat();

    public void info(){ //переопеределили метод
        System.out.println("name: " + name + " color: " + color + " age: " + age);
    }
}
