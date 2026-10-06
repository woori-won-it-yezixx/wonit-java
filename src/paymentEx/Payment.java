package paymentEx;

//### **1. 추상 클래스 - `Payment`**
//
//        - 모든 결제 수단이 가져야 할 **공통 속성**과 **기능**을 정의합니다.
//        1. **필드**:
//        - count (int) : 매번 processPayment()가 동작될때마다 1씩 추가되는 static 변수
//    - `amount` (double): 결제 금액 (**접근 제어자** 사용)
//2. **메서드**:
//        - **추상 메서드** `processPayment()` – 결제를 처리합니다.
//        - **일반 메서드** `displayAmount()` – 결제 금액을 출력합니다.
//3. **정적 필드**와 **정적 메서드**를 사용해 **전체 결제 건수**를 관리합니다.

public abstract class Payment {

    private static int count; // 결제 성공을 count 변수 클래스 변수: int는 0으로 초기화
    private final double amount; // 인스턴스 변수: double 0.0으로 초기화
    // 최초로 인스턴스가 만들어질 때 받은 값이 이후에 수정불가

    Payment(double amount) { // 생성자 함수: 결제건수(count)를 1씩 추가, amount를 결제마다 고유 값으로 넘겨주도록
        this.amount = amount;
        count++;
    }

    static void getCount() {
        System.out.println(count + "만큼 총 결제건수가 이루어졌습니다."); // 클래스 메서드로 private 변수인 결제건수를 확인
    }
    // 추상메서드: 자식클래스에서 완성
    abstract void processPayment();

    // 구상메서드: 자식클래스에서 그대로 가져다 씀
    double displayAmount() {
        return this.amount;
    }
}