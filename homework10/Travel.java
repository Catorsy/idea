package com.company.homework.homework10;

import java.util.HashMap;
import java.util.Map;

public class Travel {
    public static void main(String[] args) {
        String [] countries = {"Польша", "Германия", "Швейцария", "Швейцария", "Лихтенштейн",
                "Австрия", "Австрия", "Австрия", "Италия", "Италия", "Испания", "Испания", "Амстердам",
                "Финляндия", "Норвегия", "Китай", "Сингапур", "Сингапур", "Австралия", "Англия"};

        //заполняем уникальную коллекцию-мапу.
        System.out.println();
        Map travel = new HashMap();
        for (String country : countries) {
            if(!(travel.containsKey(country))){
                travel.put(country, 1);
                }else{
                    travel.put(country, (1 + (int)travel.get(country)));
                }
            }

        for (Object visit : travel.keySet()) {
                System.out.println(visit + " : " + travel.get(visit));
            }
        }
    }
