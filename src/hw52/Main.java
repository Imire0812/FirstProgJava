package hw52;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветсвует игра");
        System.out.println("Угадайте число от 1 до 1000");
        System.out.println("На вопросы отвечайте следующим оборазом");
        System.out.println("'>' если ваше число больше предложенного и т.п.");
        int left = 1;
        int right = 1000;
        while (left != right){ //сужаем гораницы влево
            int mid = (left + right) / 2;// ищем середину
            System.out.println("Ваше число: " + mid + " ?");
            String response = scanner.nextLine();
            switch (response){
                case ">":
                    left = mid + 1;
                    break;
                case "<":
                    left = mid - 1;
                    break;
                case "=":
                    System.out.println("Ура");
                    return;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        System.out.println("Your number " + left);
    }
}
