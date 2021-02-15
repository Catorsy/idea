package com.company.homework;

import java.util.Scanner;

public class EmployeeHomework5 { //класс
    private String name;
    private String work;
    private String email;
    private String telephoneNumber;
    private int money;
    private int age;

    public EmployeeHomework5(String name, String work, String email, String telephoneNumber, int money, int age) { //конструктор класса
        this.name = name;
        this.work = work;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.money = money;
        this.age = age;
    }

    public static void main(String[] args) {
        EmployeeHomework5[] persArray = new EmployeeHomework5[5];
        persArray[0] = new EmployeeHomework5("Макар Рыбкин", "администратор", "makadm@mail.ru", "+79268761546", 83000, 42);
        persArray[1] = new EmployeeHomework5("Луиза Антуанетта Лопес Гарсия", "переводчик", "dulcedulce@gmail.com", "+342894018", 62000, 29);
        persArray[2] = new EmployeeHomework5("Джон Уик", "киллер", "babajaga@gmail.com", "+52983291758", 640000, 56);
        persArray[3] = new EmployeeHomework5("Мей Линь", "водитель", "sakura1493@gmail.com", "+86175619931782", 50000, 22);
        persArray[4] = new EmployeeHomework5("Смелый", "поводырь", "none", "none", 0, 4);

        Scanner scanner = new Scanner(System.in);
        int answer;
        System.out.println();
        System.out.println("Вы хотите увидеть информацию обо всех сотрудниках? Введите 1, если да, и 2, если только о тех, кому больше сорока лет.");
        answer = scanner.nextInt();
        if (answer == 1) {
            info(persArray);
        } else if (answer == 2) {
            only40(persArray);
        } else {
            System.out.println("Такого ответа не предусмотрено.");
        }

    }

    private static void info(EmployeeHomework5[] persArray) {
        for (int i = 0; i < persArray.length; i++) {
            System.out.println("\nФИ: " + persArray[i].name + "\nВозраст: " + persArray[i].age + "\nДолжность: " + persArray[i].work + "\nE-mail: " + persArray[i].email + "\nТелефон: " + persArray[i].telephoneNumber + "\nЗарплата: " + persArray[i].money);
        }
    }


    private static void only40(EmployeeHomework5[] persArray) {
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age >= 40) {
                System.out.println("\nФИ: " + persArray[i].name + "\nВозраст: " + persArray[i].age + "\nДолжность: " + persArray[i].work + "\nE-mail: " + persArray[i].email + "\nТелефон: " + persArray[i].telephoneNumber + "\nЗарплата: " + persArray[i].money);
            }
        }
    }
}
