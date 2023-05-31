package hw50;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainSecond {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество записей в телефонной книге: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите записи (номер телефона и имя):");
        for (int i = 0; i < count; i++) {
            System.out.print("Номер телефона: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Имя: ");
            String name = scanner.nextLine();

            phoneBook.put(phoneNumber, name);
        }

        System.out.print("Введите имя для удаления: ");
        String nameToRemove = scanner.nextLine();

        Map<String, String> updatedPhoneBook = new HashMap<>(phoneBook);
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(nameToRemove)) {
                updatedPhoneBook.remove(entry.getKey());
            }
        }

        System.out.println("Результат:");
        for (Map.Entry<String, String> entry : updatedPhoneBook.entrySet()) {
            System.out.println("Номер телефона: " + entry.getKey() + ", Имя: " + entry.getValue());
        }
    }
}
