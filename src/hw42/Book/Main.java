package hw42.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Ajay Chowdhury", "The Waiter", 352));
        books.add(new Book("Lisa Jewell", "The Night She Disappeared", 496));
        books.add(new Book("Richard Osman", "The Thursday Murder Club", 400));
        books.add(new Book("Gregg Hurwitz", "Prodigal Son", 464));

        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}