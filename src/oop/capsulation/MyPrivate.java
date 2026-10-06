package oop.capsulation;

public class MyPrivate {
    private String msg = "private 변수";
    private void print(){
        System.out.print("private 메서드로 출력한 private 변수");
        System.out.println(this.msg);
    }
    public void pprint(){
        print();
    }
}
