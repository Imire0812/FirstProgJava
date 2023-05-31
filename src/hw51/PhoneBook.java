package hw51;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Person> people = new ArrayList<>();
    public void add(String name, String phone){
        Person person = new Person(name, phone);
        people.add(person);
    }
    public boolean hasName(String name){
        for (Person person : people){
            if (person.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    /**
     * поиск записи по указанному имени
     * @param name имя для поиска
     * @return индекс первой встреченной записи с указанным именем или -1, если имя
     * не найдено
     */
    public int indexOfName(String name){
        for (int i = 0; i < people.size(); ++i){
            if (people.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
