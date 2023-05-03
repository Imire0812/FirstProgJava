package hw34;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    private static final String FILENAME = "res/cars.csv";
    private static final String SEPARATOR=",";
    private static final List<Car> cars = new ArrayList<>();
    public static void main(String[] args) {
        readCarsFromFile();
        Car newCar = Car.readFromSystemIn();
        cars.add(newCar);
        writeCarsToFile();

    }
    private static void readCarsFromFile() {

    }
    private static void writeCarsToFile(){

    }
}
