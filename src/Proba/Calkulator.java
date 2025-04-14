package Proba;

import java.util.Scanner;
//Программа предлагает пользователю выполнить арифметические операции (+, -, *, /)до тех пор, пока он не введёт 0 для выхода.
public class Calkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        do {
            System.out.println("Введите оператор (+, -, *, /)или напиши 0 для выхода из программы");
            operator = scanner.next().charAt(0);

            if (operator == '0') break;

            System.out.println("Введи два числа:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            switch (operator) {
                case '+':
                    System.out.println("Результат: " + (a + b));
                    break;
                case '-':
                    System.out.println("Результат: " + (a - b));
                    break;
                case '*':
                    System.out.println("Результат: " + (a * b));
                    break;
                case '/':
                    if (b != 0) System.out.println("Результат:" + (a / b));
                    else System.out.println("Ошибка деления на ноль");
                    break;
                default:
                    System.out.println("Неверный оператор");
            }
        }while (operator !=0);
        System.out.println("Программа завершина.");
    }
}
