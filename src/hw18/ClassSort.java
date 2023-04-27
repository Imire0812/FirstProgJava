package hw18;

import java.util.Arrays;

public class ClassSort {
    public static void sortDescending(int[] arr) {
        int n = arr.length;
        int temp = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 1; j < (n - i); j++) {
                if(arr[j - 1] < arr[j]) {
                    // меняем элементы местами
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 4};
        sortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }
}