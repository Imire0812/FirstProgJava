package hw21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LaptopArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество элементов в списке: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент №" + (i+1) + ": ");
            String element = sc.nextLine();
            list.add(element);
        }

        System.out.println("Введенный список: " + list);

        Collections.reverse(list);

        System.out.println("Список в обратном порядке: ");

        for (String element : list) {
            System.out.print(element + " ");
        }
    }
}