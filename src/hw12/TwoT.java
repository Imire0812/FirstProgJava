package hw12;

import java.util.Scanner;

public class TwoT {
    //Задача 2
    public static void main(String[] args) {
        System.out.println("Ведите два значения: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = a < b ? a : b;
        System.out.println("Минимальное значение равно: " + min);
    }
}
