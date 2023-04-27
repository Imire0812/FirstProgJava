package hw13;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = sc.nextInt();
        int y2 = sc.nextInt();
        if ((x + y + x1 + y2)%2==0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
