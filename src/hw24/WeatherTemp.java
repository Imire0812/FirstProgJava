package hw24;

import java.util.HashMap;

public class WeatherTemp {
    public static void main(String[] args) {
        HashMap<String, Double> temperatures = new HashMap<String, Double>();
        temperatures.put("Понедельник", 12.0);
        temperatures.put("Вторник", 10.0);
        temperatures.put("Среда", 8.0);
        temperatures.put("Четверг", 15.0);
        temperatures.put("Пятница", 20.0);
        temperatures.put("Суббота", 13.0);
        temperatures.put("Воскресенье", 10.0);

        double totalTemperature = 0.0;
        for (double temperature : temperatures.values()) {
            totalTemperature += temperature;
        }
        double averageTemperature = totalTemperature / temperatures.size();
        System.out.println("Средняя температура за неделю: " + averageTemperature);
    }
}
