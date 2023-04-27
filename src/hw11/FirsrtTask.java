package hw11;

import java.util.Scanner;

public class FirsrtTask {
    //Задача1
    public static void main(String[] args) {
        System.out.println("Здравствуйте. Добро пожаловать на лунную экспедицию. ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Какое ваше имя?");
        String name = scanner.next();
        int l = name.length();
        System.out.println("Приветсвую, " + name.toUpperCase().charAt(0) + name.substring(1,l) + "!");
        String nameCorrect = name.toUpperCase().charAt(0) + name.substring(1,l);

        System.out.println("Ваш пол?");
        String gender = scanner.next();

        if ( gender.equalsIgnoreCase("Женский") || gender.equalsIgnoreCase("Female" )
                || gender.equalsIgnoreCase("Мужской" ) || gender.equalsIgnoreCase("Male" )) {
            System.out.println("Спасибо за инфомацию, продолжайте отвечать");
        } else {
            System.out.println("Очень жаль, но вы не подходите для этой экспедиции. " + nameCorrect);
            return;
        }
        System.out.println("Какой у вас вес?");
        int wh = scanner.nextInt();

        if (wh > 90){
            System.out.println("Ксожалению, наша космическая программа не расчитана на такой вес, спасибо за проявленный интерес.!");
        } else if (wh<=50) {
            System.out.println("Ксожалению, наша космическая программа не расчитана на такой вес, спасибо за проявленный интерес.!");
        } else {
            System.out.println("Спасибо за информацию, вы идеально подходите для этой программы");
        }

    }
}