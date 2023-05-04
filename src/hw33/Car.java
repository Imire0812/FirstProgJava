package hw33;

public class Car {
    private String manufacturer;
    private String color;
    private int power;

    public Car(String manufacturer, String color, int power){
        this.manufacturer = manufacturer;
        this.color = color;
        this.power = power;

    }
    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

