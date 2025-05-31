package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int innerInstantValue = 1;

        public void print() {
            // 자기 자신 접근
            System.out.println(innerInstantValue);

            // 외부 클래스의 인스턴스 멤버 접근
            System.out.println(outInstanceValue);

            // 외부 클래스의 클래스 멤버 접근
            System.out.println(outClassValue);
        }
    }
}
