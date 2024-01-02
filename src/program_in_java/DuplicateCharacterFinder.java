package program_in_java;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterFinder {
	public static void main(String[] args) {
		String inputString = "programming";
		Map<Character, Integer> charCountMap = new HashMap<>();
		// Iterate through each character in the string
		for (char c : inputString.toCharArray()) {
			// Check if the character is already in the map
			if (charCountMap.containsKey(c)) {
				System.out.println("Duplicate Character: " + c);
			} else {
				// If the character is not in the map, add it with count 1
				charCountMap.put(c, 1);
			}
		}
	}
}
