package time.test;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalender(year, month);

    }

    private static void printCalender(int year, int month) {
        LocalDate targetMonth = LocalDate.of(year, month, 1);
        LocalDate nextMonth = targetMonth.plusMonths(1);

        System.out.println("Su Mo Tu We Th Fr Sa");

        int offsetValue = targetMonth.getDayOfWeek().getValue() % 7;

        for (int i=0; i<offsetValue; i++){
            System.out.print("   ");
        }

        LocalDate dayIterator = targetMonth;
        while(dayIterator.isBefore(nextMonth)){
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
