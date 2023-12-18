package tema12;

import java.time.LocalDate;

public class daysBetween {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2003, 12, 31);
        LocalDate date2 = LocalDate.of(2003, 12, 21);

        int days = daysBetween(date1, date2);
        System.out.println("Total days between the two dates: " + days);
    }

    public static int daysBetween(LocalDate date1, LocalDate date2) {
        return Math.abs((int) date1.until(date2).getDays());
    }
}
