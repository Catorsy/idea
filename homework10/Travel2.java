package com.company.homework.homework10;

import java.util.*;

public class Travel2 {
    public static void main(String[] args) {
        String [] countries = {"Польша", "Германия", "Швейцария", "Швейцария", "Лихтенштейн",
                "Австрия", "Австрия", "Австрия", "Италия", "Италия", "Испания", "Испания", "Амстердам",
                "Финляндия", "Норвегия", "Китай", "Сингапур", "Сингапур", "Австралия", "Англия"};

        //Cэт будто специально создан для этой задачи. Но лист нам пригодится для того, чтобы считать объекты.
        List travel = new ArrayList();
        for (String country : countries) {
            travel.add(country);
        }

        System.out.println();
        Set travelOriginal = new TreeSet(); //давайте сделаем список уникальных значений по алфавиту.
        for (Object visit : countries) {
            travelOriginal.add(visit);
        }
        System.out.println(travelOriginal.toString());

        System.out.println();
        for (Object country : travelOriginal) { //а здесь, чтобы было красиво, нам надо пользоваться обеими коллекциями.
            System.out.print(country + ": " + Collections.frequency(travel, country) + "; "); //а здесь есть .frequency
        }
    }
}
