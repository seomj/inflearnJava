package pack.test;

import pack.test.a.ValueA;

public class TestValue2 {
    public static void main(String[] args) {
        Value value = new Value();
        value.num = 3;
        System.out.println(value.num);

        ValueA valueA = new ValueA();
        //valueA.num = 3;
        //System.out.println(valueA.num);
    }
}
