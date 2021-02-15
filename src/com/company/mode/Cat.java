package com.company.mode;

public class Cat {
    
    private String name;
    private int age;
    private double weight;
    private boolean good;

    public Cat(String nameFromConstructor, int ageFromConstructor){ //конструктор, имя его совпадает с именем класса
        name = nameFromConstructor; //проинициализировали два поля
        age = ageFromConstructor;
    }

    public Cat(String newName, int newAge, double weight){ //конструктор, имя его совпадает с именем класса
        name = newName; //проинициализировали два поля
        age = newAge;
        this.weight = weight;
    }

    public String getName(){ //считываем из привата данные
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        if (weight < 0){
            System.out.println("Вес не может быть отрицательнымм!");
            return;
        }
        this.weight = weight;
    }

    public void setAge(int age){
        if(age < 0 || age < this.age){
            System.out.println("Неверный возраст котика!");
            return; //код не выполняется, переменная не изменяется
        }


        this.age = age;
        weight ++;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isGood() { //тут добавляется префикс is, это только для булеана, остальные get
        return good;
    }

    public static void printToConsole(){
        System.out.println("Я статический метод");
    }

    public String getInfo(){
        return "Имя: " + name + " Возраст: " + age;
    }
}
