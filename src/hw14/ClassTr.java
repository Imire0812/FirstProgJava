package hw14;

import java.util.Scanner;

public class ClassTr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    boolean weekDay;
    boolean vacation;
    boolean isSleeping = false;
        System.out.println("Today is a working day (enter - true/false)");
    weekDay = sc.nextBoolean();
        System.out.println("Today is vacation day (enter - true/false)");
    vacation = sc.nextBoolean();
        if (weekDay==false || vacation==true)
    isSleeping = true;
        System.out.println("Value of isSleeping - " + isSleeping);
    }
}