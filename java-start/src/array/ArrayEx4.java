package array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;

        System.out.println("5개의 정수를 입력하세요: ");

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        double average = (double) total/ numbers.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
