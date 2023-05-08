package hw37.Pet;

import java.util.ArrayList;
import java.util.List;

public class MainPet {
    public static void main(String[] args){
        Cat cat = new Cat("Pushok");
        cat.makeNoise();
        cat.setName("Pushok");
        cat.makeNoise();

        Dog dog = new Dog("Kluk");
        dog.makeNoise();
        dog.setName("Kluk");

        List<Pet> pets = new ArrayList<>();
        pets.add(cat);
        pets.add(dog);
        for (Pet pet : pets){
            pet.makeNoise();
        }
    }
}
