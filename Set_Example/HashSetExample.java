package Set_Example;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice"); 
        uniqueNames.add("Bob");
        uniqueNames.add("Cat");
        uniqueNames.add("Bob"); // 중복 요소는 추가 X
        System.out.println(uniqueNames); // 예상 [Alice, Bob, Cat]
        //HashSet은 중복을 허용하지 않고 순서 또한 유지하지 않기 때문에 결과가 다름.
    }
}
