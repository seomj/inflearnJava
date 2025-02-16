package poly.basic.test;

public class CastingMain5 {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println("=== a1 호출 ===");
        call(a1);

        A a2 = new B();
        System.out.println("=== a2 호출 ===");
        call(a2);

        A a3 = new C();
        System.out.println("=== a3 호출 ===");
        call(a3);

    }

    private static void call(A a){
        a.AMethod();

        if(a instanceof B){
            System.out.println("B 인스턴스가 있습니다.");
            B b = (B) a;
            b.BMethod();
        } else {
            System.out.println("B 인스턴스가 없습니다.");
        }
    }
}
