package hw33;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes-Benz", "white", 300);
        System.out.println(mercedes);
        System.out.println(mercedes.getColor());
        mercedes.setColor("black");
        System.out.println(mercedes.getColor());

        Car beetle = new Car("VolksWagen", "yellow", 125);
        System.out.println(beetle);
        System.out.println(beetle.getColor());
        beetle.setColor("black");
        System.out.println(beetle.getColor());
    }

}
