package hw37.Pet;

public class Dog extends Pet {
    public Dog(String name){
        super(name);
    }
    @Override
    public  void makeNoise(){
        System.out.println("Dog " + getName() + " gaaf");
    }

}
