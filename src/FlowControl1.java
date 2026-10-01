public class FlowControl1 {
    public static void main(String[] args) {
        // if ~ else if ~ else 구문
        // if (조건식) { 실행문
        // } else if (조건식2) {
        // 조건식2가 참일 때 실행문
        // } else {
        // 거짓인 경우 실행문 }
        System.out.println( "|| ---- " + (true || check() ));
        System.out.println( "| ---- " + (true | check() ));

        System.out.println( "|| ---- " + (check() || true ));
        System.out.println( "| ---- " + (check() | true ));


        // and(&, &&), or(|, ||), not(!)
        if (false | true) {
            System.out.println("참입니다");
        } else {
            System.out.println("거짓입니다");
        }


        int num = 0;

        // if ~ else ~ if else 양수이면 양수,
        // 0이면 0입니다, 음수이면 음수 라고 문자열을 콘솔에 출력하는 조건문을 만들어주세요.
        if (num > 0) {
            System.out.println("양수입니다");
        } else if (num < 0) {
            System.out.println("음수입니다");
        } else {
            System.out.println("0입니다");
        }

        // switch ~ case 구문
        // 딱 정해진 결과가 나오는 경우
        // switch (판별조건) {
        //    case 케이스1:
        //              실행문;
        //              break;
        //    case 케이스2:
        //              실행문;
        //              break;
        //    default:
        //              나머지 모든 경우의 실행문;
        //              break; // 마지막줄인 경우에는 생략 가능
        // }

        num = -3;

        switch (Integer.compare(num, 0)) {
            case 1:
                System.out.println("양수입니다");
                break;
            case -1:
                System.out.println("음수입니다"); // 실행문1
                System.out.println(num); // 실행문2
                break;
            default:
                System.out.println("0입니다");
                // break;  //  마지막줄이므로 생략 가능
        }

        // 화살표(->)로 : 과 break를 생략
        switch (Integer.compare(num, 0)) {
            case 1 -> System.out.println("양수입니다");
            case -1 -> {    // 실행문이 여러줄일 때는 { }을 구분해서 넣어줍니다.
                System.out.println("음수입니다");
                System.out.println(num);
            }
            default -> System.out.println("0입니다");
        }

        // 삼항연산자    식 ? 참 : 거짓
        System.out.println((num == 0) ? "0입니다" : "0이 아닙니다");

        // 너무 깊어지면 헷갈리니까 2개 정도 이상이 되면 if / switch로 변경
        System.out.println((num == 0) ? "0입니다" : (num > 0) ? "양수입니다" : "음수입니다" );
    }

    // 접근제어자 함수의메모리위치 리턴타입 함수명(파라미터)
    public static boolean check(){
        System.out.println("check 실행");
        return false;
    }
}
