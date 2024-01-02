package program_in_java;

public class MinMaxNumberFinder {
	public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        int smallest = array[0];
        int largest = array[0];

        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            } else if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Smallest Number: " + smallest);
        System.out.println("Largest Number: " + largest);
    }
}
