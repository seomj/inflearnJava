package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);

        if(supported){
            int i = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("i = " + i);
        }

    }
}
