package basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeParse {
    public static void main(String[] args) {
        String strDate = "12/18/2021 11:00 AM";

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss a").withLocale(Locale.US);
        LocalDateTime dateTime = LocalDateTime.from(f.parse(strDate));

        System.out.println(dateTime);
    }
}
