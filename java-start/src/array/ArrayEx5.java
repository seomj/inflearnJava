package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        System.out.println(n + "개의 정수를 입력하세요: ");
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum/ n;

        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + average);

    }
}
