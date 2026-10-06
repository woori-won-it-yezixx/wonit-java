package oop.abstraction2;

public class MyProtected {
    // 클래스 변수
    protected static String hello = "protected 클래스 변수";

    public static void pprint() {
        System.out.print("public 클래스 메서드를 통해 protected 클래스 변수를 출력: ");
        System.out.println(hello); // 퍼블릭 클래스 메서드를 통해 출력
    }

    protected String msg = "protected 인스턴스 변수";
    public void print() {
        System.out.print("public 인스턴스 메서드를 통해 protected 변수를 출력: ");
        System.out.println(this.msg);
    }
}
