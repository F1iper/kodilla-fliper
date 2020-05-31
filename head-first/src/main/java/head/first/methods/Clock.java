package head.first.methods;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Clock {
    LocalDateTime time;

    void setTime (LocalDateTime c){
        time = c;
    }

    LocalDateTime getTime(){
        return time;
    }
}
class ClockTester {
    public static void main(String[] args) {

        Clock z = new Clock();
         z.setTime(LocalDateTime.now());
        LocalDateTime dta = z.getTime();
        System.out.println("Date and time: " + dta);
    }
}