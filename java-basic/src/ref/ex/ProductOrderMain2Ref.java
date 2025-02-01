package ref.ex;

public class ProductOrderMain2Ref {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

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
