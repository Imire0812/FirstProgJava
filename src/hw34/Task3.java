package hw34;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    private static final String FILENAME = "res/cars.csv";
    private static final String SEPARATOR=",";
    private static final List<Car> cars = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        readCarsFromFile();
        Car newCar = Car.readFromSystemIn();
        cars.add(newCar);
        writeCarsToFile();

    }
    private static void readCarsFromFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(FILENAME));
        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
            Car newCar = Car.parseCar(line, SEPARATOR);
            cars.add(newCar);
        }
        bufferedReader.close();
    }
    private static void writeCarsToFile() throws IOException{
        FileWriter fileWriter = new FileWriter(FILENAME);
        for (Car car : cars){
            fileWriter.write(car.getCsvLine(SEPARATOR));
        }
        fileWriter.close();
    }
}
