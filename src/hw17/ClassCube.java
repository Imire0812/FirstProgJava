package hw17;

import java.util.Random;

public class ClassCube {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] rolls = new int[10][2];
        for (int i = 0; i < 10; i++) {
            rolls[i][0] = rand.nextInt(6) + 1;
            rolls[i][1] = rand.nextInt(6) + 1;
        }
        System.out.println("Результаты бросков:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Бросок " + (i+1) + ": " + rolls[i][0] + ", " + rolls[i][1]);
        }
    }
}