package Map_Example;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {
    public static void main(String[] args) {
        // HashMap 생성
        Map<String, Integer> population = new HashMap<>();

        // 키-값 추가
        population.put("USA", 331000000);
        population.put("China", 1444000000);
        population.put("India", 1380000000);

        // 값 조회 ('USA" Key로 Value(인구수)를 찾기)
        int usaPopulation = population.get("USA");
        System.out.println("USA population: " + usaPopulation);

        // 맵 순회
        for (Map.Entry<String, Integer> country : population.entrySet()) {
            System.out.println(country.getKey() + ": " + country.getValue());
        }
    }
}
