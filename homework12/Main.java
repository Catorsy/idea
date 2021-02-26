package com.company.homework.homework12;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE/2;
    float [] arr = new float [SIZE];

    public static void main(String[] args) {
        way1();
        way2();
    }

    private static void way1() {
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1); //отличный метод заполнить весь массив одними и теми же значениями
        System.out.println(arr[55555]); //проверим, что он сработал
        long a = System.currentTimeMillis(); //засечем время
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
        }
        System.out.println(System.currentTimeMillis()-a + " - время работы первого метода"); //почему-то текст и метод нельзя поменять местами
    }

    private static void way2() {
        float[] arr = new float[SIZE];
        float[] arrBegin = new float[HALF];
        float[] arrEnd = new float[HALF];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arrBegin, 0, HALF); //нарезаем массивы
        System.arraycopy(arr, HALF, arrEnd, 0, HALF);

        Thread thread1 = new Thread(new Runnable() { //создаем потоки. Этот считает первую половину
            @Override
            public void run() {
                System.out.println("Привет! Я Поток1, начинаю вычисления.");
                for (int i = 0; i < arrBegin.length; i++) {
                    arrBegin[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
                }
                System.out.println("Проверим, что процессы идут: " + arrBegin[200]);
            }
        });

        Thread thread2 = new Thread(new Runnable() { //этот вторую
            @Override
            public void run() {
                System.out.println("Привет! Я Поток2, начинаю вычисления.");
                for (int i = 0; i < arrEnd.length; i++) {
                    arrEnd[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
                }
                System.out.println("Проверим, что процессы идут: " + arrEnd[9000]);
            }
        });

        thread1.start();
        thread2.start();
        System.out.println("Рано склеивать массивы и измерять время! Процессы ещё идут: " + thread1.getState() + " " + thread2.getState());
        String status, status2;
        do{
            status = String.valueOf(thread1.getState());
            status2 = String.valueOf(thread2.getState());
        } while (!(status == "TERMINATED" && status2 == "TERMINATED"));
        System.out.println(System.currentTimeMillis() - a + " - время дохода до данной точки, осталось склеить");
        System.arraycopy(arrBegin, 0, arr, 0, HALF); //склеиваем обратно точно готовые массивы
        System.arraycopy(arrEnd, 0, arr, HALF, HALF);
        System.out.println(thread1.getState() + " " + thread2.getState());
            System.out.println(System.currentTimeMillis() - a + " - время работы второго метода");
        }
    }

