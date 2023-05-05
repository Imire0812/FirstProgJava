package hw35;

public class Drink extends Food {

    private boolean carbonated;

    public Drink(String title, boolean carbonated){
        super(title);
        this.carbonated = carbonated;
    }

    public boolean isCarbonated(){
        return carbonated;
    }
    public void setCarbonated(boolean carbonated){
        this.carbonated = carbonated;
    }


    public Drink(String title){
        super(title);
        carbonated = false;
    }

    public void open(){
        if (carbonated){
            System.out.println(getTitle() + "psh");
        } else {
            System.out.println(getTitle() + "skch");
        }
    }

}
