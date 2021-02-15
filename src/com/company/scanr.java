package com.company;

import java.util.Scanner;

public class scanr {
    public static void main (String[] args){
//        readConsole();
        int[] a = {345, 133445, 1345, 122, 1};
        printConsole(a);
        System.out.printf("Пример форматированного текста: %s, %f, %d, %c", "Тестовая строка", 2.5f, 56, 'h');
        String template = "Пример форматированного текста: %s, %f, %d, %c"; //универсализируем
        System.out.printf(template, "Тест", 2.5f, 12, 'h');
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

    public static void printConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]=" + array[i]);

        }
    }
}
