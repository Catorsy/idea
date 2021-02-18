package com.company.homework.homework10;

import java.util.*;

public class AdressBookGo {
    public static void main(String[] args) {
        String [] surnames = {"Попов", "Пуков", "Васечкин", "Попов", "Смирнов", "Хренов", "Блохина", "Хвостикова", "Смирнов", "Попов", "Классокоткин"};
        String [] phones = {"+79103453535", "+79166667123", "+79067882546", "+74950985820", "+308456172348", "+0057381", "+375241984637", "+375440989123", "+79261093838", "+380322676790", "+380347787676"};

        List person = new ArrayList();
        for (String surname : surnames) {
            person.add(surname);
        }

        List telephones = new ArrayList();
        for (String telephone : phones) {
            telephones.add(telephone);
        }
        for (int i = 0; i < person.size(); i++) { //оба массива одинаковой длины и заполняются синхронно, неважно, какой брать
            System.out.println(person.get(i) + ":" + telephones.get(i));
        }
        add(person, telephones);
        get (person, telephones);
    }

    public static void add(List person, List telephones){
        person.add("Песцов");
        telephones.add("+79778778787"); //очень жаль, что задание запрещает взаимодействие с пользователем через консоль. Пусть бы сам добавлял записи.

        System.out.println();
        for (int i = 0; i < person.size(); i++) { //сразу проверка, что добавили
            System.out.println(person.get(i) + ": " + telephones.get(i));
        }
    }

    public static void get(List person, List telephones){
        List <Integer> number = new ArrayList(); //ячейки, в которых живут нужные нам фамилии и номера

        String find = "Попов"; //вводим сюда, кого мы ищем
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i) == find){
                number.add(i);
            }
        }

        System.out.println();
        for (int i = 0; i < number.size(); i++) {
            System.out.println(person.get(number.get(i)) + ":" +  telephones.get(number.get(i)));
        }
        if (number.isEmpty()){
            System.out.println("Такого индивида в справочнике нет.");
        }
    }
}
