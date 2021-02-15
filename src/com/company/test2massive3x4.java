package com.company;

public class test2massive3x4 {
    public static void main(String args []){
        int counter = 1;
        int[][] table = new int [3][4];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                        counter++;
            }
            System.out.println(); //делает столбик
        }
        printArr(table); //подаем ссылу на массив
    }
    public static void printArr ( int [][] arr ) {
        for ( int i = 0 ; i < arr.length ; i ++) {
            for ( int j = 0 ; j < arr [i].length ; j++) {
                System.out.print (arr [ i ][ j ]); //печатает элементы сплошняком
            }
            System.out.println ();
        }
    }
}
