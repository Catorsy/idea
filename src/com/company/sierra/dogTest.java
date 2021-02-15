package com.company.sierra;

class Dog {
    String name;
    public static void main(String[] args) {
        Dog dog1 = new Dog(); //созадём объект дог и получаем к нему доступ
        dog1.bark();
        dog1.name = "Барт";

        //создаем массив типа дог
        Dog[] myDogs = new Dog[3];
        //помещаем туда несколько элементов
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        //получаем доступ к объектам с помощью ссылок
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";
        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);
        //переберем элементы и попросим собак лаять
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

        public void bark() {
            System.out.println(name + " сказал Гав!");
        }

    }

