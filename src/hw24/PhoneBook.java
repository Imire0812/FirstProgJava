package hw24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private static Map<String, String> contacts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить контакт");
            System.out.println("2 - Найти контакт");
            System.out.println("3 - Вывести все контакты");
            System.out.println("4 - Удалить контакт");
            System.out.println("0 - Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    findContact(scanner);
                    break;
                case 3:
                    printContacts();
                    break;
                case 4:
                    removeContact(scanner);
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
    private static void addContact(Scanner scanner) {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        System.out.println("Введите телефон:");
        String phone = scanner.nextLine();

        contacts.put(name, phone);
        System.out.println("Контакт добавлен");
    }
    private static void findContact(Scanner scanner) {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        String phone = contacts.get(name);
        if (phone != null) {
            System.out.println("Телефон: " + phone);
        } else {
            System.out.println("Контакт не найден");
        }
    }
    private static void printContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Контакты не найдены");
        } else {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
    private static void removeContact(Scanner scanner) {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        String phone = contacts.remove(name);
        if (phone != null) {
            System.out.println("Контакт удален");
        } else {
            System.out.println("Контакт не найден");
        }
    }
}