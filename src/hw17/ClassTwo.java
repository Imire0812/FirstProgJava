package hw17;

import java.util.Arrays;
import java.util.Random;

public class ClassTwo {
    public static void main(String[] args) {
        int[] numbers = new int[30];

        for (int i = 0; i < 30; i++) {
            numbers[i] = i + 1;
        }

        Random random = new Random();

        int[] randomArray1 = new int[15];
        int[] randomArray2 = new int[15];

        for (int i = 0; i < 15; i++) {
            randomArray1[i] = numbers[random.nextInt(30)];
            randomArray2[i] = numbers[random.nextInt(30)];
        }

        System.out.println("Изначальный массив: " + Arrays.toString(numbers));
        System.out.println("1 случайный массив: " + Arrays.toString(randomArray1));
        System.out.println("2 случайный массив: " + Arrays.toString(randomArray2));
    }
}
