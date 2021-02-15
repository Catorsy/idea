package com.company.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework4extra {

    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner scanner = new Scanner(System.in);

    public static int peligra = 3; //когда человек уже дышит в затылок //это реликт первой неудачной попытки сделать ИИ, мне жалко его стирать

    public static void main(String[] args) {
        initMap();
        printMap();
        boolean humanWin;
        boolean aiWin = false;
        do {
            humanTurn();
            printMap();
            humanWin = checkWin(DOT_X);
            if(humanWin){
                break;
            }
            aiTurn();
            if (mapIsFull()){
                break;
            }
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
                if (map[j][i] == symbol) {
                    quantitySymbolInRow++;
                } else if (quantitySymbolInRow > 0) {
                    quantitySymbolInRow = 0;
                }
                if (quantitySymbolInRow == DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        //что в диагоналях есть символы
        int quantitySymbolInRow = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) {
                quantitySymbolInRow++;

            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
                return true;
            }
        }

        //что в маленькой побочной диагонали 1 есть символы
        quantitySymbolInRow = 0;
        for (int i = 0; i < SIZE-1; i++) {
            if (map[i][SIZE-i-2] == symbol) {
                quantitySymbolInRow++;

            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
                return true;
            }
        }

        //что в маленькой побочной диагонали 2 есть символы
        quantitySymbolInRow = 0;
        for (int i = 1; i < SIZE; i++) {
            if (map[i][SIZE-i] == symbol) {
                quantitySymbolInRow++;

            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
                return true;
            }
        }

        //что в маленькой главной диагонали 1 есть символы
        quantitySymbolInRow = 0;
        for (int i = 0; i < SIZE-1; i++) {
            if (map[i][SIZE - 4 + i] == symbol) {
                quantitySymbolInRow++;

            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
                return true;
            }
        }

        //что в маленькой главной диагонали 2 есть символы
        quantitySymbolInRow = 0;
        for (int i = 1; i < SIZE; i++) {
            if (map[i][i-1] == symbol) {
                quantitySymbolInRow++;

            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
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
        int a = 0; //вспомогательная переменная, которая считает ходы компьютера
        if (!mapIsFull()) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY && a == 0) {
                        map[i][j] = DOT_X;
                        if (checkWin(DOT_X)) {
                            map[i][j] = DOT_O;
                            a++;
                            break;
                        }
                        if (!checkWin(DOT_X)) {
                            map[i][j] = DOT_EMPTY;
                        }
                    }
                }
            }
            if (a == 0) {
                aiTurn2(); //чуть-чуть изменив код "мешания ходам человека", мы можем сделать компьютер чуть-чуть умнее
            }
        }
    }

    private static void aiTurn2() {
        int a = 0;
        int x,y;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ((map[i][j] == DOT_EMPTY) && a == 0) {
                    map[i][j] = DOT_O;
                    if (checkWin(DOT_O)) {
                        a++;
                        break;
                    }
                    if (!checkWin(DOT_O)) {
                        map[i][j] = DOT_EMPTY;
                    }
                }
            }
        }

            if (a == 0) {
                do {
                    x = new Random().nextInt(SIZE);
                    y = new Random().nextInt(SIZE);
                } while (!isCellValid(x, y));
                map[x][y] = DOT_O;
            }
    }


    private static void humanTurn() {
        int x,y;
        do {
            System.out.println("Введи координаты");
            System.out.println("Введи номер строки");
            x = scanner.nextInt() - 1;
            System.out.println("Введи номер столбца");
            y = scanner.nextInt() - 1;
            if (!isCellValid(x, y)){
                System.out.println("Ты ввёл неверные координаты");
            }
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    private static boolean isCellValid(int x, int y) {
        if(x >= 0 && x < SIZE && y >=0 && y < SIZE && map[x][y] == DOT_EMPTY){
            return true;
        }else
            return false;
    }



    private static void printMap() {
        System.out.println();
        for( int i = 1; i <= SIZE; i ++) { //выведем шапку угрового поля
            System.out.print(i + " " );
        }
        System . out . println();
        for (int i = 0; i < SIZE; i++) {
            System.out.println();
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }

        }
        System.out.println();
    }

    private static void initMap() {
        map = new char [SIZE][SIZE];
        for (char [] row : map)  {
            Arrays.fill(row, DOT_EMPTY);
        }
    }
}