package oop.capsulation;

//import oop.abstraction2.MyDefault;
import oop.abstraction2.MyProtected;
import oop.abstraction2.MyPublic;

/**
 * 접근 제어자	같은 클래스의 멤버	같은 패키지의 멤버	자식 클래스의 멤버	그 외의 영역
 * public             	○	          ○	            ○	           ○
 * protected	        ○	          ○	            ○	           X
 * default	            ○	          ○          	X	           X
 * private	            ○	          X         	X              X
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("myPublic ==========================");
        MyPublic myPublic = new MyPublic();
        MyPublic.pprint(); // 클래스 메서드
        System.out.println(MyPublic.hello); // 클래스 변수
        myPublic.print(); // 인스턴스 메서드
        System.out.println(myPublic.msg); // 인스턴스 변수

        System.out.println("자식클래스==========================");
        MyMyPublic myPublic2 = new MyMyPublic();
        MyMyPublic.pprint(); // 클래스 메서드
//        System.out.println(MyMyPublic.hello); // 클래스 변수
        myPublic2.print(); // 인스턴스 메서드
//        System.out.println(myPublic2.msg); // 인스턴스 변수

        System.out.println("myProteced ==========================");
        MyProtected myProtected = new MyProtected();
        MyProtected.pprint(); // 클래스 메서드
//        System.out.println(MyProtected.hello); // 클래스 변수
        myProtected.print(); // 인스턴스 메서드
//        System.out.println(myProtected.msg); // 인스턴스 변수

        System.out.println("myDefault ==========================");
//        MyDefault myDefault = new MyDefault(); // 클래스가 default이므로 외부 패키지에서 접근 불가
//        System.out.println(myDefault.msg);
//        myDefault.print();

        System.out.println("myDefault ==========================");
        MyPrivate myPrivate = new MyPrivate();
        // private 변수와 메서드 모두 확인 불가
//        System.out.println(myPrivate.msg);
//        myPrivate.print();
        myPrivate.pprint(); // private 메서드를 실행하는 public 메서드
    }
}
