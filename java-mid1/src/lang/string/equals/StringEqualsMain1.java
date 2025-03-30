package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String string1 = new String("hello");
        String string2 = new String("hello");

        System.out.println("new String() == 비교: " + (string1 == string2)); //false
        System.out.println("new String() equeals 비교: " + string1.equals(string2)); //true

        String string3 = "hello";
        String string4 = "hello";

        System.out.println("리터럴 == 비교: " + (string3 == string4)); //true
        System.out.println("리터럴 equeals 비교: " + string3.equals(string4)); //true
    }
}
