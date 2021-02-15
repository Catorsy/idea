package com.company.homework.homework8;

public class Human implements Member, Jumpable, Runables{
        private String name;
        private String meansOfTransportation;
        private int maxJump;
        private int maxRun;

    public Human(String name, String meansOfTransportation, int maxRun, int maxJump) {
        this.name = name;
        this.meansOfTransportation = meansOfTransportation;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public void jump() {
        System.out.println(name + ": Я пытаюсь прыгнуть. У меня " + meansOfTransportation + ".");
    }

    @Override
    public void run() {
        System.out.println(name + ": Я бегу изо всех сил! У меня " + meansOfTransportation + ".");
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMeansOfTransportation() {
        return meansOfTransportation;
    }
}
