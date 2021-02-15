package com.company;

import java.util.Scanner;

public class scanner2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        a *= 2;
        System.out.println("Если умножим это на 2, будет: " + a);
        sc.close();
    }
}
