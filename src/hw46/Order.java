package hw46;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private static final String SEP = ";";
    private static final SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");

    private static int counter = 0;
   private int id;
   private String content;
   private Date dueDate;

   public Order(String content, String date) throws ParseException {
        id = ++counter;
        this.content = content;
        this.dueDate = formatter.parse(date);
    }
    public static void setCounter(int counter) {
        Order.counter = counter;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setDueDate(Date dueDate) throws ParseException {
        this.dueDate = dueDate;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }
    public Date getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return id + content + formatter.format(dueDate);
    }
}

