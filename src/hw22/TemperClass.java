package hw22;

import java.util.Scanner;

public class TemperClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите температуру (например, 20C или 68F): ");
            String input = scanner.nextLine().trim().toUpperCase();

            char unit = input.charAt(input.length() - 1);
            if (unit != 'C' && unit != 'F') {
                System.out.println("Ошибка: неправильный формат температуры.");
                continue;
            }

            double value;
            try {
                value = Double.parseDouble(input.substring(0, input.length() - 1));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: неправильный формат температуры.");
                continue;
            }

            double convertedValue;
            if (unit == 'C') {
                convertedValue = (9.0 / 5.0) * value + 32;
                System.out.println(value + "C = " + convertedValue + "F");
            } else {
                convertedValue = (5.0 / 9.0) * (value - 32);
                System.out.println(value + "F = " + convertedValue + "C");
            }

            System.out.print("Хотите продолжить? (да/нет): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            if (!answer.equals("да")) {
                break;
            }
        }

        scanner.close();
    }
}
