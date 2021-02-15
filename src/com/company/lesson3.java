package com.company;

import java.util.Scanner;

public class lesson3 {
    public static void main (String[] args){
        readConsole();
    }

    private static void readConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        int inputNumber;
        do {
            inputNumber = scanner.nextInt();
        }while (inputNumber < 0 || inputNumber > 10); //проверяем правильность числа
        System.out.println("Вы ввели " + inputNumber);
        scanner.close();
    }
}

