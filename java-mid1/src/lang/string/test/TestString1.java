package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        // System.out.println(url.startsWith("https://"));
        boolean res = url.startsWith("https://");
        System.out.println("res = " + res);
    }
}
