package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integer = Integer.valueOf(10);

        Long aLong = Long.valueOf(100);
        Double aDouble = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integer = " + integer);

        System.out.println("aLong = " + aLong);
        System.out.println("aDouble = " + aDouble);

        System.out.println("내부 값 읽기");
        int intValue = integer.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = aLong.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integer));
        System.out.println("equals: " + (newInteger.equals(integer)));
    }
}
