package oop.abstraction;

public class Laptop extends Computer{
    @Override
    void powerOn() {
        this.power = "on";
        System.out.println("키보드 모서리에 있는 전원을 " + this.power + "합니다");
    }

    @Override
    void powerOff() {
        this.power = "off";
        System.out.println("키보드 모서리에 있는 전원을 " + this.power + "합니다");
    }
}
