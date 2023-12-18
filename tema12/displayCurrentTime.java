package tema12;
import java.time.LocalTime;
public class displayCurrentTime {
    public static void main(String[] args) {
displayCurrentTime();
    }
    public static void displayCurrentTime(){
        LocalTime time =LocalTime.now();
        System.out.println(time);
    }
}
