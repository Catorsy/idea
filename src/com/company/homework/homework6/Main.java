package com.company.homework.homework6;

import java.util.Scanner;

public class Main {

    private static int doggy = 0;
    private static int catty = 0;
    private static int pet = 0;

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            System.out.println();
            System.out.println("Привет! Кому Вы хотите дать команду? Введите 1, если собаке, и 2, если кошке. Если Вам надоело, введите 3.");
            answer = scanner.nextInt();
            if (answer == 1) {
                Dog dog = new Dog("Пёсик");
                doggy++;
                pet++;
                System.out.println("Пёсик будет бегать или плыть? Введите 4, если бегать, и 5, если плыть.");
                answer = scanner.nextInt();
                if (answer == 4)
                {
                    System.out.println("Сколько метров должен пробежать " + dog.getName() + "?");
                    int actionRun = scanner.nextInt();
                    dog.setActionRun(actionRun);
                    dog.run(actionRun);
                }if (answer == 5){
                    System.out.println("Сколько метров должен проплыть " +  dog.getName() + "?");
                    int actionSwim = scanner.nextInt();
                    dog.setActionSwim(actionSwim);
                    dog.swim(actionSwim);
                }
            }
            if (answer == 2) {
                Cat cat = new Cat("Котик");
                catty++;
                pet++;
                System.out.println("Котик будет бегать или плыть? Введите 4, если бегать, и 5, если плыть.");
                answer = scanner.nextInt();
                if (answer == 4)
                {
                    System.out.println("Сколько метров должен пробежать " + cat.getName() + "?");
                    int actionRun = scanner.nextInt();
                    cat.setActionRun(actionRun);
                    cat.run(actionRun);
                }if (answer == 5){
                    System.out.println("Сколько метров должен проплыть " + cat.getName() + "?");
                    int actionSwim = scanner.nextInt();
                    cat.swim(actionSwim);
                }
            }
        } while (answer != 3);

        System.out.println("Вы создали: " + doggy + " собак, " + catty + " кошек, всего " + pet + " животных." );
        //мы их всех, конечно, СОЗДАЛИ, но, строго говоря, каждое новое животное заменяет старое...
    }
}
