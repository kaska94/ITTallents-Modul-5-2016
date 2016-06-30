
public class Exercise14 {
	public static long recursionFibonachi(int number) {
		if (number <= 0) {
			return 0;
		}
		if (number == 1) {
			return 1;
		} else {
			return number * recursionFibonachi(number - 1);
		}
	}

	public static int noRecursionFibonachi(int number) {
		int multiplication = 1;
		if (number <= 0) {
			return 0;
		}
		for (int index = number; index > 1; index--) {
			multiplication *= index;
		}
		return multiplication;
	}

	public static void main(String[] args) {
		System.out.println(recursionFibonachi(6));
		System.out.println(noRecursionFibonachi(5));
	}

}
