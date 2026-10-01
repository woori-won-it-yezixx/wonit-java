package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        // 자료형(인터페이스, 추상클래스) 객체명 = 새로방을 판 구체적인구현체의생성자();
//        Computer comp = new Computer();
        Desktop desktop = new Desktop();
        desktop.powerOn();

        // Computer를 상속받은 Laptop 자식클래스는 전원이 모서리에 있습니다.
        Laptop labtop = new Laptop();
        labtop.powerOn();
    }
}
