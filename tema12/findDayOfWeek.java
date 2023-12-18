package tema12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class findDayOfWeek {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2003, 12, 31);
        findDayOfWeek(date);
    }

    public static void findDayOfWeek(LocalDate date) {
        DateTimeFormatter dayOfWeekFormatter = DateTimeFormatter.ofPattern("EEEE");
        String formattedDate = date.format(dayOfWeekFormatter);
        System.out.println(formattedDate);
    }
}
