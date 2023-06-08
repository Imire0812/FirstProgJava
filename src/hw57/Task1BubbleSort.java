package hw57;

import java.util.ArrayList;
import java.util.Arrays;



public class Task1BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 5, 3, 7};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void bubbleSort(int[] array) {
        int right = array.length - 1;
        for (int i = 0; i < right; i++){
            if (array[i] > array[i + 1]){
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }

        }
    }

}
