package tema12;

import java.time.LocalDate;

public class displayDateComponents {
    public static void main(String[] args) {
        LocalDate myDateObj = LocalDate.of(2023, 12, 13); // Replace with your desired date
        displayDateComponents(myDateObj);
    }

    public static void displayDateComponents(LocalDate date) {
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}

