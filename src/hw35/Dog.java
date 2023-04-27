package hw35;

public class Dog extends Pet {
    public Dog(String name){
        super(name);
    }

    public  void  makeSound(){
        System.out.println("dog " + getName("bob") + " voice");
    }
    public void makeNoice(){
        System.out.println("dog " + getName("bob") + " kjfdjkfsd");
    }
}
