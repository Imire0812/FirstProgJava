package hw51.w;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortestWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество слов: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа

        List<String> words = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите слово: ");
            String word = scanner.nextLine();
            words.add(word);
        }

        List<String> shortestWords = findShortestWords(words);
        System.out.println("Самые короткие слова: " + String.join(" ", shortestWords));
    }

    private static List<String> findShortestWords(List<String> words) {
        List<String> shortestWords = new ArrayList<>();
        int shortestLength = Integer.MAX_VALUE;

        for (String word : words) {
            int length = word.length();
            if (length < shortestLength) {
                shortestLength = length;
                shortestWords.clear();
                shortestWords.add(word);
            } else if (length == shortestLength) {
                shortestWords.add(word);
            }
        }

        return shortestWords;
    }
}