package com.company.lessons.lesson8;

public class Main2 {

    public static void main (String [] args) {
      // Cat cat = new Cat("Барсик", 3) нужны те, кто бегает!

        Runable [] runables = GenerateRunable.getRunables(); //iter ниже

        //cat.run();

        for (Runable runable : runables) {
            runable.run();
        }
//А если не надо, чтобы робот не бегал?
        for (Runable runable : runables) {
            boolean flag = runable instanceof Animal; //проверяем, действительно ли у нас Энимал
            if (runable instanceof Animal){
                runable.run();
            }
        }

    }
}
