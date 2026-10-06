package paymentEx;

/* ### **3. 상속을 활용한 결제 수단 구현**

        1. **신용카드 결제** (`CreditCardPayment`)  ｅｘｔｅｎｄｓ 부모클래스명 ｉｍｐｌｅｍｅｎｔｓ 인터페이스명
    - `Payment`를 **상속**합니다.
    - `Refundable` 인터페이스를 **구현**하여 **환불 기능**을 제공합니다.
        - 결제 금액을 출력하고 결제를 처리합니다.
  */

public class CreditCardPayment extends Payment implements Refundable{

    CreditCardPayment(double amount) {
        super(amount);
    }
    @Override
    void processPayment() {
        System.out.println(this.displayAmount() + "원을 구매합니다");
        System.out.println("신용카드로 결제합니다.");

    }

    @Override
    public void refund() {  // refund는 interface Refundable에서
        // private 변수인 amount의 getter로 금액을 '확인'만 할 수 있습니다.
        System.out.println(this.displayAmount() + "원 환불을 진행합니다"); // displayAmount()는 Payment 부모클래스에서 가져와서 둘 다 쓸 수 있음
    }
}