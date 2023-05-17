package hw44;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String command;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Sell pizza ===");
        List<Order> orders = new ArrayList<>();
        Order current = new Order();
        System.out.println("Command:");
        System.out.println("1. Add pizza:");
        System.out.println("2. Finish order:");
        System.out.println("0. Close");

        command = scanner.nextLine();
        scanner.nextLine();
        switch (command){
            case "1" -> {
                current.addPizza(scanner);
            }
            case "2" -> {
                if(!current.ifEmpty()){
                    orders.add(current);
                    current = new Order();
                }
            }
            case "0" -> System.out.println("By by");
            default -> System.out.println("Not correct command " + command);

        } while (!command.equals("0"));
        double total = 0.0;
        for (Order order : orders){
            System.out.println(order);
            total += order.getTotal();
        }
        System.out.println("Total " + total);
    }
}