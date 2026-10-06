package oop.abstraction2;

// class에는 public과 default만 허용
class MyDefault {
    String msg = "default 인스턴스 변수";
    void print() {
        System.out.print("default 인스턴스 메서드로 출력한 dafault 인스턴스 변수: ");
        System.out.println("this.msg");
    }
}
