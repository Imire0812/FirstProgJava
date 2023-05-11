package hw40.animal;

import hw40.animal.Information;

public class Person implements Information {
    public String name;
    public int id;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Человек привествует!");
    }

    @Override
    public void showInformation() {
        System.out.println("Id: " + this.name);
    }
    public int getAge(){
        System.out.println("Age person: 25");
        return 25;

    }
}
