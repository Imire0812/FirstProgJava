package hw42.Book;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String author;
    private String title;
    private int pages;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book(author='" + author + "', title='" + title + "', pages=" + pages + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.author.equals(other.author) && this.title.equals(other.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public int compareTo(Book other) {
        if (this.author.equals(other.author)) {
            return this.title.compareTo(other.title);
        }
        return this.author.compareTo(other.author);
    }
}