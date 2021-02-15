package com.company.homework.homework8Vlad;

public class Cat implements Jumpable, Runnable, Participant {

    private final int jumpLimit;
    private final int runLimit;
    private boolean active;

    public Cat(int jumpLimit, int runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
        this.active = true;
    }

    @Override
    public int maxJump() {
        return jumpLimit;
    }

    @Override
    public int maxRun() {
        return runLimit;
    }

    @Override
    public void jump() {
        System.out.println("Cat is jumping");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }


    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void inactive() {
        this.active = false;
    }


}