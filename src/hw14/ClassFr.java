package hw14;

import java.util.Scanner;

public class ClassFr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter action or + or * or - or /");
        int rez;
        char d = sc.next().charAt(0);

        switch (d){
            case '+':
                rez = n1 + n2;
                System.out.println(rez);
                break;
            case '-':
                rez = n1 - n2;
                System.out.println(rez);
                break;
            case '*':
                rez = n1 * n2;
                System.out.println(rez);
                break;
            case '/':
                double rez2 = (double) n1 / n2;
                System.out.println(rez2);
                break;
        }
    }
}