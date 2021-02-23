package com.company.homework.homework11;

import java.util.Arrays;

public class ChangesElements {
    public static void main(String[] args) {
        String[] array = {"Гранит", "Сиенит", "Диорит", "Габбро", "Перидотит"};
        int index1, index2;
        System.out.println(Arrays.toString(array));
        do{
            index1 = (int) (Math.random() * array.length);
            index2 = (int) (Math.random() * array.length);
        }while (index1 == index2);
        change(array, index1, index2);


    }
    public static <T> void change (T[] array, int index1, int index2){
        System.out.println("Меняем местами элементы " + (index1 + 1) + " и " + (index2 + 1));
        T box = array[index1];
        array[index1] = array[index2];
        array[index2] = box;
        System.out.println("И получаем: " + Arrays.toString(array));
    }
}