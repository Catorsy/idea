package com.company.lessons.lesson6;

public class Cat extends Animal {
    // конструктор родителя тоже надо вызвать!

    public Cat (String name, String color, int age){
        super(name, color, age); //это вызываем конструктор
    }
    public void info () {
        System.out.println("Я кошка");
        super.info();
    }
    @Override
    public void eat(){
        System.out.println("НямНям!");
    }

    @Override
    public void run(){
        System.out.println("Тыгыдык Тыгыдык");
    }

}
