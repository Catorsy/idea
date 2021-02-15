package com.company.homework.homework8;


public class Main {

    public static void main(String[] args) {

        Member[] member = CreateMembers.getMembers(); //массив всех участников
        Exist[] Concurse = CreateConcurse.getConcurses(); //массив всех препятствий

        System.out.println();
        for (Member memberr : member) {
            System.out.println("Привет! Я " + memberr.getName() + " и у меня " + memberr.getMeansOfTransportation() + ".");
        }
        System.out.println();

        for (Member members : member) {
            for (Exist exist : Concurse) {
                if (exist.didIt(members)) {
                    System.out.println("Ура! Участник " + members.getName() + " преодолел препятствие " + exist.getType() + ".");
                } else {
                    System.out.println("Плохо! Участник " + members.getName() + " не смог преодолеть препятствие " + exist.getType() + " и выбывает.");
                    break;
                }
            }
        }
    }
}