package hw35;

public class Cat extends Pet {

    public Cat(String name){
        super(name);
    }
    public  void  makeSound(){
        System.out.println("cat " + getName("Bob") + " no voice");
    }
    public void makeNoice(){
        System.out.println("turtle " + getName("Bob") + " no voice");
    }
}
