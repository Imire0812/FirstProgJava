package hw39.house;

public class PrivateHouse extends House{
    public PrivateHouse(String address) {
        super(address);
    }

    @Override
    public String toString() {
        return "Private house at " + getAddress();
    }


}