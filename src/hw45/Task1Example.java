package hw45;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task1Example {
    public static void main(String[] args) throws ParseException {
        Date someDate = new Date(2023, Calendar.JANUARY, 15, 19, 49);
        System.out.println(someDate);
        System.out.println(someDate.getTime());

        Date maxDate = new Date(Long.MAX_VALUE);
        System.out.println(maxDate);

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(format.format(someDate));

        Date parsedDate = format.parse("12.12.2013");
        System.out.println(parsedDate);
    }
}