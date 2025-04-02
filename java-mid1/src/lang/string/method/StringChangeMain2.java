package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String str = "    Java Programming ";

        System.out.println("소문자로 변환: " + str.toLowerCase());
        System.out.println("대문자로 변환: " + str.toUpperCase());

        // whitespace만 제거
        System.out.println("공백 제거(trim): '" + str.trim() + "'");
        // whitespace와 유니코드 공백 제거
        System.out.println("공백 제거(strip): '" + str.strip() + "'");

        System.out.println("앞 공백 제거(strip): '" + str.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): '" + str.stripTrailing() + "'");
    }
}
