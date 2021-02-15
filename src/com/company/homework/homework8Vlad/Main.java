package com.company.homework.homework8Vlad;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Participant[] participants = {
                new Cat(1, 2),
                new Man(1, 5),
                new Robot(4, 4)};
        Overcomable[] lets = {new Treadmill(3), new Wall(3)};
        for (Overcomable let : lets) {
            System.out.println("Let's overcome let - "+let.name());
            for (Participant participant : participants) {
                System.out.println("Participant - "+participant.name() + " try overcome let");
                if (participant.isActive()) {
                    let.overcome(participant);
                } else {
                    System.out.println("Participant - "+participant.name() + " out of the race");
                }
            }
        }
    }
}