package com.company.lessons.lesson8;

public enum fruits {
    ORANGE ("Апельсин", 3), APPLE ("Яблоко", 3), BANANA ("Банан", 2), CHERRY ("Вишня", 1);
    private String russianTitle;
    private int weight;

    public String getRussianTitle () {
        return russianTitle;
    }

    public int getWeight() {
        return weight;
    }

    fruits (String russianTitle, int weight) {
        this.russianTitle = russianTitle;
        this.weight = weight;
        //this.volume = weight * 2;
    }
}

class Main {
    public static void main (String [] args) {
        for (fruits fruit : fruits.values()) {
            System.out.println("Средний вес фрукта составляет: " + fruit.getRussianTitle() + " " + fruit.getWeight() + " ед.");
        }
    }
}
