package hw38.student;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Студент по имени " + name;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof  Student student)){
            return false;
        }
        return name.equals(student.getName());
    }
}