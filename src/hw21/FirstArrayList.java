package hw21;

import java.util.*;

public class FirstArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(34, 34, 54, 12, 98, 17, 32, 15));
        for (Integer s : numbers) {
            System.out.print(" " + s + " ");
        }
        System.out.println();
        int length = numbers.size();
        System.out.println("Размер листа списка: "+ length);

        int index = numbers.indexOf(17);
        System.out.println("Узнаем индекс нужного элемента: " + index);

        numbers.remove(3);
        for (Integer s : numbers) {
            System.out.print(" " + s + " ");
        }
        System.out.println();

        System.out.println(numbers.contains(11) + " нужный элемент");

        Set<Integer> set = new LinkedHashSet<>(numbers);
        System.out.println(set);

        for (int i = 0; i < numbers.size(); i++ ){
            System.out.println(i + ": " + numbers.get(i));
        }
        for (int counter : numbers){
            System.out.print(counter + " ");
        }
        System.out.println();
            Collections.sort(numbers);
            for (int count : numbers) {
                System.out.print(count + " ");
            }
    }
}
