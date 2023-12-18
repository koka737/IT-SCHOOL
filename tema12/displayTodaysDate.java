package tema12;
import java.time.LocalDate;
public class displayTodaysDate {
    public static void main(String[] args) {
        displayTodaysDate();
    }
    public static void displayTodaysDate(){
        LocalDate todaysDate = LocalDate.now();
        System.out.println(todaysDate);

    }
}
