package hw36;

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
        int orders = scanner.nextInt();
        //if (scanner.hasNextDouble()){
            quantity = scanner.nextDouble();
        //}
        scanner.nextLine();

        System.out.println("как будете оплачивать: ");
        String paymantMetod = scanner.nextLine();
        boolean byCart = paymantMetod.toLowerCase().contains("cart");

        System.out.println("===== ваш заказ ===== ");
        System.out.println("заказчик " + name);
        System.out.println("===== колличество топлива ===== " + quantity + " л ");
        double total = quantity * 2;
        System.out.println("стоимость заказа " + total + " EUR");
        if(byCart){
            System.out.println("заказ доджен оплачиваться картой");
        } else {
            System.out.println("Наличка плиз");
        }
    }
}
