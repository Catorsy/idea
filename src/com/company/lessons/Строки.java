package com.company.lessons;

public class Строки {
    public static void main (String [] args){
        String str = "Hey!";
        String str1 = new String ("Hey!!");
        String str2 = new String(str);
        String str3 = new String (new char [] {'f', 'b'});
        String str4 = new String (new byte[] {56, 55, 57});
        String str5 = str1.toUpperCase();
        int a = str4.length();
        System.out.println(str.charAt(1)); //выковыриваем символ

        /* String [] charArray;
        charArray = new String[10]; */

        System.out.println(str.equals(str2));
        boolean b = (str.equals(str1));

        System.out.println(str + str1 + str2 + str3 + str4 + str5 + a + b);

        String originalString = "name"; //преобразование строки в массив
        char[] charArray = originalString.toCharArray();

        String[] stringArray = new String[charArray.length];
        for (int i = 0; i < charArray.length; i++){
            stringArray[i] = String.valueOf(charArray[i]);
            System.out.println(stringArray[i]);
        }

        int n = 200; //преобразовываем примитив в строку
        String str8 = String.valueOf(n);
        System.out.println(str8);

        String ai = "aaa";
        String ii = "aaa";
        System.out.println(ai.equals(ii)); //эти два объекта лежат в одном месте. Можем их сравнивать и через равно
        System.out.println(ai == ii);
        //НО: если мы создадим новый объект, так не получится
        String aa = new String("aaa");
        System.out.println(aa == ai);
        System.out.println(ai.equals(aa)); // а так получится
        //System.out.println(ai.equals(Man.ii))  это если бы брали для сравнения переменную ИИ из класса Мэн

        String cut = "01234567";
        System.out.println(cut.substring(2)); //вырезаем, начиная с ячейки 2
        System.out.println(str.equalsIgnoreCase(str1)); //сравним, игнорируя регистр

        StringBuilder builder = new StringBuilder(); //классы для работы с изменяемыми строками
        for (int i = 0; i < 10; i++) { //билдер для однопоточных программ. Быстрее баффера
            builder.append(i); //append - это добавить в StringBuilder
        }
        System.out.println(builder.toString());

        StringBuffer buffer = new StringBuffer(); //для многопоточных программ
    }


}
