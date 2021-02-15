package com.company.lessons.lesson6;

public class Fish extends Animal {


        public Fish (String name, String color, int age){
            super(name, color, age);
        }

        public void swimming(){
            System.out.println("Я плыву");
        }

    public void info () {
        System.out.println("Я рыбка");
        super.info();
    }

    public void eat(){
        System.out.println("Лизь!");
    }

    @Override
    public void run(){
        System.out.println("Я не умею бегать");
    }
}
