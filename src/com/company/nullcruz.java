package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class nullcruz {

    public static char[][] map; //объявляем поле - двумерный массив типа char
    public static final int SIZE = 3; //классическое поле. public static final, сразу три - это считается константой, и все в буквы в названии должны быть заглавные
    public static final int DOTS_TO_WIN = 3; //переменную с модификатором final нельзя переназначить. 3 - кол-во переменных подряд для победы.

    public static final char DOT_EMPTY = '•'; //объявим символы константами
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initMap(); //инициализируем поле (карту)
        printMap(); //выводим карту
        boolean humanWin;
        boolean aiWin = false;
        do {
            humanTurn(); //делаем ход человека
            printMap();
            humanWin = checkWin(DOT_X);
            if(humanWin){
                break;
            }
            aiTurn();
            printMap();
            aiWin = checkWin(DOT_O);
            if(aiWin){
                break;
            }

        } while (!mapIsFull());
        if(humanWin){
            System.out.println("Победил человек!");
        }
        if(aiWin){
            System.out.println("Победил компьютер!");
        }
        if (!humanWin && !aiWin) {
            System.out.println("Ничья!");
        }
    }

    private static boolean checkWin(char symbol) {
        //что в строке есть символы
        for (char[] row : map) {
            int quantitySymbolInRow = 0;
            for (int i = 0; i < SIZE; i++) {
                if (row[i] == symbol) {
                    quantitySymbolInRow++;
                } else if (quantitySymbolInRow > 0) {
                    quantitySymbolInRow = 0;
                }
                if (quantitySymbolInRow == DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        //что в столбце есть символы
        for (int i = 0; i < SIZE; i++) {
            int quantitySymbolInRow = 0;
            for (int j = 0; j < SIZE; j++) {
                if(map[j][i] == symbol){
                    quantitySymbolInRow++;
                } else if (quantitySymbolInRow > 0){
                    quantitySymbolInRow = 0;
                }
                if (quantitySymbolInRow == DOTS_TO_WIN){
                    return true;
                }
            }
        }
        //что в диагоналях есть символы
        int quantitySymbolInRow = 0;
        for (int i = 0; i < SIZE; i++) {
                if(map[i][i] == symbol){
                    quantitySymbolInRow++;

                }else if(quantitySymbolInRow > 0){
                    quantitySymbolInRow = 0;
                }
                if (quantitySymbolInRow == DOTS_TO_WIN){
                    return true;
                }
        }
            //если есть в побочной диагонали
        quantitySymbolInRow = 0;
        for (int i = 0; i < SIZE; i++) {
            if(map[i][SIZE-i-1] == symbol){
                quantitySymbolInRow++;

            }else if(quantitySymbolInRow > 0){
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    //альтернативный сопособ заполнения
       /* for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY; */

    private static boolean mapIsFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }


    private static void aiTurn() {
        int x,y;
        do {

            x = new Random().nextInt(SIZE);
            y = new Random().nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[x][y] = DOT_O;
    }

    private static void humanTurn() {
        int x,y;
        do {
            System.out.println("Введи координаты");
            System.out.println("Введи Х");
            x = scanner.nextInt() - 1; //человек строки не с нуля считает
            System.out.println("Введи У");
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y)); //проверяем, попадает ли ход пользователя в пустое поле
        map[x][y] = DOT_X; //!true = false;
    }

    private static boolean isCellValid(int x, int y) {
        if(x >= 0 && x < SIZE && y >=0 && y < SIZE && map[x][y] == DOT_EMPTY){
            return true;
            // упрощение всего метода: return x >= 0 && x < SIZE && y >=0 && y < SIZE && map[x][y] == DOT_EMPTY;
        }
        return false;
    }

    private static void printMap() {
        System.out.println();
        for( int i = 1; i <= SIZE; i ++) { //выведем шапку угрового поля
            System.out.print(i + " " );
        }
        System . out . println();
        for (int i = 0; i < SIZE; i++) {
            System.out.println(); //энтервал после каждой новой строки
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }

        }
        System.out.println(); //чтобы строка "процесс закончен" отодвинулась
    }

    private static void initMap() {
        map = new char [SIZE][SIZE]; //выделим память под нужное нам поле, потом заполним
        for (char [] row : map)  { //метод принимает на вход только одномерные массивы, поэтому, заполняя, проходимя по каждой строке нашего.
            Arrays.fill(row, DOT_EMPTY); //дали массив и какими символами мы его заполняем
        }
    }
}

