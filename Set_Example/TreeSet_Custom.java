package Set_Example;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Custom {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(new AbsoluteValueComparator());

        numbers.add(-5);
        numbers.add(3);
        numbers.add(-200);
        numbers.add(-2);
        numbers.add(108);
        numbers.add(-108);

        System.out.println(numbers); // 예상 [-2, 3, -5, 108, -108, -200]
    }								 // 결과 [-2, 3, -5, 108, -200]
}									 // 결국 TreeSet에 들어가는건 중복된 절대값 108이기 때문에 먼저 들어온 108만 유지

class AbsoluteValueComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        int abs1 = Math.abs(num1); // num1의 절대값을 구함
        int abs2 = Math.abs(num2); // num2의 절대값을 구함
        return Integer.compare(abs1, abs2); // 두 수의 절대값을 비교하여 작은 순서대로 배치
    }
}
