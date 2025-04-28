package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now = " + now);

        LocalDateTime localDateTime = LocalDateTime.of(2040, 1, 1, 13, 40, 50);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime = " + zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2040, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime1 = " + zonedDateTime1);

        ZonedDateTime utc = zonedDateTime1.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utc = " + utc);
    }
}
