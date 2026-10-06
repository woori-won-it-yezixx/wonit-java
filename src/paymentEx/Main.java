package paymentEx;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 신용카드와 NaverPay 결제 객체 생성
        // Map<String, Integer> map1 = new HashMap<>();

        // 자료형 변수명 = 새로방을파서 구현체(입력값);
        Payment creditCard = new CreditCardPayment(50000);
        Payment naverPay = new NaverPayPayment(30000);

        naverPay.processPayment();   // 결제

        naverPay.displayAmount(); // 결제 금액 출력


        // 다운캐스팅 (부모자료형 Payment -> 자식자료형 NaverPayPayment)
        NaverPayPayment naverPay1 = (NaverPayPayment) naverPay;
        naverPay1.refund(); // 부모클래스에는 없던 멤버 메서드를 사용 가능

        // 업캐스팅 (자식자료형 NaverPayPayment -> 부모자료형 Payment)
        Payment naverPay2 = (Payment) naverPay1;
        // refund() 메서드 쓸 수 없음.


        System.out.println("============= payment 자료형만 받음 =========");
        // 결제 처리 (정적 메서드 사용)
        PaymentProcessor.process(creditCard);
        PaymentProcessor.process(naverPay);


        PaymentProcessor.process(naverPay1); // NaverPayPayment 자료형으로 된 인스턴스 -> 업캐스팅을 자동으로 해줌
        PaymentProcessor.getCount(); // 결제 요청 건수
        Payment.getCount(); // 실제 결제 건수

        System.out.println();

        // 환불 기능 테스트 (다운캐스팅 사용)
        // instanceof 연산자는 객체가 null인 경우 false를 반환합니다.
        // instanceof 연산자를 사용하여 타입을 확인한 후, 안전하게 다운캐스팅할 수 있습니다.
        if (creditCard instanceof Refundable) {
            ((Refundable) creditCard).refund();
        }

        if (naverPay instanceof Refundable) {
            ((Refundable) naverPay).refund();
        }

        ((Refundable) creditCard).refund();

        EmptyOne emptyOne = new EmptyOne();

        if (emptyOne instanceof Refundable) {
            ((Refundable) naverPay).refund();
        } else {
            System.out.println("refund 메서드가 없음. 모든 자료형은 Object의 자식클래스이므로 instanceof로 비교함");
        }
        // 클래스에 아무것도 선언하거나 정의한 게 없어도 몇개 들어있는 메서드
        // 모든 class는 Object 라는 최상위 클래스를 상속받아서 만들어지기 때문
    }
}