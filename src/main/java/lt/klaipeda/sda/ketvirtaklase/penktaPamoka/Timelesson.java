package lt.klaipeda.sda.ketvirtaklase.penktaPamoka;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.OptionalDouble;

public class Timelesson {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("Now is the time: " + localTime);

        LocalTime now = LocalTime.now();
    String formattedTime = now.getHour() + ":" + now.getMinute() + ":" + now.getSecond();
System.out.println(formattedTime);

        System.out.println(localTime.minusSeconds(10));
        System.out.println(localTime);


        LocalDate localDate = LocalDate.of(1977, Month.OCTOBER, 10);
        System.out.println(localDate);
        LocalDate localDate2 = LocalDate.of(2020, 2, 28);
        System.out.println(localDate2);
        LocalTime localTime1= LocalTime.now();
        String formattedLocalTime = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(formattedLocalTime);


}
}
