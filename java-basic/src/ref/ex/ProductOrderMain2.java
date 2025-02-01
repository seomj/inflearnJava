package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder order1 = createOrder("두부", 2000, 2);
        ProductOrder order2 = createOrder("김치", 5000, 1);
        ProductOrder order3 = createOrder("콜라", 1500, 2);

        ProductOrder[] productOrders = {order1, order2, order3};
        printOrders(productOrders);

        int totalAmount = getTotalAmount(productOrders);
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
