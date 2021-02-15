package com.company;

class Testic {

    public static void main(String args[]) {
        String s = "Я буду хорошим программистом!";
        char result1 = s.charAt(8);
        char result2 = s.charAt(11);
        char result3 = s.charAt(10);
        if (result3 == result1){
            System.out.println("Ура!");
        }else
            System.out.println("Хуй");
        System.out.println("Восьмой символ строки - " + result1);
        System.out.println("Одиннадцатый символ строки - " + result2);
    }
}