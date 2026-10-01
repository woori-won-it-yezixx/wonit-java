import java.util.NoSuchElementException;
import java.util.Scanner;

public class FlowControl3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.
        System.out.print("값 입력: ");
        String num = sc.next();
        System.out.println(num);
        System.out.print("숫자 입력: "); // 숫자 안 들어오면 InputMismatchException -> 문자열로 받아서 형변환 하는 것 권장
        int num1 = sc.nextInt();
        System.out.println(num1);

        // 2. 값이 null인지 확인한다.
        // 3. 숫자이면 형변환 (Integer.~~~)
        // q, 또는 Q가 들어오면 종료를 누를 거고요.
        // 숫자가 들어오면 -> 양수, 음수, 0을 판별합니다.
        while (true){
            System.out.print("값 입력: ");
            String str = sc.next();
            if(str != null && str.toLowerCase().equals("q")) {
                System.out.println("프로그램 종료");
                break;
            }
            try{
                int num2 = Integer.parseInt(str);
                if(num2<0) System.out.println(num2+" - 음수");
                else if(num2==0) System.out.println(num2+" - 0");
                else System.out.println(num2+" - 양수");
            }catch (NumberFormatException e){
                System.out.println("입력하신 문자가 숫자가 아닙니다.");
            }catch (NullPointerException e) {
                System.out.println("입력된 문자가 없습니다.");
            }
        }

        // 1.
        System.out.println("값 입력: ");
        String num4 = sc.next();
        System.out.println(num);

        try {
            // 2. 값이 null인지 확인한다.
            // q, 또는 Q가 들어오면 종료를 누를 거고요. - 문자열로 해결할 수 있는 거 먼저 해결
            if (num4 != null && (num4.equals("q") || num4.equals("Q"))) {
                System.out.println("프로그램 종료");
            } else {
                // 3. 숫자이면 형변환 (Integer.~~~)
                int num2 = Integer.parseInt(num4);
                // 숫자가 들어오면 -> 양수, 음수, 0을 판별합니다.
                if (num2 > 0) {
                    System.out.println("양수입니다");
                } else if (num2 < 0) {
                    System.out.println("음수입니다");
                } else {
                    System.out.println("0입니다");
                }
            }
        }  catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 값을 입력함"+ e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("값이 아예 입력되지 않음"+ e.getMessage());
        } catch (Exception e) {
            System.out.println("뭐가 됐든 예외 발생함"+ e.getMessage());
        } finally {
            sc.close(); // 사용자 입력 객체를 반납
        }
    }
}

