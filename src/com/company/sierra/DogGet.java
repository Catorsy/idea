package com.company.sierra;

public class DogGet {
    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }

    void bark(){
        if (size > 60){
            System.out.println("Гав! Гав!");
        }else if (size > 15){
            System.out.println("Вуф! Вуф!");
        }else {
            System.out.println("Тяф! Тяф!");
        }
    }

}

class DogGetTestDrive {
    public static void main (String [] args){
        DogGet one = new DogGet();
        one.setSize(70);
        DogGet two = new DogGet();
        two.setSize(8);
        DogGet three = new DogGet();
        three.setSize(30);
        System.out.println();
        System.out.println("Первая собака: " + one.getSize());
        System.out.println("Вторая собака: " + two.getSize());
        System.out.println("Третья собака: " + three.getSize());
        one.bark();
        two.bark();
        three.bark();


    }

    int CalcArea(int height, int weight) {
        return height * weight;

        //int a = CalcArea(7,12);
        //short c = 7;
        //CalcArea(c,15);
        //int d = CalcArea(57);
        //CalcArea(2,3);
        //long t = 42;
       // int f = CalcArea(t, 17);
       // int g = CalcArea();
       // CalcArea();
       //byte h = CalcArea(4, 20);
       //int j = CalcArea(2, 3, 5);
    }

}