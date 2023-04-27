package hw13;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int num = sc.nextInt();

    while (num > 0){
        System.out.println(str);
        num--;
    }}
}
