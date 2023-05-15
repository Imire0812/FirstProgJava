package hw42;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task1Collections {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 3,2,6,1,4);
        System.out.println("numbers = " + numbers);
        System.out.println("Collections.max(numbers) = " + Collections.max(numbers));
        System.out.println("Collections.min(numbers) = " + Collections.min(numbers));

        Collections.sort(numbers);
        System.out.println("sort: ");
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println("reverse: ");
        System.out.println(numbers);
    }
}