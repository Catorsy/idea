package com.company.homework.homework11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class toList {
    public static void main(String[] args) {
        String[] array = {"Гранит", "Сиенит", "Диорит", "Габбро", "Перидотит"};
        arrayToList(array);
        arrayToList2(array);
    }

    public static <T> void arrayToList(T[] array){
        List rocks = Arrays.asList(array);
        try {
            rocks.add("Базальт");
        } catch (UnsupportedOperationException e){
            System.out.println("\nПервым методом мы получили дефективный ArrayList фиксированной длины, потому что изменения в его списке отражаются и в массиве.");
            e.printStackTrace();
        }
        System.out.println("Доказательство: заменим в коллекции нулевой элемент и затем распечатаем массив:");
        System.out.println(rocks.toString());
        rocks.set(0, "Базальт");
        System.out.println(Arrays.toString(array));
        //Как исправить? Может быть, так:
        List rocks2 = new ArrayList();
        rocks2.addAll(rocks);
        rocks2.add("Гранит");
        System.out.println("Помещаем обрезанную коллекцию внутрь нормальной: " + rocks2.toString());
    }
    //Или сразу попробуем по-другому:
    public static <T> void arrayToList2(T[] array){
        System.out.println();
        System.out.println("Метод 2, печатаем новосозданную коллекцию:");
        List rocks2 = new ArrayList();
        Collections.addAll(rocks2, array);
        System.out.println(rocks2.toString());
        System.out.println("Проверяем её на автономность.");
        rocks2.add("Гранит");
        System.out.println(rocks2.toString());
        System.out.println("Всё отлично!");
    }
}
