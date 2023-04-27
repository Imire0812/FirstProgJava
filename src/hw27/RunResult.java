package hw27;

import java.util.*;

public class RunResult {
    public static void main(String[] args) {

        // Создание HashMap для хранения результатов забега
        Map<String, Double> results = new HashMap<>();
        results.put("Студент 1", 10.85);
        results.put("Студент 2", 10.93);
        results.put("Студент 3", 10.98);
        results.put("Студент 4", 11.03);
        results.put("Студент 5", 11.05);
        results.put("Студент 6", 11.12);
        results.put("Студент 7", 11.14);
        results.put("Студент 8", 11.20);
        results.put("Студент 9", 11.28);
        results.put("Студент 10", 11.35);

        // Создание ArrayList для сортировки результатов забега
        List<Map.Entry<String, Double>> sortedResults = new ArrayList<>(results.entrySet());
        Collections.sort(sortedResults, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));

        // Вывод отсортированных результатов забега
        System.out.println("Результаты забега:");
        for (Map.Entry<String, Double> entry : sortedResults) {
            System.out.printf("%s: %.2f сек.\n", entry.getKey(), entry.getValue());
        }

        // Вывод имени участника, занявшего первое место
        System.out.println("Первое место занял: " + sortedResults.get(0).getKey());

        // Вывод имени участника, занявшего последнее место
        System.out.println("Последнее место занял: " + sortedResults.get(sortedResults.size() - 1).getKey());
    }
}