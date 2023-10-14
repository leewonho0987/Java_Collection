package Set_Example;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSet_descending {
    public static void main(String[] args) {
    	// 정수를 내림차순으로 정렬하는 TreeSet
        TreeSet<Integer> descendingOrderSet = new TreeSet<>(Comparator.reverseOrder());

		descendingOrderSet.add(-98);
        descendingOrderSet.add(3);
        descendingOrderSet.add(1);
        descendingOrderSet.add(2);
        descendingOrderSet.add(108);
        

        System.out.println(descendingOrderSet); // 예상 [108, 3, 2, 1, -98]
    }
}

/*
public class TreeSet_descending {
    public static void main(String[] args) {
        // 문자열을 내림차순으로 정렬하는 TreeSet
        TreeSet<String> descendingOrderSet = new TreeSet<>(Comparator.reverseOrder());

        descendingOrderSet.add("Apple");
        descendingOrderSet.add("Banana");
        descendingOrderSet.add("Delete");
        descendingOrderSet.add("Cherry");
        descendingOrderSet.add("Apple");

        System.out.println(descendingOrderSet); // 예상 [Delete, Cherry, Banana, Apple]
    }
}

*/