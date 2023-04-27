package hw13;

import java.util.Scanner;

public class ThreeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();

        int m1 = 0, m5 = 0, m10 = 0, m25 = 0;

        while (cost > 0){
            if (cost > 25){
                m25++;
                cost -=25;
            } else if (cost > 10){
                m10++;
                cost -=10;
            } else if (cost > 5){
                m5++;
                cost -=5;
            } else if (cost > 1){
                m1=cost;
                cost =0;
            }
        }
        System.out.println("25="+m25+", 10="+m10+", 5="+m5+", 1="+m1);
    }
}
