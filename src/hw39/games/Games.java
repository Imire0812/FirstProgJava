package hw39.games;

public abstract class Games {

    private String title;

    public Games(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void start();
}