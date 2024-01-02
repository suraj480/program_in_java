package program_in_java;

public class MissingNumberFinder {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };

		int n = array.length + 1;
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;

		for (int num : array) {
			actualSum += num;
		}

		int missingNumber = expectedSum - actualSum;
		System.out.println("Missing Number: " + missingNumber);
	}
}
