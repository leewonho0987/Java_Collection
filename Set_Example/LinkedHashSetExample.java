package Set_Example;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Cat");
        names.add("Alice"); // 중복된 요소는 추가 X
        					// 예상 [Alice, Bob, Cat]

        System.out.println(names); // 입력 순서대로 출력, 중복 X
    }
}
