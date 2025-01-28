package method;

import java.util.Scanner;

public class MethodEx4Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true){
            System.out.println("-----------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("-----------------------------------------");
            System.out.print("선택: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            int amount;

            switch (option) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(amount, balance);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = withdraw(amount, balance);
                    break;
                case 3:
                    System.out.println("현재 잔액은 " + balance + "원입니다.");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 옵션을 선택하세요.");
            }
        }
    }
    public static int deposit(int depositAmount, int balance){
        balance += depositAmount;
        System.out.println(depositAmount +"원을 입금했습니다. 현재 잔액은 " + balance + "원 입니다.");
        return balance;
    }
    public static int withdraw(int withdrawAmount, int balance){
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount +"원을 출금했습니다. 현재 잔액은 " + balance + "원 입니다.");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
