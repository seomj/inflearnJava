package poly.ex.pay0;

public class PayStore {

    public static Payment findpay(String option){
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DafaultPay();
        }
    }
}
