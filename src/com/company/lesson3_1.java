package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class lesson3_1 {
    public static void main (String [] args){
     readFromConsole();
    }
    public static void readFromConsole(){
        Scanner scanner = new Scanner(System.in); //  в скобках "с параметрами", "без параметров" если голые скобки
        System.out.println("Введите любую строку: ");
        int inputString = scanner.nextInt();
        System.out.println("Вы ввели: " + inputString);
        scanner.close();
    }
}
