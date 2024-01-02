package program_in_java;

public class SecondLargestFinder {
	public static void main(String[] args) {
		int[] array = { 3, 7, 1, 9, 4, 6, 8, 2, 5 };

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : array) {
			if (num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			} else if (num > secondLargest && num < firstLargest) {
				secondLargest = num;
			}
		}

		System.out.println("Second Largest Element: " + secondLargest);
	}
}
