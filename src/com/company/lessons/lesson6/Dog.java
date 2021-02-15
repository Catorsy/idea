package com.company.lessons.lesson6;

public class Dog extends Animal {

    public Dog (String name, String color, int age){
        super(name,color, age); //супер вызывает конструктор родителя, вызывает метод родителя, обращается к полям родителя
    }

    public void print(){
        super.info(); //вызываем метод родителя
        //System.out.println(super.name); //обратились к полю родителя

    }

    public void info () {
        System.out.println("Я собака");
        super.info();
    }

    public void eat(){
        System.out.println("Кусь!");
    }

   /* @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    } */
   //через альт-инсерт

    @Override //ctrl + o переопределить метод
    public void run(){
        System.out.println("Бежаааать");
    }
}
