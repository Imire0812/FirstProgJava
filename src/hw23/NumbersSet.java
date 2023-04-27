package hw23;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumbersSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество вводимых чисел: ");
        int n = scanner.nextInt();

        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        numbers.removeIf(num -> num > 10);

        System.out.println("Числа, не превышающие 10: ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
