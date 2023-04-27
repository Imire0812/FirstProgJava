package hw29;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3Phonebook2 {
    private static final String SEP = ",";
    private static final File PHONEBOOK_FILE = new File("res/phonebook.csv");

    private static Map<String, String> readPhonebook() throws IOException {
        Map<String, String> phones = new HashMap<>();
        if (PHONEBOOK_FILE.exists()) {
            try (Scanner scanner = new Scanner(PHONEBOOK_FILE)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (!line.isEmpty()) {
                        int sepIndex = line.indexOf(SEP);
                        if (sepIndex != -1) {
                            String name = line.substring(0, sepIndex);
                            String phone = line.substring(sepIndex + 1);
                            phones.put(name, phone);
                        }
                    }
                }
            }
        }
        return phones;
    }
    private static void savePhonebook(Map<String, String> phones) throws IOException {
        try (FileWriter fileWriter = new FileWriter(PHONEBOOK_FILE)) {
            for (String owner : phones.keySet()) {
                fileWriter.write(owner + SEP + phones.get(owner) + "\n");
            }
        }
    }
    public static void main(String[] args) {
        try {
            Map<String, String> phones = readPhonebook();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя:");
            String name = scanner.nextLine();
            System.out.println("Введите номер телефона:");
            String phone = scanner.nextLine();
            phones.put(name, phone);
            for (String owner : phones.keySet()) {
                System.out.println(owner + ": " + phones.get(owner));
            }
            savePhonebook(phones);
        } catch (IOException e) {
            System.err.println("Ошибка чтения/записи файла телефонной книги: " + e.getMessage());
        }
    }
}