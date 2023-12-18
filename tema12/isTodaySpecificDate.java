package tema12;
import java.time.LocalDate;
public class isTodaySpecificDate {

    public static void main(String[] args) {
        LocalDate userDate = LocalDate.of(2023, 12, 13);
        LocalDate todaysDate = LocalDate.now();
        isTodaySpecificDate(userDate, todaysDate);
    }

    public static void isTodaySpecificDate(LocalDate userDate, LocalDate todaysDate) {
        if(userDate.isEqual(todaysDate)){
            System.out.println("the dates are equal");
        }else{
            System.out.println("the dates are not equal");
        }

    }

}
