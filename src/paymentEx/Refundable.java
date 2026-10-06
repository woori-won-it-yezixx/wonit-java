package paymentEx;


//### **2. 인터페이스 - `Refundable`**
//
//        - **환불 기능**을 제공해야 하는 결제 수단을 구분합니다.
//        1. **메서드**:
//        - `refund()` – 결제를 환불합니다.
// 기준이 '없음'이므로 추상 메서드, final로 선언된 변수와 default로 접근제어자가 선언된 구상메서드, static 변수
public interface Refundable {

    // 기준이 추상이므로 함수 시그니처만 작성해 둡니다.
    void refund();
}