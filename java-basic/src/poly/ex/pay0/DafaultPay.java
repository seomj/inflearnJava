package poly.ex.pay0;

public class DafaultPay implements Payment{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
