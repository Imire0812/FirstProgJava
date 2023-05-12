package hw40.flying;

public class Superman implements CanFly, CanRun, CanSwim{
    @Override
    public void fly() {
        System.out.println("Супермен умеет летать! ");
    }

    @Override
    public void run() {
        System.out.println("Супермен умеет бегать! ");
    }

    @Override
    public void swim() {
        System.out.println("Супермен умеет плавать! ");
    }
}
