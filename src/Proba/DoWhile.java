package Proba;

import java.util.Scanner;

//Программа должна запрашивать у пользователя положительное число, пока он не введёт корректное значение.
public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chislo;

        do {
            System.out.println("Введи положительное ");
            chislo = scanner.nextInt();
        }while (chislo <=0);
        System.out.println("Респект дон");
    }
}

