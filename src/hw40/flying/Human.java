package hw40.flying;

public class Human implements CanRun, CanSwim{
    @Override
    public void run() {
        System.out.println("Человек умеет бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Человек умеет плавать!");
    }
}
