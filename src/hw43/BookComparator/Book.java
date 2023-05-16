package hw43.BookComparator;

import java.util.Objects;

public class Book implements Comparable<Book> {
    public String author;
    public String title;
    public int pages;

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
        if (!(obj instanceof hw42.Book.Book)) {
            return false;
        }
        hw42.Book.Book other = (hw42.Book.Book) obj;
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
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

}