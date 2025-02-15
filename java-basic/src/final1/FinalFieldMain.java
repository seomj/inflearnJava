package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit init1 = new ConstructInit(10);
        ConstructInit init2 = new ConstructInit(20);
        System.out.println(init1.value);
        System.out.println(init2.value);

        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);;

    }
}
