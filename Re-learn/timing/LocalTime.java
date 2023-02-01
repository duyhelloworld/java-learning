// package timing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2004, 12, 9);
        System.out.println(date);

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // - 2023-01-24T19:06:09.384842992
        // -> "T" : seperate
        // -> .3848 ... : ms

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(dateTimeFormatter.format(dateTime));

        dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dateTimeFormatter.format(now));

        // LocalDate dateWrong = LocalDate.of(2004, 14, 4);
        // System.out.println(dateTimeFormatter.format(dateWrong));
    }
}
