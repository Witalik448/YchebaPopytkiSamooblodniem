package Proba;

public class Massa {
    public static void main(String[] args) {
        int[] nambers = {2, 5, 3, 8, 10};
        int sum = 0;

        for (int i = 0; i < nambers.length; i++) {
          sum += nambers[i];

        }
        System.out.println("Сумма"+sum);
    }
}
