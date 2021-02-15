package com.company.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
       int guess = 0;
        int respuesta;
        do {
            int cifra = (int)(Math.random() * 10);
            game(cifra, guess);
            Scanner sc = new Scanner(System.in);
            System.out.println("Вы хотите сыграть ещё раз? Введите 1, если да, и 0, если нет.");
            respuesta = sc.nextInt();
        }while(respuesta == 1);
        apple();
    }

    private static void game(int cifra, int guess) {
         int usuario;
         System.out.println("Компьютер загадал число от 0 до 9. Попробуйте угадать его. У Вас 3 попытки");
         do {
             usuario = getUsuario();
             guess++;
             if (usuario > cifra){
                 System.out.println("Ваше число слишком большое.");
             } if(usuario < cifra){
                 System.out.println("Ваше число слишком маленькое.");
             } if(usuario == cifra){
                 System.out.println("Поздравляю! Вы угадали.");
                 break;
             }
         } while (guess < 3);
         if(usuario != cifra) {
             System.out.println("Вы проиграли! Компьютер загадал число " + cifra + ".");
         }
     }

     private static int getUsuario() {
         int usuario;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Введите Ваше число:");
         usuario = scanner.nextInt();
         return usuario;
     }
     // я думала о том, чтобы добавить условие проверки вводимого числа (от 0 до 9ти),
     // но потом решила, что если пользователь не соблюдает условия, сам дурак, минус попытка ))

    private static void apple() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println();
        System.out.println(Arrays.toString(words)); //это подсказка, которую для увеличения сложности можно закомментировать.
        int cifra = (int) (1+ Math.random() * 25);
        int sucess = 0; //сколько букв угадали
        int max = 0; //узнаем, сколько символов имеет смысл перебирать
        int extra = 0; //введем переменную, чтобы проверять, не добавляет ли игрок в конце угаданного слова лишний хвост.


        String question = words[cifra - 1];
        //System.out.println(question);
        // чтобы было легче тестировать код, строчку выше можно раскомментировать, она покажет загаданное слово.
        Scanner sc = new Scanner(System.in);
        System.out.println("Компьютер загадал что-то съестное и вкусное. Угадайте это слово. Используем английский язык.");
        do {
            if ((sucess == question.length() && extra > question.length())){
                System.out.println("\n Вы близко! Подберите хвост!");
            }

            sucess = 0;
            String respuesta = sc.nextLine();
            System.out.println("Вы ввели: " + respuesta + ". Посмотрите, что Вы угадали.");
            int [] question2 = new int [question.length()]; //здесь храним вопрос
            int answer2 [] = new int [respuesta.length()];

            for (int i = 0; i < question.length(); i++) { //это разложили посимвольно вопрос
                char result1 = question.charAt(i);
                question2[i] = result1;
            }

            extra = 0;
            for (int i = 0; i < respuesta.length(); i++) { //разложили посимвольно ответ
                char result2 = respuesta.charAt(i);
                answer2[i] = result2;
                extra++;
            }

                if (max < respuesta.length()) { //ищем, сколько символов перебирать
                    max = respuesta.length();
                }
                    if (respuesta.length() > question.length()){
                        max = question.length();
                    }

            for (int i = 0; i < max; i++) {
                if(question2[i] == answer2[i]) {
                    sucess++;
                    char finali = question.charAt(i);
                    System.out.print(finali);
                }

                    if(question2[i] != answer2[i]){
                        break;
                    }
                }

            max = 0;
            for (int i = 0; i < (15-sucess); i++) { //пишем маскировочные решеточки
                System.out.print("#");
            }
            if(sucess != question.length()) {
                System.out.println("\n Попробуйте ещё раз.");
            }

        } while (sucess != question.length() || extra != question.length());
        System.out.println("\n Ура! Вы угадали всё вкусное слово!");

    }
}
