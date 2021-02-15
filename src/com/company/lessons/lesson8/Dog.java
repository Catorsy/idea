package com.company.lessons.lesson8;

public class Dog extends Animal implements Swimmable, Runable{

    public Dog (String name, int age){
        super (name, age);
    }

    @Override
    public void swim() {
        System.out.println("Я собака, я плыву!");
    }
    @Override
    public void run (){
        System.out.println("Собака, бегу и виляю хвостиком.");
    }

}
