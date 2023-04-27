package hw18;

import java.util.Scanner;

public class CircleArea {
    public static double calculateCircleArea(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius should be a positive number.");
        }

        double area = Math.PI * Math.pow(radius, 2);
        return Math.round(area * 1000.0) / 1000.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double area = calculateCircleArea(a);
        System.out.println(area);
    }
}
