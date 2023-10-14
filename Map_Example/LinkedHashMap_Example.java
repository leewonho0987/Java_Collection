package Map_Example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Example {
    public static void main(String[] args) {
        // LinkedHashMap 생성
        Map<String, Integer> population = new LinkedHashMap<>();

        // 키-값 추가
        population.put("USA", 331000000);
        population.put("China", 1444000000);
        population.put("India", 1380000000);
        population.put("Korea", 50000000);

        int usaPopulation = population.get("India");
        System.out.println("India population: " + usaPopulation);
        
        population.remove("India"); // 삭제는 두 종류의 Map에서 동일한 "remove"메소드를 사용 
        							// HashMap에서 사용하지 않아서 주석 추가

        // 맵 순회 (입력된 순서를 유지)
        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        
            // 이 부분도 몰랐는데 HashMap도 순서가 유지되었음.
            // 알고보니 Java 8 이상부터 내부 구현이 변경되어 순서를 유지하도록 설계되었다고 함.
        }
    }
}
