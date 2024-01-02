package program_in_java;

public class SecondSmallestFinder {
	public static void main(String[] args) {
		int[] array = { 3, 7, 1, 9, 4, 6, 8, 2, 5 };

		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int num : array) {
			if (num < firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = num;
			} else if (num < secondSmallest && num > firstSmallest) {
				secondSmallest = num;
			}
		}

		System.out.println("Second Smallest Element: " + secondSmallest);
	}
}
