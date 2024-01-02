package program_in_java;

public class RootFinder {
	public static void main(String[] args) {
		int number = 16;

		double squareRoot = Math.sqrt(number);
		double cubeRoot = Math.cbrt(number);

		System.out.println("Square Root: " + squareRoot);
		System.out.println("Cube Root: " + cubeRoot);
	}
}
