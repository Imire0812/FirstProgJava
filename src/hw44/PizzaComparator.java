package hw44;

import java.util.Comparator;

public class PizzaComparator implements Comparator<Pizza> {

    @Override
    public int compare(Pizza pizza1, Pizza pizza2) {
        // Compare by title
        int titleComparison = pizza1.getTitle().compareTo(pizza2.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }


        // Compare by cheesy border
        boolean cheesyBorder1 = pizza1.hasCheesyBorder();
        boolean cheesyBorder2 = pizza2.hasCheesyBorder();
        if (cheesyBorder1 && !cheesyBorder2) {
            return 1; // pizza1 comes after pizza2
        } else if (!cheesyBorder1 && cheesyBorder2) {
            return -1; // pizza1 comes before pizza2
        }

        return 0; // pizzas are equal
    }
}