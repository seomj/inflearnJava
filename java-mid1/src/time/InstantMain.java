package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now();
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("zdt = " + zdt);
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochSecond = Instant.ofEpochSecond(0);
        System.out.println("epochSecond = " + epochSecond);
        
        // 계산
        Instant later = epochSecond.plusSeconds(3600);
        System.out.println("later = " + later);
        
        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
