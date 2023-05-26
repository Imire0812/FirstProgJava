package hw46;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Order {
    private static final String SEP = ";";
    private static final SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");

    private static int counter = 0;

    private final int id;
    private String content;
    private Date dueDate;

    public Order(String content, String date) throws ParseException {
        this.id = ++counter;
        this.content = content;
        this.dueDate = formatter.parse(date);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDueDate(String date) throws ParseException {
        this.dueDate = formatter.parse(date);
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Date getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() { // использую для записи в файл
        return id + SEP + content + SEP + formatter.format(dueDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
//    // объект instanceof Класс - относится ли объект к этому классу, можно ли преобразовать
//    if (!(obj instanceof Order)) {
//      return false; // если преобразовать нельзя, то объекты не равны
//    }
//    // если мы попали сюда, то преобразовать можно
//    Order other = (Order) obj;
        if (!(obj instanceof Order other)) { // одновременно и проверка, и преобразование
            return false;
        }
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}