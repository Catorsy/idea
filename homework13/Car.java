package com.company.homework.homework13;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    private CountDownLatch barrierStart;
    private CountDownLatch barrierFinish;
    private ReentrantLock lock = new ReentrantLock(); //повесим замок, чтобы только 1 поток за раз обращался к переменной
    private String[] marks;
    private String winner;

    public Car(Race race, int speed, CountDownLatch barrierStart, CountDownLatch barrierFinish, String[] marks) {
        this.race = race;
        this.speed = speed;
        this.barrierStart = barrierStart;
        this.barrierFinish = barrierFinish;
        CARS_COUNT++;
        this.marks = marks;
        this.name = "Участник #" + CARS_COUNT + ", " + marks[CARS_COUNT-1];
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {

        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            barrierStart.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            barrierStart.await();
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            lock.lock();
            if (!race.isHaveWinner()){
                race.setHaveWinner(true);
                winner = this.getName();
                System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> У НАС ЕСТЬ ПОБЕДИТЕЛЬ!!! " + winner);
            }
        }finally {
                lock.unlock();
            }
        barrierFinish.countDown();
    }
}
