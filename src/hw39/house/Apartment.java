package hw39.house;

public class Apartment extends House {

    private int numEntrances;

    public Apartment(String address, int numEntrances) {
        super(address);
        this.numEntrances = numEntrances;
    }
    public int getNumEntrances(){
        return numEntrances;
    }
    public void setNumEntrances(int numEntrances){
        this.numEntrances = numEntrances;
    }

    @Override
    public String toString() {
        return "Apartment building at " + getAddress() + " with " +
                numEntrances + " entrances ";
    }
}
