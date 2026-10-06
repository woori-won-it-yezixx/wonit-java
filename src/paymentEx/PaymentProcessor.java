package paymentEx;

// 외부에서 이 모듈을 사용하거나, 결제 자체만을 위한 여러 기능을 묶어서 관리하는 별도의 클래스
public class PaymentProcessor {

    private static int count;  // 결제 요청 자체를 count 하는 변수

    public static void process(Payment payment) {
        System.out.println(payment.displayAmount() + "원의 결제가 요청되었습니다");
        payment.processPayment();   // 결제 금액을 보여주고 결제를 하게 될겁니다.
        count++; // 결제 요청 자체를 한번씩 추가
    }

    public static void getCount() {
        System.out.println(count + "만큼 결제 요청이 외부에서 있었습니다.");
    }

}