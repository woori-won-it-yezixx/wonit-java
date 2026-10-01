package oop.inheritance;

// Student를 상속받은 자식클래스 AStudent
public class AStudent extends Student {

    // 우리반의 정원은 27명입니다.
    // 다형성: 부모클래스와 같은 이름으로 다른 값을 사용
    static int totalStudentNo = 27;

    // 다형성: 부모클래스와 같은 이름으로 다른 메서드를 사용
    static int getTotalStudentNo() {
        return totalStudentNo;
    }

    String teamName; // 부모클래스에는 없고 자식클래스에서만 있는 인스턴스 변수

    // 생성자함수에 무조건 이름, 반, team이름을 함께 받도록 하나 생성자 함수를 만들어 주시고
    //
    AStudent(String newName, String newClassName, String teamName) {
//        this.name = newName;
//        this.className = newClassName;
        super(newName, newClassName); // 부모 생성자로 입력받은 값을 넘겨서
        this.teamName = teamName;
    }

    // 인스턴스메서드: enter  -> A반입니다.를 마지막줄에 하나 더 얹어서 사용
    // @Override : 빼먹어도 컴파일러가 넣어줍니다.
    void enter() {
        System.out.println("A반입니다");
        super.enter();
    }

    // Overload: JAVA는 함수 헤더(시그니처) 한줄로 함수를 구분합니다.
    // 그래서 같은 클래스 내에서도 같은 함수를 여러 방식으로 사용 가능합니다.
    void enter(String time) {
        System.out.println(time+ "시에 A반 학생이 들어옵니다");
        super.enter();
    }

    // 자식클래스에만 있는 인스턴스 메서드
    // shin.introduce(); -> "신짱구 / A반 / 이름없조" 인스턴스 메서드를 A반에만 만들어주세요
    void introduce() {
        System.out.println(this.name + " / " + this.className + " / " + this.teamName );
    }
}
