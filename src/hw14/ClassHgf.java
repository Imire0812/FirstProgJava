package hw14;

import java.util.Scanner;

public class ClassHgf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        int i = 0;
        while (i<=num) {
            System.out.println("Result  " + num + " * " + i + " = " + (num*i));
            i++;
        }
    }
}

