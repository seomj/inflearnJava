package array;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int maxProducts = 10; // 지정해서 설정 가능

        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("1: 상품 등록 | 2: 상품 목록 | 3: 종료");
            System.out.print("메뉴를 선택하세요: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1){
                if (productCount >= 10){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();
                productCount++;
            } else if (option == 2) {
                if(productCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCount;i++){
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해 주세요.");
            }
        }
    }
}
