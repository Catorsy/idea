package com.company;

public class foreahh {
    public static void main(String[] args){
        double [] a = new double[5];
        for (int i = 0; i < a.length ; i++){
            a[i] = i;
        }
        for (double element: a) { //до : переменная цикла, после : элемент, по которому ходим
            System.out.println("a-какое-то " + element);
            
        }
    }
    
}
