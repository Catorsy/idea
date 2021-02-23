package com.company.homework.homework11;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> { //будем складывать сюда только наши фрукты
    private String name;
    private List fruits = new ArrayList();
    float weight = 0.0f;

    public Box (String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Apple apple = new Apple(); //это наши опытные образцы фруктов
        Orange orange = new Orange();
        System.out.println(apple.getName() + ", вес " + apple.getWeight());
        System.out.println(orange.getName() + ", вес " + orange.getWeight());

        Box <Apple> box1 = new Box("Синяя коробка для яблок");
        Box <Apple> box2 = new Box("Белая коробка для яблок");
        Box <Orange> box3 = new Box ("Красная коробка для апельсинов");
        Box <Orange> box4 = new Box ("Жёлтая коробка для апельсинов");

        System.out.println("\nЗаполняем наши коробки. Первые две яблоками, вторые две апельсинами. Насыпать что-то не туда не выйдет.");
        box1.add(new Apple(), 20); //куда сыплем, что и сколько
        System.out.println(box1.name + ": здесь лежит " + box1.fruits.size() + " яблок."); //давайте пропишем имя фрукта прямо в sout, чтобы косяков в спряжении было меньше
        box2.add(new Apple(), 15);
        System.out.println(box2.name + ": здесь лежит " + box2.fruits.size() + " яблок.");
        box3.add(new Orange(), 40);
        System.out.println(box3.name + ": здесь лежит " + box3.fruits.size() + " апельсинов.");
        box4.add(new Orange(), 35);
        System.out.println(box4.name + ": здесь лежит " + box4.fruits.size() + " апельсинов.");

        box1.getWeight(apple); //кинем на весы пару коробок
        System.out.println("\n" + box1.name + " весит " + box1.weight);
        box3.getWeight(orange);
        System.out.println(box3.name + " весит " + box3.weight);

        System.out.println();
        box1.compare(box1, box2.getWeight(apple), apple); //давайте сравним всё со второй коробкой
        System.out.println("Равны по весу " + box2.name + " и " + box1.name + "? " + box1.compare(box1, box2.getWeight(apple), apple));
        System.out.println("Равны по весу " + box2.name + " и " + box2.name + "? " + box2.compare(box2, box2.getWeight(apple), apple));
        System.out.println("Равны по весу " + box2.name + " и " + box3.name + "? " + box3.compare(box3, box2.getWeight(apple), orange));

        System.out.println("\nДавайте пересыпем яблоки из первой коробки во вторую.");
        box2.reload(box1, apple); //чтобы добавить в этот метод "автоперевзвешивание", нужно передать туда же и фрукт-образец
        System.out.println(box1.name + " содержит " + box1.fruits.size() + " фруктов.");
        System.out.println(box2.name + " содержит " + box2.fruits.size() + " фруктов.");
        System.out.println("А апельсины из четвёртой в третью.");
        box3.reload(box4, orange);
        System.out.println(box3.name + " содержит " + box3.fruits.size() + " фруктов.");
        System.out.println(box4.name + " содержит " + box4.fruits.size() + " фруктов.");
    }

    public void add(T Fruit, int quantity){
       for (int i = 0; i < quantity; i++) {
            fruits.add((T) new Fruit(Fruit.getName(), Fruit.getWeight()));
            weight += quantity * Fruit.getWeight(); //давайте уж, добавляя фрукты, сразу добавим и вес, чтобы в коробке и без вызова взвешивания лежала правильная цифра
       }
    }

    public float getWeight(T Fruit){
       return weight = Fruit.getWeight() * fruits.size();
    }

    public boolean compare (Box<T> box, float myWeight, T Fruit){
        if (box.getWeight(Fruit) == myWeight) {
            return true;
        } else
            return false;
    }

    public void reload (Box<T> box, T Fruit){
        if(box.fruits.isEmpty()){
            System.out.println("Коробка пуста! Ничего не меняется.");
            return;
        } fruits.addAll(box.fruits);
        box.fruits.clear();
        box.weight = 0.0f;
        weight = fruits.size() * Fruit.getWeight();
    }
}
