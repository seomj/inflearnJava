package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        ProductOrder[] orders = new ProductOrder[n];

        for(int i = 0; i < n; i++){
            scanner.nextLine();

            System.out.println((i+1) +"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        // ProductOrder를 생성하고 매개변수로 초기 값을 설정
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders){
        // 배열을 받아서 배열에 들어있는 전체 ProductOrder의 상품명, 가격, 수량을 출력
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        // 배열을 받아서 배열에 들어있는 전체 ProductOrder의 총 결제 금액을 계산하고, 계산 결과를 반환
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
