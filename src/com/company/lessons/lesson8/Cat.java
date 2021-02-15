package com.company.lessons.lesson8;

public class Cat extends Animal implements Swimmable, Runable {

    public Cat(String name, int age) { //вызвали конструктор
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Я кошка, но пытаюсь плыть.");
    }

    @Override
    public void run() {
        System.out.println("Я кошка, я бегу. ТЫГЫДЫК.");
    }
}
