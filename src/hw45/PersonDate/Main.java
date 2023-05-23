package hw45.PersonDate;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "05.03.1990");
        Person person2 = new Person("Jane", "12.09.1985");

        if (person1.compareTo(person2) < 0) {
            System.out.println(person1.getName() + " младше, чем " + person2.getName());
        } else if (person1.compareTo(person2) > 0) {
            System.out.println(person1.getName() + " старше, чем " + person2.getName());
        } else {
            System.out.println(person1.getName() + " и " + person2.getName() + " родились в один день");
        }
    }
}
