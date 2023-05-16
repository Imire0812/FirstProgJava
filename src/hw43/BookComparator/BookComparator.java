package hw43.BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int pageCountComparison = Integer.compare(book2.getPages(), book1.getPages());
        if (pageCountComparison != 0) {
            return pageCountComparison;
        } else {
            return book1.getTitle().compareTo(book2.getTitle());
        }
    }
}