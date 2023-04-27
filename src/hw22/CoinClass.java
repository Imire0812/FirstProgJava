package hw22;

import java.util.Scanner;

public class CoinClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество монеток: ");
        int n = scanner.nextInt();

        int[] coins = new int[n];
        System.out.println("Введите состояние каждой монетки (0 - герб, 1 - решка):");
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }

        int countHeads = 0;
        int countTails = 0;

        for (int coin : coins) {
            if (coin == 0) {
                countTails++;
            } else {
                countHeads++;
            }
        }

        int flipsNeeded;
        if (countHeads > countTails) {
            flipsNeeded = countTails;
        } else {
            flipsNeeded = countHeads;
        }

        System.out.println("Минимальное количество монеток, которые нужно перевернуть: " + flipsNeeded);

        scanner.close();
    }
}
