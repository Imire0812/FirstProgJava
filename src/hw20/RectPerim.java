package hw20;

import java.util.Scanner;

public class RectPerim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введите число!");
            scanner.next();
        }
        double length = scanner.nextDouble();

        System.out.print("Введите ширину прямоугольника: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введите число!");
            scanner.next();
        }
        double width = scanner.nextDouble();

        while (length <= 0 || width <= 0) {
            System.out.println("Ошибка: введите положительное число!");
            System.out.print("Введите длину прямоугольника: ");
            length = scanner.nextDouble();
            System.out.print("Введите ширину прямоугольника: ");
            width = scanner.nextDouble();
        }

        double perimeter = 2 * (length + width);
        System.out.println("Периметр прямоугольника: " + perimeter);
    }
}
