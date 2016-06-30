import java.util.Arrays;

public class Exercise11 {
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
		int[] array = createMeAnArray(30);
		System.out.println(Arrays.toString(array));
		printMeAnArray(array);
	}
}
