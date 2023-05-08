package hw36;

import java.util.ArrayList;
import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== заправочная станция =====");
        System.out.println("===== добро пожаловать Name plz: ===== ");
        String name = scanner.nextLine();

        System.out.println("сколько литров вам надо ");
        double quantity = 0.0;
        while (!scanner.hasNextDouble()){
            String wrongLine = scanner.nextLine();
            System.out.println("Не правильно " + wrongLine);
            System.out.println("Введите правильно: ");
        }
        quantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("как будете оплачивать: ");
        String paymentMethod = scanner.nextLine();
        boolean byCard = paymentMethod.toLowerCase().contains("card");

        System.out.println("===== ваш заказ ===== ");
        System.out.println("заказчик " + name);
        System.out.println("===== колличество топлива ===== " + quantity + " л ");
        double total = quantity * 2;
        System.out.println("стоимость заказа " + total + " EUR");
        if(byCard){
            System.out.println("заказ должен быть оплачен картой");
        } else {
            System.out.println("Наличка пожалуйста");
        }

        // Добавляем выполненный заказ в список
        ArrayList<String> orders = new ArrayList<>();
        orders.add("Заказчик: " + name + " | Количество топлива: " + quantity + " л | Стоимость: " + total + " EUR");

        // Выводим список выполненных заказов
        System.out.println("===== список выполненных заказов =====");
        for (String order : orders) {
            System.out.println(order);
        }
    }
}
