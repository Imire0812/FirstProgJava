package hw45;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task2CalendarExample {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = new GregorianCalendar();
        Date date = calendar.getTime();
        System.out.println(calendar.getTime());

        Calendar calendar2 = new GregorianCalendar(123, Calendar.MAY, 22);
        calendar2.set(Calendar.HOUR, 10);
        System.out.println(calendar2.getTime());

        calendar2.add(Calendar.DATE, 1);
        System.out.println(calendar2.getTime());

        String dateStr = "05/22/2023";
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date readDate = formatter.parse(dateStr);
        Calendar readCalendar = new GregorianCalendar();
        readCalendar.setTime(readDate);


    }
}