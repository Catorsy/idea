package com.company;
import java.util.Random;

public class test3 {
    public static void main(String[] args){
    double[] a = new double[5];
        //double[] a = new double[a.length]; это если мы хотим массив той длины, которую ввел пользователь
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
    double b [] = new double[10];
        for (int i = 0; i < a.length; i++) {
            b[i] = i*i;
        }
   //чтобы в массиве бэ содержались элементы а, но не сам массив а
        System.arraycopy(a, 0, b, 5, 5);
        int i = 0;
}
}