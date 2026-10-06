package oop.abstraction2;

public class Main {
    public static void main(String[] args) {
        // 자료형   변수명  = 새로운방에 판  생성자
        Computer desktop1 = new Desktop();
        desktop1.powerOn();
        desktop1.login();
        desktop1.inApp();
        desktop1.powerOff();

    }
}