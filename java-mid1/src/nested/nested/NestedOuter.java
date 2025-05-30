package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested{
        private int nestedInstanceValue = 1;

        public void print(){
            // 자신의 멤버 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버 접근 -> 불가능
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버 접근 -> 가능
            System.out.println(outClassValue);

            // static 중첩 클래스는 바깥 클래스의 인스턴스와 독립되어 있기에 직접 접근 불가능
            // 클래스 변수(static int)는 바깥 클래스 이름 없이도 접근 가능
        }
    }
}
