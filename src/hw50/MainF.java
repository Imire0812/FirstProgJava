package hw50;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainF {
    public static void main(String[] args) {
        Set<Integer> numbersSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        System.out.println("Введите числа:");
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            numbersSet.add(number);
        }

        Set<Integer> evenNumbersSet = new HashSet<>();
        for (int number : numbersSet) {
            if (number % 2 == 0) {
                evenNumbersSet.add(number);
            }
        }

        System.out.println("Результат:");
        for (int number : evenNumbersSet) {
            System.out.println(number);
        }
    }
}
