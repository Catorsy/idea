package com.company.homework.homework8;

public class CreateMembers {

    public static Member [] getMembers(){
        Member cat = new Cat ("Мурка", "лапки", 2, 1000);
        Member human = new Human ("Борис", "ноги", 3000, 1);
        Member robot = new Robot ("АЩЖ-200", "пружинки", 5, 100);
        return new Member[] {cat, human, robot};
    }
}
