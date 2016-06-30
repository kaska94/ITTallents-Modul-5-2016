import java.util.Scanner;

public class Exercise12 {

	public static int[] createMeAnArray(int toWhichNumber) {
		int[] arrayOfInts = new int[toWhichNumber];
		for (int index = 0; index < arrayOfInts.length; index++) {
			arrayOfInts[index] = index + 1;
		}
		return arrayOfInts;
	}
	
	public static void printMeAnArray(int[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}

	public static void main(String[] args) {
		int size = 0;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();

		if (size < 0) {
			System.out.println("Erro size must be postive");
			return;
		}

		int[] arrayOfInts = createMeAnArray(size);
		for (int index = 0; index < arrayOfInts.length; index++) {
			arrayOfInts[index] = index + 1;
		}
		printMeAnArray(arrayOfInts);
	}
}
