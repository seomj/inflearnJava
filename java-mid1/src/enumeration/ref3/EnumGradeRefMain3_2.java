package enumeration.ref3;

public class EnumGradeRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        System.out.println("BASIC 등급 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급 할인 금액: " + Grade.DIAMOND.discount(price));

    }
}
