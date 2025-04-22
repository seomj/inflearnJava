package enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int silver = discountService.discount("SILVER", price);
        System.out.println("SILVER 등급 할인 금액: " + silver);

        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급 할인 금액: " + diamondd);

        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급 할인 금액: " + gold);
    }
}
