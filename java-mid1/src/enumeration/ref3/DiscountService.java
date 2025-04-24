package enumeration.ref3;

public class DiscountService {
    public int discount(Grade enumGrade, int price){
        return enumGrade.discount(price);
    }
}
