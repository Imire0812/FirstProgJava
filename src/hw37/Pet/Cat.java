package hw37.Pet;

public class Cat  extends Pet {
    public Cat(String name){
        super(name);
    }
@Override
    public  void makeNoise(){
        System.out.println("Cat " + getName() + " maaaa");
    }
}
