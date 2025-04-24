package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade enumGrade, int price){
        int discountPercent = 0;

        if (enumGrade == BASIC){
            discountPercent = 10;
        } else if (enumGrade == GOLD) {
            discountPercent = 20;
        } else if (enumGrade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        return price * discountPercent/100;
    }
}
