package enumeration.ref2;

public class DiscountService {
    public int discount(Grade enumGrade, int price){
        return price * enumGrade.getDiscountPercent() /100;
    }
}
