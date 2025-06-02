package nested.anonymous.ex;

public class Ex0RefMain {
    public static void hellpPrint(String text){
        System.out.println("프로그램 시작");
        System.out.println("Hello " + text);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hellpPrint("Java");
        hellpPrint("Spring");
    }
}
