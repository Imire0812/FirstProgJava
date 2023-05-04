package hw35;

public class Turtle extends Pet{

    public Turtle(String name){
        super(name);
    }
    public  void  makeSound(){
        System.out.println("turtle " + getName("Bob") + " no voice");
    }

}
