package com.company.homework.homework6;

public class Cat extends Animal {
    protected Cat(String name) {
        super(name);
    }

    @Override
    public void setActionRun(int actionRun) {
        if (actionRun < 0 && actionRun > 200) {
            System.out.println("Я не могу бежать так далеко!");
            return;
        }
            this.actionRun = actionRun;
    }



    @Override
    protected void run(int actionRun){
        if (actionRun > 0 && actionRun < 200){
            System.out.println("Я бегу " + actionRun + " метров!");
        }
    }

    @Override
    protected void swim(int actionSwim){
        System.out.println("Я не умею плавать!");
    }

}