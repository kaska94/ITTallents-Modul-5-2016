import java.util.Scanner;

public class Exercise9 {

	public static void checkStringLength(String word) {
		if ((word != null) && !(word.isEmpty())) {
			if (word.length() > 50) {
				System.out.println("Too big , maaan...");
				System.exit(-1);
			}
		}
	}

	public static void checkForSpaces(String word) {
		if ((word != null) && !(word.isEmpty())) {
			for (int index = 0; index < word.length(); index++) {
				if (word.charAt(index) == ' ') {
					System.out.println("Only Letters. No Spaces.");
					System.exit(-1);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		boolean isNegaive = false;
		int sum = 0;
		int findedNumber;
		int counter = 0;

		System.out.println("Enter your word Word");
		word = sc.nextLine();
		checkStringLength(word);
		checkForSpaces(word);

		int indexDigit = 0;
		for (int index = 0; index < word.length(); index++) {
			if (Character.isDigit(word.charAt(index))) {
				counter = 0;
				indexDigit = index;
				isNegaive = false;
				// find digit's length
				while ((index < word.length()) && (Character.isDigit(word.charAt(index)))) {
					counter++;
					index++;
				}
				// represent a number with string
				String number = "";
				indexDigit = index - 1;
				for (int indexFroShowingNumber = (indexDigit - counter
						+ 1); indexFroShowingNumber <= indexDigit; indexFroShowingNumber++) {
					if (((indexFroShowingNumber - 1) >= 0) && (word.charAt(indexFroShowingNumber - 1) == '-')) {
						isNegaive = true;
					}
					number = number + word.charAt(indexFroShowingNumber);
				}

				if (isNegaive) {
					findedNumber = -(Integer.parseInt(number));
					System.out.println(findedNumber);
				} else {
					findedNumber = (Integer.parseInt(number));
					System.out.println(findedNumber);
				}
				sum += findedNumber;
			}
		}
		System.out.println("Sum is " + sum);

	}

}
