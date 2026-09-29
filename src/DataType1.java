public class DataType1 {
    // 자바의 기본 자료형들
    public static void main(String[] args) {
        // 자료형 방이름 = 값;
        // 정수: int(4바이트, 기본값), long(8바이트)
        // 기본자료형이 아닌 자료형으로 방을 팔 때는 구분하기 위해 뒤에 대문자로 자료형의 앞글자를 적어줍니다.
        int a = 1;
        long b = 123_214_222_423_425_236L; // 끊어보기 편하게 자리수가 커지면 세자리수마다 _로 구분하기도 합니다.

        // 실수: float(4바이트), double(8바이트, 기본값)  c, d 변수에 3.14를 넣어서 각각 출력, 더할때 형변환 여부 확인 출력
        float c = 3.14F; // 기본자료형이 아닌 자료형으로 방을 팔 때는 구분하기위해 자료형 앞글자를 적어줍니다.
        double d = 3.14;

        // 문자(1글자)는 char (2byte) : 자바는 UTF-16 인코딩 방식으로 문자열을 저장
        char e = '가'; //  ' ' 로 묶어줍니다.

        // 참조자료형: String은 char 를 순서대로 꿰어놓았기 때문에 String이라고 불리웁니다. " "로 묶어줍니다.
        String f = "가나다";

        // 자바의 boolean 타입(1바이트)은 소문자 true, false
        boolean g = false;

        // System.out.println(a+g); // 숫자와 boolean은 호환 불가
        // System.out.println(a+e); // 1 + 가 = 44033  유니코드 번호
        System.out.println(g);
        System.out.println(e+f); // 문자와 문자열은 서로 호환됩니다.
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(c+d); // 정수, 실수끼리 형변환 되나
        // 실수는 부동소수점 방식입니다.
        System.out.println(a+c); // 정수랑 실수 서로 형변환 되나?
    }

}