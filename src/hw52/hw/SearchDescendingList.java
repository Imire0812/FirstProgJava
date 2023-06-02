package hw52.hw;

public class SearchDescendingList {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // элемент найден, возвращаем индекс
            } else if (arr[mid] > target) {
                left = mid + 1; // искомый элемент меньше значения в середине, идем вправо
            } else {
                right = mid - 1; // искомый элемент больше значения в середине, идем влево
            }
        }
        return -1; // элемент не найден
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 6, 4, 2}; // пример убывающего списка
        int target = 6; // искомое число
        int index = search(arr, target);

        if (index != -1) {
            System.out.println("Элемент найден по индексу: " + index);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}