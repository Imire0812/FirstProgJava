package hw40.flying;

public class Main {
    public static void main(String[] args) {


    Superman superman = new Superman();
    Human human = new Human();
    Duck duck = new Duck();
    Penguin penguin = new Penguin();
    Plane plane = new Plane();


    superman.fly();
    superman.run();
    superman.swim();

    human.run();
    human.swim();

    duck.fly();
    duck.swim();

    penguin.swim();

    plane.fly();
}
}
