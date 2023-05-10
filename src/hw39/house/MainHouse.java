package hw39.house;

public class MainHouse {

    public static void main(String[] args) {
        House[] houses = new House[3];

        houses[0] = new PrivateHouse("72 Wilhelmstraße.");
        houses[1] = new PrivateHouse("16 Hohe Str.");
        houses[2] = new Apartment("7 Bahnhofstraße.", 3);

        for (House house : houses) {
            System.out.println(house.toString());
        }
    }

}
