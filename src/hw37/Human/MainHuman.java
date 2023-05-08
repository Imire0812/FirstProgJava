package hw37.Human;

public class MainHuman {

    public static void main(String[] args) {
        Human human1 = new Human("Tommi");
        System.out.println(human1);
        human1.greeting(); // Я родился!

        Man man1 = new Man("Peter");
        System.out.println(man1);
        man1.greeting(); // Я родился!

        Woman woman1 = new Woman("Liliana");
        System.out.println(woman1);
        woman1.greeting(); // Я родилась!
    }

}
