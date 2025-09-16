package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            else numbers.add(n);
        }

        System.out.println("출력");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
