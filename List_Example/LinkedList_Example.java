package List_Example
;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Example {
    public static void main(String[] args) {
        // LinkedList 생성
        List<String> colors = new LinkedList<>();

      
        colors.add("Red");
        colors.add("Green");
        colors.add("Purple");
        colors.add("Gray");
        colors.add("Blue");


        System.out.println(colors.get(1)); // "Green" 출력
        System.out.println();

        colors.remove(0); // "Red" 삭제 / 각 요소가 전 후 요소를 가르켜서 요소를 삭제하기 쉬움.

        for (String color : colors) {
            System.out.println(color); // 직접 삭제 후 출력해도 오류 X
        }
    }
}
