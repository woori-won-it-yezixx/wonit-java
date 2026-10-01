public class FlowControl2 {
    public static void main(String[] args) {
        // 문자열로 들어온 숫자를 받아서 1과 1이 아닌 값을 판별하는 간단한 조건문
        // != 는 같지 않음, ==은 같음
        String num = "1234-567";

        // java는 string pool로 문자열 관리, 같은 문자열이면 같은 곳 참조/재사용
        // new로 별도의 메모리 공간에 새로 생성
        // 문자열은 == 은 메모리 주소 비교
        // 값을 비교하려면 equals
        String comparedNum = new String("1234-567");
        // 값이 null이 아니고, 1인지 확인
        // if ~ else ~ if else 양수이면 양수,
        // NPE (NULL POINTER EXCEPTION: 참조자료형인데 메모리 주소가 비어있음. 그래서 값없음과 값 비교할 수 없음)
        // if (num.equals(comparedNum) && num != null) {
        // && 앞에 NULL 여부를 확인해 놓으면
        // if ( num != null && num.equals(comparedNum)) { // 에러 방지 (단락평가)
        if (num != null && num.equals(comparedNum)) {
            System.out.println("결과값이 같습니다");
        } else {
            System.out.println("같지 않습니다.");
        }
    }
}
