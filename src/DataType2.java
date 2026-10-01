import java.util.ArrayList;
import java.util.Arrays;

// 참조 자료형
public class DataType2 {

    public static void main(String[] args) {
        // [ ]: Array 방 크기를 고정해놓고 사용하는 참조자료형
        int a = 1;

        // 1. 선언 및 할당(대입) true, false, true
        int[] arr1 = {1, 2, (int)3.14}; // 실수->정수 형변환은 자동으로 안됨
//        double[] arr1 = {0.1, 3.14, 1}; // 정수->실수 형변환은 자동으로 됨

        // [I@10f87f48
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[2]); // 순서가 0부터 시작, 방 범위를 벗어나면 에러, 음수 인덱싱도 불가

        // 2. 선언 먼저 하고 값은 나중에 대입 String으로 바꾸고 '가위', '나비', '다람쥐'
//        int[] arr2 = new int[3]; // 방 크기만 정하고 Array 만듦
        String[] arr2 = new String[3]; // 방 크기만 정하고 Array 만듦

        // int로 만든 각 방에는 어떤 값이 들어있을까요?
        // int, long은 기본값으로 0이 들어있음. double이나 float은 0.0
        // String으로 만든 Array는 기본값으로 null이 들어있음.
        System.out.println(Arrays.toString(arr2));
        arr2[0] = "가위";
        arr2[1] = "나비";
        arr2[2] = "다람쥐";
        // arr2[3] = "라디오";
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[2]);

        // Array(배열, 방을 나눠서 각 값을 저장하는 참조자료형)을
        // List(값을 순서대로 담는 자료구조, 같은 값을 여러번 담을 수 있습니다, 가변 가능)

        // Integer는 int 라는 방 안에 바로 값이 들어있는 기본자료형을
        // String 같은 참조자료형처럼 감싸주는 wrapper class 라고 부릅니다.
        //int[] arr2 = new int[3];
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        System.out.println(list1);
        // list1[0] = 1; -> 직접 접근 불가
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.get(1)); // 방번호로 조회
        // System.out.println(list1.get(-1)); // 음수 인덱싱, 넘치는 방 조회
        System.out.println(list1);

        // ArrayList<자료형> 변수명 = new ArrayList<자료형>();
        //          <Generic-자료형을고정해주는장치>
        ArrayList list2 = new ArrayList();
        list2.add(3.14);
        list2.add(true);
        list2.add(0);
        list2.add("다람쥐");
        System.out.println(list2);
        // list1.add("가위");

        // Create-add / Read-get / Update-set / Delete-remove
        // ArrayList<자료형> 변수명 = new ArrayList<자료형>();
        //          <Generic-자료형을고정해주는장치>
        // list3를 만듭니다. String만 들어가는 ArrayList입니다.
        ArrayList<String> list3 = new ArrayList<>(); // 생략하면 컴파일러가 자동으로 넣어줍니다.
        // '가위', '나무', '다람쥐' 넣고
        list3.add("가위");
        System.out.println(list3);
        list3.add("나비");
        list3.add("다람쥐");
        System.out.println(list3);
        // '다리미' 로 2번방 변경,
        list3.set(2, "다리미");
        System.out.println(list3);
        // '나무'를 삭제해보세요.
        list3.remove("나비"); // 있는 값 삭제
        list3.remove(0); // 방번호로 삭제
        System.out.println(list3.remove("나무")); // 없으면 false 리턴하고 정상 동작
        // list3.remove(3);
        System.out.println(list3);
    }
}