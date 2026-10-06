package oop.abstraction2; // package 끼리 공유 가능

// 클래스 변수, 클래스 메서드
// 인스턴스 변수, 인스턴스 메서드
public class MyPublic {

    // 클래스 변수
    public static String hello = "퍼블릭 클래스 변수";

    public static void pprint() {
        System.out.print("퍼블릭 클래스 메서드를 통해 출력: ");
        System.out.println(hello); // 퍼블릭 클래스 메서드를 통해 출력
    }

    public String msg = "퍼블릭 인스턴스 변수";
    public void print() {
        System.out.print("퍼블릭 인스턴스 메서드를 통해 출력: ");
        System.out.println(this.msg);
    }
}