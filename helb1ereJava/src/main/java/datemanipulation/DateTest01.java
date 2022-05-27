package datemanipulation;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest01 {

    public static void main(String[] args) {

        // Adam (in time zone Europe/Paris) is entering a datetime
        String dateInIso = "2028-11-07 13:06:18";
        ZoneId zone = ZoneId.of("Europe/Paris");

        ZonedDateTime dateParsed = LocalDateTime
                .parse(dateInIso, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                .atZone(zone);
        Instant instant = dateParsed.toInstant(); // instant is stored in DB

        System.out.println("Instant = "+instant.toString());

        // Jean (in time zone Australia/Sydney) is viewing the datetime Adam has entered
        ZoneId jeanZone = ZoneId.of("Australia/Sydney");
        ZonedDateTime atZone = ZonedDateTime.ofInstant(instant, jeanZone);

        String output = atZone.format(DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss"));
        System.out.println("At jean zone = " + output);
    }

}
