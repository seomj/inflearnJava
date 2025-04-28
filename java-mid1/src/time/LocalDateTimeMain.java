package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDT = LocalDateTime.now();
        LocalDateTime ofDT = LocalDateTime.of(2016, 8, 16, 8, 10, 1);

        System.out.println("현재 날짜와 시간 = " + nowDT);
        System.out.println("지정 날짜와 시간 = " + ofDT);

        // 날짜와 시간 분리
        LocalDate localDate = ofDT.toLocalDate();
        LocalTime localTime = ofDT.toLocalTime();

        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산
        LocalDateTime ofDTPlus = ofDT.plusDays(1000);
        System.out.println("지정 날짜와 시간 + 1000d = " + ofDTPlus);
        LocalDateTime ofDTPlus1 = ofDT.plusYears(1);
        System.out.println("지정 날짜와 시간 + 1y = " + ofDTPlus1);

        // 비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDT.isBefore(ofDT));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가? " + nowDT.isAfter(ofDT));
        System.out.println("현재 날짜 시간과 지정 날짜 시간이 같은가? " + nowDT.isEqual(ofDT));

    }
}
