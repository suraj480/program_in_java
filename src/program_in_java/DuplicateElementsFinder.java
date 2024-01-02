package program_in_java;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsFinder {
	 public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 5};
	        Map<Integer, Integer> elementCountMap = new HashMap<>();
	        for (int num : array) {
	            if (elementCountMap.containsKey(num)) {
	                System.out.println("Duplicate Element: " + num);
	            } else {
	                elementCountMap.put(num, 1);
	            }
	        }
	    }
}
