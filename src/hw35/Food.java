package hw35;

public class Food {

    private String title;

    public Food(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void consume(){
        System.out.println("You eating " + title);
    }

}
