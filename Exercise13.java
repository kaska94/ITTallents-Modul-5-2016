import java.util.Arrays;
import java.util.Scanner;

public class Exercise13 {
	public static int[] createMeAnArray(int[] firstArray, int[] secondArray) {
		int[] thirdArray = new int[firstArray.length + secondArray.length];
		int thirdArrayIndex = 0;
		for (int index = 0; index < firstArray.length; index++) {
			thirdArrayIndex = index;
			thirdArray[thirdArrayIndex] = firstArray[index];
		}

		for (int index = 0; index < secondArray.length; index++) {
			thirdArrayIndex++;
			thirdArray[thirdArrayIndex] = firstArray[index];
		}
		return thirdArray;
	}

	public static void main(String[] args) {
		int[] firstArray = giveMeArray();
		int[] secondArray = giveMeArray();
		System.out.println(Arrays.toString(createMeAnArray(firstArray, secondArray)));

	}

	public static int[] giveMeArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");

		int size = sc.nextInt();
		if (size > 50) {
			System.out.println("Too big man");
			System.exit(-1);
		}

		int[] array = new int[size];
		for (int index = 0; index < array.length; index++) {
			System.out.println("Enter element " + (index + 1));
			array[index] = sc.nextInt();
		}

		return array;

	}

}
