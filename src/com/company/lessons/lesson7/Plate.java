package com.company.lessons.lesson7;

import java.util.Scanner;

public class Plate {

    private int food;

    public Plate (int food){
        this.food = food;
    }

    public void info (){
        System.out.println("В тарелке осталось еды: " + food);
    }

    public void decreaseFood(int n) {
        food-=n;
    }

    public int getFood(){
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood (int add){
        int userAdd;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Сколько еды Вы хотите положить в миску?");
        userAdd = scanner.nextInt();
        scanner.close();
        System.out.println();
        if (userAdd > 0) {
            food += userAdd;
        }if (userAdd < 0){
            System.out.println("Вы добавляете, а не забираете!");
        }if (userAdd == 0)
            System.out.println("Бедные котики.");
    }

}