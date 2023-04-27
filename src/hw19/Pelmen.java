package hw19;

import java.util.Random;

public class Pelmen {
    public static void main(String[] args) {
        int[] pelmeni = new int[30];
        Random random = new Random();

        for (int i = 0; i < pelmeni.length; i++) {
            pelmeni[i] = 50 + random.nextInt(51);
        }

        int luckyIndex = random.nextInt(pelmeni.length);

        if (random.nextBoolean()) {
            pelmeni[luckyIndex] += 15;
        }

        System.out.println("Вес каждого пельменя:");
        for (int i = 0; i < pelmeni.length; i++) {
            System.out.println((i + 1) + ". " + pelmeni[i] + " грамм");
            if (i == luckyIndex) {
                if (pelmeni[i] > 50) {
                    System.out.println("Счастливый пельмень найден! Вес пельменя: " + pelmeni[i] + " грамм");
                } else {
                    System.out.println("К сожалению, счастливый пельмень не найден.");
                }
            }
        }
    }
}
