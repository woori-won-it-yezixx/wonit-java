package oop.abstraction;

// 추상 메서드(점검표)와 구상 메서드(구체적 동작 포함)을 모두 담도록
public abstract class Computer {

    String power;

    // 생성자
    Computer() {
        this.power = "off";
    }

    // 구상메서드
    void login() {
        System.out.println("로그인 완료");
    }

    void inApp() {
        System.out.println("작업 중");
    }

    // 추상메서드는 abstract 함수 시그니처만 작성
    abstract void powerOn();

    abstract void powerOff();

}