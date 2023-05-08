package hw37.Pet;

public class Pet {
    public  String name;

    public  Pet(String name){
        this.name = name;
    }
    public  String getName(){
        System.out.println();
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void makeNoise(){
        System.out.println("Pet");
    }
}
