package com.company.sierra;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() { //создаем три объекта плейер
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0; // объявляем три переменные для для хранения вариантов от каждого игрока
        int guessp2 = 0;
        int guessp3 = 0;

        boolean pl1isRight = false; // объявляем три переменные для хранения правильности-неправильности ответа
        boolean pl2isRight = false;
        boolean pl3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");

        while (true) {
            System.out.println("Число, которое нужно угадать, это " + targetNumber);

            p1.guess(); //вызываем метод гесс из каждого объекта плейер
            p2.guess();
            p3.guess();

            guessp1 = p1.number; //извлекаем варианты каждого игрока (результат работы их метода гесс), получая доступ к их переменным намбер
            System.out.println("Первый игрок думает, что это " + guessp1);

            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);

            if (guessp1 == targetNumber) {
                pl1isRight = true;
            }
            if (guessp2 == targetNumber) {
                pl2isRight = true;
            }
            if (guessp3 == targetNumber) {
                pl3isRight = true;
            }

            if (pl1isRight || pl2isRight || pl3isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + pl1isRight);
                System.out.println("Второй игрок угадал? " + pl2isRight);
                System.out.println("Третий игрок угадал? " + pl3isRight);
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("Попробуйте ещё раз.");
            }
        }
    }
}

class Player {
    int number = 0; //здесь хранится вариант числа
    public void guess(){
        number = (int)(Math.random() * 9);
        System.out.println("Думаю, это число " + number);
    }
}

class GameLauncher {
    public static void main (String[] args){
        GuessGame game = new GuessGame();
        game.startGame();
    }
}