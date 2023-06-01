package hw51.w;

import java.util.Scanner;

public class MinimumEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите последовательность положительных чисел (разделенных пробелом): ");
        String input = scanner.nextLine();

        int minEven = Integer.MAX_VALUE;

        String[] numbers = input.split(" ");
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num > 0 && num % 2 == 0 && num < minEven) {
                minEven = num;
            }
        }

        if (minEven == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println("Минимальное четное число: " + minEven);
        }
    }
}