package individual.task4;

import java.time.LocalDateTime;

public class Logger {

    public static void log(String message) {
        System.out.println(LocalDateTime.now() + " - " + message);
    }
}
