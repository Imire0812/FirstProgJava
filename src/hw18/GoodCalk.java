package hw18;

import java.util.Scanner;

public class GoodCalk {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
    public static int getOperation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        int operation = scanner.nextInt();
        return operation;
    }
    public static int[] getNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        int[] numbers = {a, b};
        return numbers;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int operation = getOperation();
            int[] numbers = getNumbers();

            int result = 0;

            switch (operation) {
                case 1:
                    result = add(numbers[0], numbers[1]);
                    break;
                case 2:
                    result = subtract(numbers[0], numbers[1]);
                    break;
                case 3:
                    result = multiply(numbers[0], numbers[1]);
                    break;
                case 4:
                    result = divide(numbers[0], numbers[1]);
                    break;
                default:
                    System.out.println("Ошибка! Неправильно выбрана операция.");
                    break;
            }

            System.out.println("Результат: " + result);

            System.out.println("Хотите продолжить работу с калькулятором? (y/n)");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("y")) {
                break;
            }
        } while (true);

        System.out.println("Спасибо за использование кальку");
}}
