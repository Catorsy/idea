package com.company;
import java.util.Arrays;

public class homework2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0};
        System.out.println("Задание №1. Имеем массив:");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else
                arr[i] = 1;
        }
        System.out.println("Инверсированный массив:");
        System.out.println(Arrays.toString(arr));

        ocho();
        seis();
        cuadro();
        comporacion();
        suma();
        suma2();
    }

    public static void ocho() {
        System.out.println("");
        System.out.println("Задание №2, получаем массив х3:");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void seis() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("");
        System.out.println("Задание №3. Имеем заданный массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Теперь в этом массиве увеличим числа, меньшие 6ти, в два раза.");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void cuadro() {
        System.out.println("");
        System.out.println("Задание №4. Квадратный двумерный массив, заполняем диагонали единицами:");
        System.out.println("Вариант 1:");
        int arr[][] = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
                if (i == j) {
                    arr[i][j] = 1;
                }
                if (i == j + 2) {  //чтобы получить только заполнение по главной диагонали, убрать это и нижеследующее условия
                    arr[i][j] = 1;
                }
                if (j == i + 2) {
                    arr[i][j] = 1;
                }
                System.out.print("a[" + i + "][" + j + "]=" + arr[i][j] + " ");
            }

        }

        int arr2[][] = new int[4][4];
        System.out.println("");
        System.out.println("");
        System.out.println("Вариант 2, побочная диагональ:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = 0;
                if (i + j == 3) {
                    arr2[i][j] = 1;
                }
                System.out.print("a[" + i + "][" + j + "]=" + arr2[i][j] + " ");
            }

        }

    }

    public static void comporacion() {
        int arr[] = {-7, -775, 32, 2, 1, 468, -12, 2, 4, 8, 9, 26};
        System.out.println("");
        System.out.println("");
        System.out.println("Задание №5. Возьмём такой массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Теперь найдём в нём самое маленькое и самое большое число.");
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Самое маленькое число массива: " + min);
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Самое большое число массива: " + max);
    }

    public static boolean suma() {

        int[] arr = new int[8]; //давайте сделаем его случайным
        System.out.println("");
        System.out.println("");
        System.out.println("Задание №6. Допустим, есть массив:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 - 5);
        }
        System.out.println(Arrays.toString(arr));
        if (arr[0] == arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] + arr[7]) {
            System.out.println("Первый элемент массива равен сумме остальных семи.");
            return true;
        } else if (arr[0] + arr[1] == arr[2] + arr[3] + arr[4] + arr[5] + arr[6] + arr[7]) {
            System.out.println("Сумма первых двух элементов массива равен сумме остальных шести.");
            return true;
        } else if (arr[0] + arr[1] + arr[2] == arr[3] + arr[4] + arr[5] + arr[6] + arr[7]) {
            System.out.println("Сумма первых трёх элементов массива равна сумме остальных пяти.");
            return true;
        } else if (arr[0] + arr[1] + arr[2] + arr[3] == arr[4] + arr[5] + arr[6] + arr[7]) {
            System.out.println("Сумма первых четырёх элементов массива равен сумме остальных четырёх.");
            return true;
        } else if (arr[0] + arr[1] + arr[2] + arr[3] + arr[4] == arr[5] + arr[6] + arr[7]) {
            System.out.println("Сумма первых пяти элементов массива равен сумме остальных трёх.");
            return true;
        } else if (arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] == arr[6] + arr[7]) {
            System.out.println("Сумма первых шести элементов массива равен сумме остальных двух.");
            return true;
        } else if (arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] == arr[7]) {
            System.out.println("Сумма первых семи элементов массива равна значению последнего элемента массива.");
            return true;
        } else
            System.out.println("Этот массив нельзя разделить на две равные части.");
        return false;
//вообще если для массивов существует что-то вроде функции "сложить n первых элементов массива и сравнить с arr.length - n, отсчитанных от конца", было бы здорово...
        //Хотя... давайте попробуем.

    }

    public static boolean suma2() {

        int[] arr = new int[8];
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 - 5);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Задание №6, вариант 2. Допустим, есть массив:");
        System.out.println(Arrays.toString(arr));
        int a = 0;
        int b = 0;
        int n = 1;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <= arr.length-1; j++) {
                a = a + arr[i];
                if (a == b) {
                    System.out.println("Этот массив можно разделить на две равные части.");
                    return true;
                }
                b = 0;
                n++;
                for (int m = arr.length - 1; m > j; m--) {
                    if(i > n) {
                        b = arr[arr.length-1];
                        break;
                    }else
                    b = b + arr[m];
                    if (a == b) {
                        System.out.println("Этот массив можно разделить на две равные части.");
                        return true;
                    }
                }
                break;
            }

        }
        if(b != a)
            System.out.println("Этот массив нельзя разделить на две равные части.");
            return false;
    }
}






