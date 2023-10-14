package List_Example;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Example {
    public static void main(String[] args) {
        // ArrayList 생성
        List<String> fruits = new ArrayList<>();

       
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Dragonfruit");
        fruits.add("Grape");		// 중복 및 순서 무작위

        System.out.println(fruits.get(1)); // "Banana" 출력
        System.out.println(""); 
        
        List<String> itemsToRemove = new ArrayList<>(); // 그래서 삭제할 요소를 저장할 리스트를 생성
        
        
        for (String Test : fruits) {  // fruit(무슨 글자든 상관 없음)를 출력하라 fruits ArrayList에서
            System.out.println(Test);

        //  fruits.remove(1); // "Banana" 삭제 / 몰랐는데 컬렉션의 직접 수정은 오류를 발생시킴.

            if (Test.equals("Banana")) {
                itemsToRemove.add(Test); // 삭제할 요소를 추가
            }
        }
        
        fruits.removeAll(itemsToRemove); // 여기서 한번에 요소를 삭제
        
        for (String fruit: fruits) { 
            System.out.println(fruit); // 오류 없이 정삭 출력
        }
    }
}

