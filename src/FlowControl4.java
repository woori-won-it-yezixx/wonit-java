import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FlowControl4 {
    public static void main(String[] args) {
        // for 와 while
        // 반복의 회수가 정해진 경우
        // for (초기값; 조건식; 증감식) {
        //             조건을 만족할 때까지 실행될 실행문
        // }
        // 1~10까지 짝수만 출력하는 for 문 while문
        for(int i=1;i<=10;i++){
            if(i%2==0) System.out.println(i);
        }

        // 반복의 회수가 정해져있지 않은 경우
        // 초기값
        // while (조건식) { 실행문 }
        int i=1;
        while(i<=10){
            if(i%2==0) System.out.println(i);
            i++;
        }

        // Array / ArrayList / Map 의 반복문

        // 3. 배열(Array): 같은 자료형의 값을 고정된 크기로 저장
        System.out.println("[Array]"); // + 먹고싶다
        String[] cheese = {
                "cheddar", "gouda", "edam", "provolone", "parmesan"
        };

        System.out.println(cheese.length); // array의 길이(원소의 개수)

        // for (초기값; 조건식; 증감식) {   }
        for (int cnt = 0; cnt < cheese.length; cnt++) {
            System.out.println(cheese[cnt] + " 먹고 싶다");
        }

        System.out.println("======= for each 문 ===========");
        // for ~ each 문     for (자료형 단수공갈문자: 집합자료명) { 실행문 }
        for (String item: cheese) {
            System.out.println(item + "먹고 싶다");
        }

        // 4. ArrayList: 크기를 변경할 수 있는 방번호로 접근하는 자료형
        System.out.println("[ArrayList]");
        ArrayList<String> cheeseList = new ArrayList<>(Arrays.asList( "cheddar", "gouda", "edam", "provolone", "parmesan"));
        System.out.println(cheeseList);
        System.out.println(cheeseList.size()); // arrayList의 길이(원소의 개수)

        // for문, for each문을 활용해서 `~ 먹고 싶다` 를 출력해보세요
        for (int cnt = 0; cnt < cheeseList.size(); cnt++) {
            System.out.println(cheeseList.get(i) + " 먹고 싶다");
        }
        for(String str:cheeseList){
            System.out.println(str+" 먹고 싶다");
        }

        // 문자열은 메모리주소를 경유하는 집합자료형이기 때문에 == 은 메모리주소, .equals(값)로 비교
        // 문자열은 메모리를 얼마나 차지할지 모르니까 String Pool이라는 특별한 공간에 저장합니다.
        System.out.println("============= [break] 완전 종료 ==================");
        String hates = new String("gouda"); // 변수에 gouda 라는 값이 저장되어있음
        // 5. break -> 현재 반복문 전체를 종료
        for (String item: cheeseList) {
            // gouda 를 만나는 순간 반복 종료 - if
            if (item.equals(hates)) { // 문자열에 대해서는 .equals(_)로 값 자체를 비교하는 방식으로 습관
                break;
            }

            System.out.println(item + "먹고 싶다");
        }

        System.out.println("============= [continue] 한번만 넘어감 ==================");
        // 6. continue -> 현재 반복만 건너뛰고 다음 반복을 진행
        for (String item: cheeseList) {

            // gouda 만 빼고 나머지만 먹고 싶다 - continue는 아래 작성된 코드를 한 번만 무시
            if (item.equals(hates)) { // 문자열에 대해서는 .equals(_)로 값 자체를 비교하는 방식으로 습관
                continue;
            }

            System.out.println(item + "먹고 싶다");

        }

        // 7. Map: key와 value를 한 쌍으로 저장
        System.out.println("============= [Map] =========== ");
        Map<String, Double> scores = new HashMap<>();
        scores.put("짱구", 80.0);
        scores.put("훈이", 70.0);
        System.out.println(scores);
        System.out.println(scores.entrySet());
        System.out.println(scores.keySet());
        System.out.println(scores.values());
        // for (초기값; 조건식; 증감식) 은 방번호가 없으므로 사용 불가
        // for ~ each
        for (String key: scores.keySet()) {
            System.out.println(key + " " + scores.get(key));
        }

        for (Map.Entry<String, Double> entry: scores.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
