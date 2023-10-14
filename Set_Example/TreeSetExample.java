package Set_Example;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Cat");
        names.add("Alice"); // 중복된 요소는 추가 X
        					// 예상 [Alice, Bob, Cat]

        System.out.println(names); // 알파벳순(오름차순)으로 출력
    }
}
