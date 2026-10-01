package oop.abstraction;

public class Desktop extends Computer {
    @Override
    void powerOn() {
        this.power = "on";
        System.out.println("본체에 딸린 전원을 " + this.power + "했습니다");
    }

    @Override
    void powerOff() {
        this.power = "off";
        System.out.println("본체에 딸린 전원을 " + this.power + "했습니다");

    }
}
