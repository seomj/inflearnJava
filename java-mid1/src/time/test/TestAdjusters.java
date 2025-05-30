package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate localDate = LocalDate.of(year, month, 1);
        DayOfWeek date1 = localDate.getDayOfWeek();
        DayOfWeek date2 = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("firstDayOfWeek: " + date1);
        System.out.println("lastDayFfWeek: " + date2);
    }
}
