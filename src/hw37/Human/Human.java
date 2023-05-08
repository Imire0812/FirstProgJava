package hw37.Human;

public class Human {

    public String name;

    public Human(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return "Человек по имени " + name;
    }

    public void greeting() {
        System.out.println("Я родился!");
    }

}
