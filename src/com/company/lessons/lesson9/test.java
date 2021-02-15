package com.company.lessons.lesson9;

import java.sql.SQLOutput;

public class test {
    public static void nul(String[] args) {
        int a = 0;
        int b = 10 / a;
        System.out.println(b);
    }


public static void may(String[] args){
    int a,b;
    try{
        a = 0;
        b = 10 / a;
        System.out.println("No usar");
    } catch (ArithmeticException e){
        System.out.println("/null");
    }
    System.out.println("Salida");
}

    public static void полнее(String[] args) {
        System.out.println("Empezar");
        try {
            int a = 0;
            int b = 42 / a;
        }catch (ArithmeticException e){
            e.printStackTrace(); //узнаем информацию об ошибке
        }
        System.out.println("Fin");
    }

    public static void minus (String[] args) { //только одно исключение ловим
        try {
            int a = 10;
            a -= 10;
            int b = 42 / a;
            int[] c = {1, 2, 3};
            c [42] = 99;
        }catch (ArithmeticException e){
            System.out.println("null");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array");
        }
    System.out.println("Array2");
}

//try {
//…
//    } catch ( ArithmeticException | ArrayIndexOutOfBoundsException е) {
//…
//    } можем так поймать сразу несколько исключений

    public static void sF(String[] args) {
        someFunction();
    }

        public static void someFunction(){
            someFunction(); //рекурсия, функция вызывает внутри себя саму же StackOverflowError
    }

    //эксепшн мы можем заранее предсказать. Да, такое поведение будет неправильным, ловим исключение
    //рантайм не предугадаем, например, деление на ноль

    public static void main(String[] args) {
        try {
            System.out.println(twoNumbers(5,1));
            System.out.println(twoNumbers(5,-9));
           // System.out.println(twoNumbers(5,0)); тут необъяляемое исключение
            System.out.println(twoNumbers(5.0, 0.0)); //как случилось, так попадаем в кетч. А код ниже уже не выполняется.
            System.out.println(twoNumbers(5,0));
        }catch (ArithmeticException e){ //остальные блоки не выполнятся
            System.out.println("Необъявляемое исключение");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Конец");
    }

    public static int twoNumbers(int a, int b) {
        return a/b;
    }

//    public static double twoNumbers(double a, double b) {
//        return a/b;
    //} //с дабл не ошибка, а бесконечность. 0/0 будет Нан


    public static double twoNumbers(double a, double b) throws Exception{ //объявляем в методе. Объявляемое исключение. Ждем его тут
        //в методе, который вызываем, надо либо указать ту же конструкцию, либо сказать, что делать с исключением. Делаем тут вар1
if( a == 0 || b == 0){
    throw new Exception("Деление на ноль"); //тут я бросаю исключение такое, какое я хочу бросить. Далее все равно что пишем ретёрн.
    //можно удалить блок троу, тогда мы получим красную ошибку, но в описании ошибки будет то, что мы указали тут. А тут пишем RuntimeException
}
return a/b;
    }
}

//finally хорош для закрытия того, что требуцет ресурсов
//System.exit(0); закрывает программу на корню
//можно без кетча, но с файнали, это для необъявляемых исключений