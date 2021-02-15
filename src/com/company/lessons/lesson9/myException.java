package com.company.lessons.lesson9;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class myException extends Exception { //создаем свой класс исключений, Throwable, напр

    public static void main2(String[] args) {
        System.out.println(extracted());
    }

    public myException(String S) {
        super("Моё исключение");  //тогда можно throw new MyException();
    }

    public static boolean extracted(){
        try {
            System.out.println(twoNumbers(5.0, 0.0));
            return true;
        }catch (myException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Ещё одно исключение"); //получаем это, если 0 делим на 0. Это инты и арифметическая ошибка, которой прямо не указано в кетче
        }finally {
            System.out.println("Я блок finally");
        }
        return false;
    }

    public static double twoNumbers(double a, double b) throws myException{
        if(a == 0 && b == 0){
return (int)a/(int)b; //приводим к инту
        }
        if( a == 0 || b == 0){
            throw new myException("Деление на ноль");
        }
        return a/b;
    }

    //у флоат ошибка округления меньше, чем у дабла. Это потому, что у него меньше точность, для точных вычислений лучше дабл, но там ошибки округления.

    public static void main (String [] args) {
        BigDecimal sum = new BigDecimal(0); //вот так делают нормально вычисления

        for (BigDecimal i = new BigDecimal(0); i.floatValue() < 1; i = i.add(new BigDecimal(0.1))) {
            sum = sum.add(i);
            System.out.println(sum.setScale(2, RoundingMode.HALF_DOWN));
        }
    }
}

