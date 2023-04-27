package hw22;

import java.util.Scanner;

public class AmoebaClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        int hours = scanner.nextInt();

        int initialAmoebas = 1;
        int amoebas = initialAmoebas * (int) Math.pow(2, hours / 3);

        System.out.println("Через " + hours + " часов будет " + amoebas + " амёб.");
    }
}
