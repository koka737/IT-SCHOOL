package tema12;
import java.time.LocalDate;

public class areDatesEqual {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2003,12,31);
        LocalDate date2 = LocalDate.of(2004,11,10);
        areDatesEqual( date1, date2);
    }
    public static void areDatesEqual(LocalDate date1, LocalDate date2) {
        if(date1.isEqual(date2)){
            System.out.println("the dates are equal");
        }else{
            System.out.println("the dates are not equal");
        }
    }
}
