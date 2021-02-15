package com.company.homework.homework9a;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        super("Неверные данные. В ячейке [" + i + "][" + j + "] лежит не число. Если ты не программист, то ищи ошибку в строке " + (i + 1) + " столбце " + (j + 1));
    }
}
