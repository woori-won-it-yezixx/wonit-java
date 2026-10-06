package paymentEx;

public class NaverPayPayment extends Payment implements Refundable {

    // Payment의 생성자
    NaverPayPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println(this.displayAmount() + "원을 구매합니다");
        System.out.println("네이버 페이로 결제합니다.");
    }

    @Override
    public void refund() {
        System.out.println(this.displayAmount() + "원 환불을 진행합니다");
    }
}