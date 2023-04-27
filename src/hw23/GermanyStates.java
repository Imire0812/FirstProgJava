package hw23;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GermanyStates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество вводимых названий земель в Германии: ");
        int n = scanner.nextInt();

        Set<String> states = new HashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите название земли: ");
            String state = scanner.next();
            states.add(state);
        }

        System.out.println("Введенные названия земель в Германии: ");
        for (String state : states) {
            System.out.println(state);
        }
    }
}
