package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime plus = localDateTime.plus(10, ChronoUnit.YEARS);
        System.out.println("ChronoUnit = " + plus);

        LocalDateTime plus2 = localDateTime.plusYears(10);
        System.out.println("plusYears = " + plus2);

        Period period = Period.ofYears(10);
        LocalDateTime plus1 = localDateTime.plus(period);
        System.out.println("period = " + plus1);
    }
}
