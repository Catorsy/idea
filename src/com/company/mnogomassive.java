package com.company;

public class mnogomassive {
    public static void main (String[] args){
        double[][] a = new double [2][2];
        for (int i = 0; i < a.length; i++) { //чтобы пройтись по всем элементам, берем вложенный цикл
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i*j;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(); //это перенос строки
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }

        }
    }
}
//для двумерного массива указываем построчно:
// double a[][] = {{2,2,5},{1,2} }; это массив из двух строк