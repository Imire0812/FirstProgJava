package hw27;

import java.util.ArrayList;

public class Fibonachi {
    public static void main(String[] args) {
        ArrayList<Integer> fibList = new ArrayList<>();
        fibList.add(1);
        fibList.add(1);
        for (int i = 2; i < 20; i++) {
            int fibNum = fibList.get(i-1) + fibList.get(i-2);
            fibList.add(fibNum);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(fibList.get(i) + " ");
        }
    }
}