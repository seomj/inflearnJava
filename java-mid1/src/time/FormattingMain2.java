package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        System.out.println("now = " + now);;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("날짜와 시간 포맷팅: " + formattedDate);

        String input = "2030-01-01 15:40:50";
        LocalDateTime parsedDateTime = LocalDateTime.parse(input, formatter);
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDateTime);
    }
}
