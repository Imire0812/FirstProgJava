package hw34;

public class Student {
    private  static int counter = 0;
    private final int id;
    private String name;

    public Student (String name){
        id = counter++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getString() {
        return String.format("%s [id: %d/%d]", name, id, counter);
    }
}
