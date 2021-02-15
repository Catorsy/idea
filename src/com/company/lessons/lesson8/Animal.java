package com.company.lessons.lesson8;

public class Animal implements Swimmable {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Я рыбка, я плыву.");
    }
}
