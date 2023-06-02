package hw52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = readList(scanner);
        System.out.println("Введите элемент для поиска: ");
        int x = scanner.nextInt();
        int i = indexOf(numbers, x);
        System.out.println("indexOf( " + numbers + ", " + x + " ) = " + i);
    }
    private static List<Integer> readList(Scanner scanner){
        List<Integer> result = new ArrayList<>();
        System.out.println("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.println("Введите элементы списка: ");
        for (int i = 0; i< size; ++i){
            result.add(scanner.nextInt());
        }
        scanner.nextLine();
        return result;
    }
    private static List<Integer> readSortList(Scanner scanner){
        List<Integer> result = readList(scanner);
        Collections.sort(result);
        return result;
    }

    /**
     * Бинарный поиск элемента в отсортированном по возрастанию списке
     * @param numbers отсортированный по возрастанию список
     * @param target число для поиска в списке
     * @return индекс элемента в списке или -1, если элемент не найден
     */
    private static int indexOf(List<Integer> numbers, int target){
        int result = -1;
        int left = 0;
        int right = numbers.size();
        while (left < right - 1){
            int mid = (left + right) / 2;
            int midElem = numbers.get(mid);
            if(midElem < target){
                left = mid + 1;
            } else if (midElem > target){
                right = mid - 1;
            } else {
                return mid;
            }
        }
        if (numbers.get(left) == target){
            return left;
        }
        return -1;
    }
}
