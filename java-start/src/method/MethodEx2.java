package method;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printMessage(3, message);
        printMessage(5, message);
        printMessage(7, message);
    }
    public static void printMessage(int n, String message){
        for (int i = 0; i < n; i++){
            System.out.println(message);
        }
    }
}
