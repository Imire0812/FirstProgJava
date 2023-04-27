package hw25konv;

import java.util.HashMap;
import java.util.Scanner;

public class Convert {
    private static final String BASE_CURRENCY = "EUR"; // Основная валюта
    private HashMap<String, Double> exchangeRates; // Хранит курсы обмена валют

    public Convert() {
        exchangeRates = new HashMap<String, Double>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.73);
        exchangeRates.put("CAD", 1.25);
        exchangeRates.put("JPY", 108.75);
    }


    public void convertCurrency() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите валюту для конвертации:");
        int i = 1;
        for (String currency : exchangeRates.keySet()) {
            System.out.println(i + ". " + currency);
            i++;
        }

        int choice;
        int choice2;
        do {
            System.out.print("Выберите номер валюты 1: ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > exchangeRates.size());

        do {
            System.out.print("Выберите номер валюты: ");
            choice2 = scanner.nextInt();
        } while (choice2 < 1 || choice2 > exchangeRates.size());

        String targetCurrency = "";
        i = 1;
        for (String currency : exchangeRates.keySet()) {
            if (i == choice) {
                targetCurrency = currency;
                break;
            }
            i++;
        }

        i = 1;
        for (String currency : exchangeRates.keySet()) {
            if (i == choice2) {
                targetCurrency = currency;
                break;
            }
            i++;
        }

        String targetCurrency2 = "";
        i = 1;
        for (String currency2 : exchangeRates.keySet()) {
            if (i == choice) {
                targetCurrency2 = currency2;
                break;
            }
            i++;
        }

        System.out.println("Введите сумму в " + BASE_CURRENCY + ":");
        double amount = scanner.nextDouble();
        double exchangeRate = exchangeRates.get(targetCurrency);
        double result = amount / exchangeRate;

        System.out.printf("%.2f %s = %.2f %s\n", amount, BASE_CURRENCY, result, targetCurrency);
    }
    public static void main(String[] args) {
        Convert converter = new Convert();
        converter.convertCurrency();
    }
}