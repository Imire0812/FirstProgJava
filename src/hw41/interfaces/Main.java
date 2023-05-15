package hw41.interfaces;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();

        Vehicle truck = new Truck();
        truck.start();
        truck.stop();
    }
}