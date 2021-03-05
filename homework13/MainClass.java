package com.company.homework.homework13;
import java.util.concurrent.CountDownLatch;

public class MainClass {
    public static final int CARS_COUNT = 4;
    private static String[] marks = {"Mercedes", "Ferrari", "Red Bull", "McLaren"};
    static CountDownLatch barrierStart = new CountDownLatch(CARS_COUNT); //ставим барьер для сбора машин у старта
    static CountDownLatch barrierFinish = new CountDownLatch(CARS_COUNT); //ставим барьер для сбора машин у финиша

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), barrierStart, barrierFinish, marks);
        }

        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
        try {
            barrierStart.await(); //чтобы вовремя вывести сообщение о начале гонки
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        try {
            barrierFinish.await(); //чтобы вовремя вывести сообщение о конце гонки
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}

