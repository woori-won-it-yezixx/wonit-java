package oop.abstraction2;

// 추상클래스가 구체 + 추상이라는 기준이었다면 추후에
// 기준을 추상(없음)으로 바꿔서 상속받은 자식클래스에서 실제 동작을 채워넣도록
// 있으려면 바뀌지않는 확실한 값이어야만 합니다.
public interface Computer {

    // 초기화되지 않은 값은 들어갈 수 없습니다.
    // 추상클래스에는 final 키워드로 다시 변경할 수 없는 확정된 값을 넣어줍니다.
    // final String power = "off";
    // final 자식 클래스에서 바꿀 수 없는 확정된 값 (override가 불가하도록)이라는 키워드
    // String power = "off";

    // 생성자도 인터페이스에는 선언 불가

    // 구상메서드도 interface는 작성 불가
    void login();

    void inApp();

    // 추상메서드는 abstract 키워드 없이 함수 시그니처만 작성
    void powerOn();

    void powerOff();
}