package hw38.student;

public class Student {
    private String name;
    private Integer age;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Студент по имени " + name;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof  Student student)){
            return false;
        }
        return name.equals(student.getName()) && age == student.getAge();
    }
    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }
}