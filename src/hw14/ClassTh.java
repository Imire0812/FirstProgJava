package hw14;

import java.util.Scanner;

public class ClassTh {
    public static void main(String[] args) {
        System.out.println("Enter 1 numbers: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numbersCount = String.valueOf(number).length();
        System.out.println(numbersCount);
    }
}