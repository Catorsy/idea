package com.company.homework.homework8Vlad;

public class Robot implements Jumpable, Runnable, Participant {

    private final int jumpLimit;
    private final int runLimit;
    private boolean active;

    public Robot(int jumpLimit, int runLimit) {
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
        System.out.println("Robot is jumping");
    }

    @Override
    public void run() {
        System.out.println("Robot is running");
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