package ex14.jodaTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class $01_NewDateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date); //OP: 2018-10-31

        LocalTime time = LocalTime.now();
        System.out.println(time); //OP: 23:50:21.775

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);//OP: 2018-10-31T23:50:21.776
    }
}
