package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        // format
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("소수점 두 번째 자리까지 출력: %.2f", 10.1234);
        System.out.println(format2);

        System.out.printf("소수점 두 번째 자리까지 출력: %.2f\n", 10.1234);

        // matches
        String regex = "Hello, (Java!|World)";
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
    }
}
