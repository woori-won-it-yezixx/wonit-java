package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.totalStudentNo); // 클래스 변수
        System.out.println(Student.getTotalStudentNo()); // 클래스 메서드

        // 자료형 방이름 = 새로방을파서 생성자();
        // 생성자: 인스턴스가 최초로 생성될 때 딱 한번만 실행되는 함수
        // 자바컴파일러는 우리가 생성자를 직접 작성하지 않으면 아무 값도 넣지 않고 객체를 만드는 기본생성자를 넣어줍니다.
        String a = new String();
        Student kim = new Student();
        kim.name ="김연지";
        kim.enter();
        System.out.println(kim.name);

        Student lee = new Student("이영희","C반");
        lee.enter();

        AStudent shin = new AStudent("신짱구", "A반", "이름없조");
        shin.name ="신짱구";
        shin.enter();
        shin.enter("11시");
        System.out.println(shin.name);
        System.out.println(AStudent.totalStudentNo); // 클래스변수 오버라이드
        System.out.println(AStudent.getTotalStudentNo()); // 클래스메서드 오버라이드
        shin.introduce();
    }
}