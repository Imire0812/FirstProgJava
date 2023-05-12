package hw40.shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("1", "Product A", "John", "123-456-7890", 100);
        order1.doublePrice();
        System.out.println(order1); // === Заказ ===


        Order order2 = new Order("2", "Product B", "Mary", "234-567-8901", 150);
        Order.triplePrice(order2);
        System.out.println(order2); // === Заказ ===


        Order order3 = Order.readOrder();
        System.out.println(order3);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        System.out.println(Order.getTotalOrder(orders));
    }
}
