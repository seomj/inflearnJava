package access.ex;

public class ShoppingCartRef {
    private ItemRef[] items = new ItemRef[10];
    private int itemCount;

    public void addItem(ItemRef item){
        if (itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < itemCount; i++) {
            ItemRef item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }

        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++){
            ItemRef item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
