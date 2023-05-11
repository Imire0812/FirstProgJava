package hw39.house;

public abstract class House {

    private String address;

    public House(String address){
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String title) {
        this.address = title;
    }

    public abstract String toString();
    public abstract void destroy();

}
