package com.company.homework.homework6;

public class Dog extends Animal {



    protected Dog(String name) {
        super(name);
    }


    @Override
    protected void run(int actionRun){
        if (actionRun > 0 && actionRun <= 500){
            System.out.println("Я бегу " + actionRun + " метров!");
        }
    }

    @Override
    protected void swim(int actionSwim){
       if (actionSwim > 0 && actionSwim <= 10) {
            System.out.println(" Я плыву " + actionSwim + " метров!");
        }
    }

}
