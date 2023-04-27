package hw12;

import java.util.Scanner;

public class FirstT {
    //Задача 1
    public static void main(String[] args) {
        System.out.println("Введите номер месяца и год, сначала номер месяца, потом год:  ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        switch (month){
            case 1:
                System.out.println(" January, 31 days");
                break;
            case 2:
                System.out.println(" February ");
                if ( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ) ) {
                    System.out.println(year + " leap year 29 days.");
                }
                else {
                    System.out.println(year + " not a leap year 28 days.");
                }
                break;
            case 3:
                System.out.println(" March, 31 days");
                break;
            case 4:
                System.out.println(" April, 30 days");
                break;
            case 5:
                System.out.println(" May, 31 days");
                break;
            case 6:
                System.out.println(" June, 30 days");
                break;
            case 7:
                System.out.println(" July, 31 days");
                break;
            case 8:
                System.out.println(" August, 31 days");
                break;
            case 9:
                System.out.println(" September, 30 days");
                break;
            case 10:
                System.out.println(" October, 31 days");
                break;
            case 11:
                System.out.println(" november, 30 days");
                break;
            case 12:
                System.out.println(" December, 31 days");
                break;
            default:
                System.out.println("Oooops, repeat please!");
                break;
        }
        }
    }
