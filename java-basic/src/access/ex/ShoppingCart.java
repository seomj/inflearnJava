package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if (itemCount >= 10){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems(){
        int totalPrice;
        System.out.println("장바구니 상품 출력");

        for (Item item : items) {
            System.out.println("상품명: " + item.name + ", 합계: " + item.price*item.quantity);
            totalPrice += item.price*item.quantity;
        }

        System.out.println("전체 가격 합: " + totalPrice);
    }
}
