package hw38.homeWork;

public class Book {

    private String author;
    private String title;

    public Book (String autor, String title){
        this.author = autor;
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book otherBook = (Book) obj;
        return this.author.equals(otherBook.author) && this.title.equals(otherBook.title);
    }

    @Override
    public int hashCode() {
        return author.hashCode() + title.hashCode();
    }

}
