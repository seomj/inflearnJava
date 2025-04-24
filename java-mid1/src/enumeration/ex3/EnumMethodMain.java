package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        // 모든 Enum 반환
        Grade[] values = Grade.values();
        System.out.println("values: " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name= " + value.name() + ", ordinal= " + value.ordinal());
        }

        // String -> enum 변환
        // 잘못된 단어를 입력하면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade grade = Grade.valueOf(input);
        System.out.println("grade= " + grade);
    }
}
