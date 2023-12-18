package tema12;

import java.time.Duration;
import java.time.LocalTime;

public class elapsedTimeSince {

    public static void main(String[] args) {
        LocalTime firstInput = LocalTime.of(23, 21, 20);
        LocalTime timeNow = LocalTime.now();

        long timeInSeconds = elapsedTimeSince(firstInput, timeNow);

        System.out.println("Total time between the two inputs: " + timeInSeconds + " seconds");
    }

    public static long elapsedTimeSince(LocalTime firstInput, LocalTime timeNow) {
        Duration duration = Duration.between(firstInput, timeNow);
        return Math.abs(duration.getSeconds());
    }
}
