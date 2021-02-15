package com.company.homework.homework9a;

public class homework9 {
    public static final int stroke = 4;
    public static final int column = 4;
    static String[][] exampel = new String[][]{
            {"5", "16", "-2", "0"},
            {"1", "6", "12", "11"},
            {"9", "90", "2", "-80"},
            {"2", "7", "20", "8"}
            //чтобы проверить, попадается ли рыба в сети для исключений, поменяйте в массиве а)длину строк б)длину столбцов в)измените в любой ячейке число на не-число.
    };

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Допустимое количество строк: 4");
        System.out.println("Допустимое количество столбцов: 4");
        System.out.println("Во всех элементах массива должны лежать числа!");

        try {
            suma(exampel);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println("\nДо свидания! Я отработал!");
    }

    public static void suma(String[][] exampel) throws MyArrayDataException, MyArraySizeException {
        if (exampel.length != stroke) {
            throw new MyArraySizeException();
        } else {
            for (String[] strings : exampel) {
                if (strings.length != column) {
                    throw new MyArraySizeException();
                }
            }

            int suma = 0;
            int[][] newArray = new int[4][4];

            for (int i = 0; i < stroke; i++) {
                for (int j = 0; j < column; j++) {
                    try {
                        newArray[i][j] = Integer.parseInt(exampel[i][j]);
                        suma += newArray[i][j];
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            System.out.println("\nСумма ячеек массива: " + suma);
        }
    }
}
