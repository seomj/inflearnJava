package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();

        // 다운캐스팅
        Child child = (Child) poly;
        child.childMethod();
    }

}
