package com.company.lessons.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;


    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (appetite > plate.getFood()){
            System.out.println("В тарелке слишком мало еды! Котик " + getName() + " не будет это есть.");
        } else {
            plate.decreaseFood(appetite);
            full = true;
        }
    }

    public void catInfo (){
        System.out.println("Имя: " + name + "; аппетит: " + appetite + "; сытый котик: " + full);
    }

    public void catFull(){
        if (full){
            System.out.println("Котик " + name + " сытый.");
        } else
        System.out.println("Котику с именем " + name + " не хватило еды.");
    }

}
