package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        System.out.println(string); // toString 반환값

        System.out.println(object); // object 직접 출력
    }
}
