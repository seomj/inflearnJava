package enumeration.ref3;

public class EnumGradeRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] values = Grade.values();
        for (Grade value : values) {
            printDiscount(value, price);
        }
    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + " 등급 할인 금액: " + grade.discount(price));
    }
}
