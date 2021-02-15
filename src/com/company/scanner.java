package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class scanner {
    public scanner(InputStream in) {
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); //создали объект класса сканер
        int a = sc.nextInt(); // чтение целого числа
        String b = sc.nextLine(); // чтение строки
        String c = sc.next(); // чтение слов до следующего пробела
        sc.close(); //Сделали - закрыли.
    }
}
