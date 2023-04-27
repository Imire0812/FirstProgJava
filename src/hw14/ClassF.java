package hw14;

import java.util.Scanner;

public class ClassF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char str = sc.nextLine().toLowerCase().toCharArray()[0];

        switch (str) {
            case 'a':
                System.out.println();
            case 'e':
                System.out.println();
            case 'i':
                System.out.println();
            case 'o':
                System.out.println();
            case 'u':
                System.out.println();
            case 'y':
                System.out.println();
            default:{

                System.out.println("Буква "+str+" coгласная");
            }
        }
    }
}