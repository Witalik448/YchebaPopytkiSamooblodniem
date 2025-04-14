package Proba;

import java.util.Scanner;
//Программа просит пользователя ввести число от 1 до 10. Если введено неверное число — повторяет запрос
public class OdinDvaTri {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int chislo;

        do {
            System.out.println("Введи чило от 1 до 10");
            chislo = scaner.nextInt();
        }while (chislo <1 || chislo >10);
        System.out.println("Молодец дон" + chislo);

    }
}
