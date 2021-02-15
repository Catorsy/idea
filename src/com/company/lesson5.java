package com.company;

import com.company.mode.Cat;

public class lesson5 {

    public static void main (String[] args){
        Cat cat1 = new Cat("Барсик", 6); //пишем в скобки, что сюда передать должен конструктор
        System.out.println(cat1.getName()); //так, через метод, данные считать можно, а иначе нельзя, т.к. приват
       // System.out.println(cat1.age); вот так не сработает
        System.out.println(cat1.getAge());
        System.out.println(cat1.getWeight());
        System.out.println(cat1.isGood());
        System.out.println("Вес кота = " + cat1.getWeight());
        cat1.setAge(cat1.getAge()+1); //меняем возраст котика
        System.out.println("Возраст кота = " + cat1.getAge());
        cat1.setAge(0);
        System.out.println("Вес кота = " + cat1.getWeight());
        Cat.printToConsole(); //тут без геттеров и сеттеров, просто зовем метод

        Cat cat2 = new Cat("Мразик", 6, 2.3);
        System.out.println(cat2.getName());

        System.out.println(cat1.getInfo()); //берем экземпляр и вызываем метод
    }

}
