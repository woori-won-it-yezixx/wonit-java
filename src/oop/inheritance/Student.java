package oop.inheritance;

// 클래스 안에: 클래스 변수, 클래스 메서드
//             인스턴스 변수, 인스턴스 메서드
// 부모 클래스 : 자식 클래스들이 공통적으로 사용하는 속성(field), 동작(method)를 정의해두고 재사용성 고려
public class Student {

    // 클래스 변수는 인스턴스를 만들지 않아도 직접 사용할 수 있도록 static 키워드로 선언
    // Student.변수명;
    static int totalStudentNo = 60;

    // 인스턴스 변수(field)
    String name; // 수강생 이름
    String className; // 수강반명

    // 생성자 함수를 오버로딩(같은 함수명을 다양한 방식으로 사용)
    Student(){
    }

    Student(String newName){
        this.name = newName;
    }

    // 생성자 함수를 오버라이딩
    Student(String newName, String newClassName){
        this.name = newName;
        this.className = newClassName;
    }

    // 클래스 메서드도 static 키워드로 선언 Student.메서드명();
    static int getTotalStudentNo() {
        return totalStudentNo;
    }

    // 인스턴스 메서드
    void enter(){ // this.로 각 인스턴스의 메모리 주소를 부릅니다.
        System.out.println(this.name+"이 입실합니다.");
    }
}