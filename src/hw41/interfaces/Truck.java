package hw41.interfaces;

public class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("Starting the truck...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the truck...");
    }
}