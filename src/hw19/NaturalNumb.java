package hw19;

import java.util.Scanner;

public class NaturalNumb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех натуральных чисел меньше " + n + ", за исключением чисел, кратных числу 3, равна " + sum);
    }
}