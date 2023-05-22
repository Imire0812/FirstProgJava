package hw44.Exeption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            System.out.println("Полный путь к файлу: " + file.getAbsolutePath());
            System.out.println("Файл существует: " + file.exists());
            Scanner scanner = new Scanner(file);
            int sum = 0;
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
            }
            System.out.println("Сумма чисел: " + sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден!");
        }
    }
}