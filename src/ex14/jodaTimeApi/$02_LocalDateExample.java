package ex14.jodaTimeApi;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class $02_LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("local date : " + date); //OP: local date : 2018-11-01

        LocalDate newDate = LocalDate.of(2018, 9, 01);
        System.out.println("new date : " + newDate);//OP: new date : 2018-09-01

        LocalDate anyDate = LocalDate.ofYearDay(2018, 32);
        System.out.println("any date : " + anyDate);//OP: any date : 2018-02-01

        System.out.println("current month name: " + date.getMonth()); //OP: current month name: NOVEMBER
        System.out.println("current month value: " + date.getMonthValue()); //OP: current month value: 11
        System.out.println("current day of week: " + date.getDayOfWeek()); //OP: current day of week: THURSDAY
        System.out.println("current dau of year: " + date.getDayOfYear()); //OP: current dau of year: 305
        System.out.println("current day og the month : " + date.get(ChronoField.DAY_OF_MONTH)); //OP: current day og the month : 1
    }
}
