package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: " );
        String input = scanner.nextLine();

        // AuthGrade authGrade = AuthGrade.valueOf(input.toUpperCase());
        System.out.println("당신의 등급은 " + AuthGrade.valueOf(input).getDescription() + "입니다.");
        System.out.println("===메뉴 목록===");

        if (AuthGrade.valueOf(input).getLevel() >= 1) {
            System.out.println("- 메인 화면");
        }
        if (AuthGrade.valueOf(input).getLevel() >= 2) {
            System.out.println("- 이메일 관리 화면");
        }
        if (AuthGrade.valueOf(input).getLevel() >= 3) {
            System.out.println("- 관리자 화면");
        }
    }
}
