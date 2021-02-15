package com.company;

/* import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class cruznull {
    public static char[][] map; //готовим поле и его размерность под игру
    public static final int SIZE = 3; // такую переменную можно объявить только раз
    public static final int DOTS_TO_WIN = 3; //количество точек, необходимых до победы

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';

    public static Scanner scanner = new Scanner(System.in); //объявляем, чтобы могли считать из консоли что вводит пользователь

    public static void main (String[] args) {
        intiMap();
        printMap();
        do {
            humanTurn();
            printMap();
            aiTurn();
            printMap();
            humanWin = checkWin(DOT_X);
            aiWin = checkWin(DOT_0);
        } while (!mapIsFull() || checkWin(DOT_X) || checkWin(DOT_0)); //провряем, можно еще дальше ходить или нет, не полна ли карта, не выиграл ли кто
        if (humanWin) {
            System.out.println("Победил человек!");
        }
        if (aiWin) {
            System.out.println("Победил компьютер!");
        }

if(!(humanWin || aiWin)){

}
    }

    private static boolean checkWin(char symbol) {
        // что надо проверить: что в строке есть нужное кол-во символов подряд;
        // что в столбце есть нужное кол-во символов подряд;
        // что в диагоналях будет нужное кол-во символов подряд.
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

        for (char[] row : map) {
            int quantitySymbolInRow = 0;
            for (int j = 0; j < SIZE; j++) {
                if (row[j] == symbol) {
                    quantitySymbolInRow++;
                } else if (quantitySymbolInRow > 0) {
                    quantitySymbolInRow = 0;
                }
                if (quantitySymbolInRow == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        int quantitySymbolInRow = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    quantitySymbolInRow++;
                } else if () (quantitySymbolInRow > 0) {
                    quantitySymbolInRow = 0;
                }
                if () {

                }
            }
        }
    }

    private static boolean mapIsFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == DOT_EMPTY]){
                    return false;
                }
            }
        }
    }

    public static void aiTurn(){ //это вход человека
        int x,y;
        do {
            x = new Random().nextInt(SIZE);
            y = new Random().nextInt(SIZE);
        }while (!isCellValid(x, y)); //! это отрицание, !true = false
        map[x][y] = DOT_0;
    }

    public static void humanTurn(){ //это вход человека
        int x,y;
        do {
            System.out.println("Введите координаты");
            System.out.println("Введите Х");
            x = scanner.nextInt() -1;
            System.out.println("Введите Y");
            y = scanner.nextInt() -1;
        }while (!isCellValid(x, y)); //! это отрицание, !true = false
        map[x][y] = DOT_X;
    }

    private static boolean isCellValid(int x, int y){
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE && map[x][y] == DOT_EMPTY;
    }

    public static void printMap() { //выводим карту на экран
        for(int i = 0; i < SIZE; i++) {
            System.out.println();
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
        }
        System.out.println();
    }
    private static void intiMap(){ //заполняем карту точечками
        map = new char[SIZE][SIZE];
        for (char[] row : map){
            Arrays.fill(row, DOT_EMPTY);
        }
    }
}



   /* public static void main (String [] args){
    map = new char [SIZE][SIZE];
    for (char[] row : map){
    Arrays.fill(row, DOT_EMPTY);
}
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
} */
