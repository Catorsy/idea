package com.company.homework;

import java.util.Scanner;
public class Homework1 {

    public static void main(String[] args) {
        byte aper = 27;
        short bper = 12700;
        int cper = -106000;
        long dper = 69937726539L;
        float eper = -86.96f;
        double fper = 963.23;
        char gper = '\u246D';
        boolean hper = true;
        String iper = "Super";

        System.out.println("Задание №2, результат: " + aper + " " + bper + " " + cper + " " + dper + " " + eper + " " + fper + " " + gper + " " + hper + " " + iper + " ");
      /*  formula();
        formula2(2f, 3.7f, 9.4f, 4.7f);
        check();
        PositiveOrNegative();
        menosONo();
        presentarse(); */
        ano();
    }

    public static float formula(){
        float a = 2f;
        float b = 3.7f;
        float c = 9.4f;
        float d = 4.7f;
        float resultado = a * (b + (c / d));
        System.out.println("Задание №3, результат: " + resultado);
        return resultado;
    }

    public static float formula2(float a,float b,float c,float d){ //метод с вызовом, задаем значение при вызове функции
        float resultado = a * (b + (c / d));
        System.out.println("Задание №3, результат: " + resultado);
        return resultado;
    }

    //нет, вбивать числа прямо в программу это что-то не то
    public static boolean check(){

        System.out.println("Задание №4. Сравнение чисел.");
        Scanner cifra = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int number = cifra.nextInt();

        Scanner cifra2 = new Scanner(System.in);
        System.out.println("Введите число 2: ");
        int number2 = cifra2.nextInt();
        System.out.println("Спасибо! Вы ввели число " + number + " и число " + number2);
        int suma = number + number2;
        if (suma >= 10 && suma <=20){
            System.out.println("Сумма Ваших чисел лежит в интервале 10-20.");
            return true;
        }else
            System.out.println("Сумма Ваших чисел не лежит в интервале 10-20.");
        return false;

       // return suma >= 10 && suma <=20; (можно так упростить все что выше)

    }

    public static void PositiveOrNegative(){
        Scanner cifra = new Scanner(System.in);
        System.out.println("Задание №5. Введите любое число");
        int number = cifra.nextInt();
        if(number >=0){
            System.out.println("Вы ввели положительное число.");
        }else
            System.out.println("Вы ввели отрицательное число.");
    }

    //return a < 0;

    public static boolean menosONo(){
        Scanner cifra = new Scanner(System.in);
        System.out.println("Задание №6. Введите любое число");
        int number = cifra.nextInt();
        if (number < 0){
            System.out.println("Вы ввели отрицательное число.");
            return true;
        }else
            System.out.println("Вы ввели положительное число.");
        return false;
    }

    public static void presentarse(){
        Scanner frase = new Scanner(System.in);
        System.out.println("Задание №7. Представьтесь!");
        String hola = frase.nextLine();
        System.out.println("Привет, " + hola + "!");
    }

    public static void ano(){
        Scanner pregunta = new Scanner(System.in);
        System.out.println("Задание №8. Введите любой год, и программа скажет, високосный он или нет.");
        int number = pregunta.nextInt();
        if ((number %4 == 0) && (number %100 != 0)){ //хитрый оператор "исключая" ^.
            System.out.println(number + " - это високосный год.");
        }else if (number %400 == 0)
            System.out.println(number + " - это високосный год.");
        else
            System.out.println(number + " - это не високосный год.");
    }

    //return a % 4 == 0 && ((a%

}
