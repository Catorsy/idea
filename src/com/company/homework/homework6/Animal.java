package com.company.homework.homework6;

import java.util.Scanner;

public abstract class Animal {

    private String name;
    protected int actionRun = 0;
    protected int actionSwim = 0;

    protected abstract void run(int actionRun);
    protected abstract void swim(int actionSwim);

    protected Animal (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getActionRun() {
        return actionRun;
    }

    public void setActionRun(int actionRun) {
        if(actionRun < 0 || actionRun > 500){
            System.out.println("Я не могу бежать так далеко!");
            return;
        }
        this.actionRun = actionRun;
    }

    public int getActionSwim() {
        return actionSwim;
    }

    public void setActionSwim(int actionSwim) {
        if(actionSwim < 0 || actionSwim > 10){
            System.out.println("Я не могу так далеко плыть!");
            return;
        }
        this.actionSwim = actionSwim;
    }
}
