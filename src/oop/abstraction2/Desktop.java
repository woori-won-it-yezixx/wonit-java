package oop.abstraction2;

// 인터페이스는 implements 라는 키워드로 '구현' 합니다.
public class Desktop implements Computer {

    String power;

    @Override // 우리가 빼먹으면 컴파일러가 넣어줍니다.
    public void login() {
        System.out.println("운영체제에 로그인을 합니다.");
    }

    @Override
    public void inApp() {
        System.out.println("앱에 들어가서 할일을 합니다.");
    }

    @Override
    public void powerOn() {
        this.power = "on";
        System.out.println("본체에 딸린 전원을 " + this.power + "했습니다");

    }

    @Override
    public void powerOff() {
        this.power = "off";
        System.out.println("본체에 딸린 전원을 " + this.power + "했습니다");
    }
}