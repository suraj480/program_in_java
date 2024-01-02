package program_in_java;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberFinder {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 5};
        Map<Integer, Integer> numberCountMap = new HashMap<>();
        for (int num : array) {
            if (numberCountMap.containsKey(num)) {
                System.out.println("Duplicate Number: " + num);
            } else {
                numberCountMap.put(num, 1);
            }
        }
    }
}
