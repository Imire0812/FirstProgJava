package hw52;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int square = scanner.nextInt();
        int left = 0;
        int right = square;
        while (left < right){
            int mid = (left + right) / 2;
            int res = painted(mid);
            if (res >= square){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Потребуется " + left + " дней");
    }
    public static int painted(int days){
        int petya = 5;
        int vanya = 4;
        return petya * days + vanya * days;
    }
}
