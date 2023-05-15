package hw41.interfaces;

public class Motorcycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Starting the motorcycle...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the motorcycle...");
    }
}
