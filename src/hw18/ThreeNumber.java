package hw18;

import java.util.Scanner;

public class ThreeNumber {
    public static int maxOfThree(int a, int b, int c) throws IllegalArgumentException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("All numbers should be positive integers.");
        }
        return Math.max(Math.max(a, b), c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = maxOfThree(a, b, c);
    }
}
