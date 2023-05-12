package hw40.flying;

public class Duck implements CanSwim, CanFly{
    @Override
    public void fly() {
        System.out.println("Утка умеет летать!");
    }

    @Override
    public void swim() {
        System.out.println("Утка умеет плавать!");
    }
}
