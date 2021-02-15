package com.company.homework.homework9a;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Массив имеет неподходящий размер.");
    }
}