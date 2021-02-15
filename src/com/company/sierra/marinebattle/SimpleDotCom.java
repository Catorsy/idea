package com.company.sierra.marinebattle;

import org.w3c.dom.ls.LSOutput;

//public class SimpleDotCom {
//
//    int [] locationCells; //объявили массив для хранения адреса ячеек
//    int numOfHits = 0;

//    String checkYourself(String guess); //проверяем попадание
//    void setLocationCells(int[] loc) //принимает челочисленный массив (хранящиеся 2,3,4)

/* public class SimpleDotCom {
    int [] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int [] locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess); //преобразуем строку в инт
        String result = "Мимо";

        for(int cell:locationCells){ //повторяем с каждой ячейкой из массива locationCells. Для каждого элемента cell в массиве locationCells.
            if (guess == cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}

  class SimpleDotComGame {
    public static void main (String [] args){
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper(); //прием пользовательского ввода
        SimpleDotCom theDotCom = new SimpleDotCom(); // сздаем объект "сайт"
        int randomNum = (int)(Math.random()*5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true){
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток.");
            }
        }

    }
}


class SimpleDotComTestDrive {
    public static void main (String [] args){
        SimpleDotCom dot = new SimpleDotCom();
            int [] locations = {2, 3, 4};
            dot.setLocationCells(locations);
            String userGuess = "2";
            String result = dot.checkYourself(userGuess);
        }
    }
*/