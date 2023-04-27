package hw20;

import java.util.Arrays;
import java.util.Scanner;

public class NumberName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество имен: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите число!");
            scanner.next();
        }
        int n = scanner.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите имя " + (i + 1) + ": ");
            while (!scanner.hasNext("[a-zA-Z]+")) {
                System.out.println("Ошибка: введите имя без цифр и символов!");
                scanner.next();
            }
            names[i] = scanner.next();
        }

        Arrays.sort(names);

        System.out.println("Список имен:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
