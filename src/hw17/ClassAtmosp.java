package hw17;

import java.util.Scanner;

public class ClassAtmosp {
    public static void main(String[] args) {
        int[] presAtmos = new int[7];
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите данные атмосферного давления за неделю:");

        for (int i = 0; i < presAtmos.length; i++) {
            System.out.printf("День %d: ", i + 1);
            presAtmos[i] = sc.nextInt();
        }

        int maxPressure = presAtmos[0];
        int maxPressureIndex = 0;

        int minPressure = presAtmos[0];
        int minPressureIndex = 0;

        for (int i = 1; i < presAtmos.length; i++) {
            if (presAtmos[i] > maxPressure) {
                maxPressure = presAtmos[i];
                maxPressureIndex = i;
            }

            if (presAtmos[i] < minPressure) {
                minPressure = presAtmos[i];
                minPressureIndex = i;
            }
        }
        System.out.printf("Максимальное давление %d было достигнуто в день %d.%n", maxPressure, maxPressureIndex + 1);
        System.out.printf("Минимальное давление %d было достигнуто в день %d.%n", minPressure, minPressureIndex + 1);
    }
}