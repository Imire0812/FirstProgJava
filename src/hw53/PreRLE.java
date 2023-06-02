package hw53;

import java.util.Scanner;

public class PreRLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для сжатия: ");
        String line = scanner.nextLine();
        String result = preRle(line);
        System.out.println("Промежуточный результат сжатия: " + result);
        System.out.println(result);
    }
    public static String preRle(String line) {
        String result = "";
        Character prev = null; // никакого "предыдущего" ещё нет
        for (int i = 0; i < line.length(); ++i) {
            Character current = line.charAt(i);
            if (!current.equals(prev)) {
                result += current;
                prev = current;
            }
        }
        return result;
    }
}