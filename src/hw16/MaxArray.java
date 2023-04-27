package hw16;

public class MaxArray {
    public static void main(String[] args){
        int[] arr = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
