package hw27;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Random random = new Random();

        // заполнение массива случайными числами 0 или 1
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = random.nextInt(2);
            }
        }

        // вычисление суммы для каждой строки
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                sum += array[i][j];
            }
            System.out.println("Сумма элементов в строке " + (i+1) + ": " + sum);
        }
    }
}