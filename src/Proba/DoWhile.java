package Proba;

import java.util.Scanner;

public class DoWhile {
    //Программа должна запрашивать у пользователя положительное число, пока он не введёт корректное значение.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи положительное число!!!");
        int chislo = s.nextByte();
        do {
            System.out.println("Дурень это разве положительное число?");
            chislo = s.nextByte();
        } while (chislo <=0);
        System.out.println("Леу мужчина ");
    }
}
