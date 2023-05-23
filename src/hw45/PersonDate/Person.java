package hw45.PersonDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person>{
    private String name;
    private Date birthDate;
    public Person(String name, String birthDate){
        this.name=name;
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            this.birthDate = dateFormat.parse(birthDate);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }

    public String getName(){
        return name;
    }

    public Date getBirthDate(){
        return birthDate;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return this.birthDate.compareTo(otherPerson.birthDate);
    }
}
