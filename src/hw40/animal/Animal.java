package hw40.animal;

public class Animal implements Information {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep(){
        System.out.println("Животное спит");
    }

    @Override
    public void showInformation() {
        System.out.println("Id: " + this.id);
    }

    public int getAge(){
        System.out.println("Age animal: 2");
        return 2;

    }
}
