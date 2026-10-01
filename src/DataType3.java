import java.util.*;

public class DataType3 {
    public static void main(String[] args) {
        // Map - key로 value에 접근하는 자료형
        // Array, List 순서대로 값 찾음
        // Map 값에 바로 접근
        // key와 value를 저장해야되므로 array보다 용량 큼
        // key가 같으면 value 바뀜, 중복 불가
        // {'name':'김연지', 'age':'25'}
        //         List<String> list4 = new ArrayList<>();
        //        list4.add("감나무");
        //        System.out.println(list4);

        // 인터페이스(자료구조)<key자료형, value자료형> 변수명 = new 구현체<>();
        // 인터페이스: 구체적 내용은 적혀있지 않고 구현체에 실제로 적혀있음
        // 제네릭 타입
//        Map<String, String> map1 = new HashMap<>();
//        Map<String, String> map2 = new TreeMap<>();
        Map<String, String> map1 = new LinkedHashMap<>(); // 순서 기억
        map1.put("가", "가위");
        map1.put("나", "나비");
        map1.put("다", "다람쥐");
        System.out.println(map1);
        map1.put("다", "다리미");
        System.out.println(map1);
        System.out.println(map1.remove("나"));
        System.out.println(map1);
        System.out.println(map1.get("가"));
        System.out.println(map1.get("라"));
        System.out.println(map1.containsKey("가"));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.entrySet());
        System.out.println("====================");

        // Set - 중복을 허용하지 않는 자료형
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        System.out.println(set1);
        System.out.println("====================");

        // enum
        Map<Language, Integer> map2 = new HashMap<>();
        map2.put(Language.JAVA, 3); // String으로 받았으면 소문자, 대문자, 한글 가리지 않고 받음 -> enum으로 고정해놓은 값만 받을 수 있게 함
        System.out.println(map2);
    }

    // enum - 상수처럼 변하지 않는 고정된 값만 선택 가능한 자료형
    enum Language {
        JAVA, JAVASCRIPT, HTML, CSS
    }
}
