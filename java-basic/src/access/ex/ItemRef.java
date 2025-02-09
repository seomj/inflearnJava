package access.ex;

public class ItemRef {
    private String name;
    private int price;
    private int quantity;

    public ItemRef(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice(){
        return price * quantity;
    }
}
