package hw11;

import java.util.Scanner;

public class TwoTask {

    //Задача2
    public static void main(String[] args) {
        System.out.println("Решение квадратного уравнения по коэффициентам квадратного трехчлена а, b и с");
        System.out.println("Введите а, b и с");
        Scanner sc = new Scanner(System.in);

        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();

        Double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Единственный корень: x = " + x);
        }
        else {
            System.out.println("Уравнение ничего не имеет!");
        }

    }
}
