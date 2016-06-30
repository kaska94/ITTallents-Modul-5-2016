import java.util.Scanner;

public class Exercise8 {

	public static void checkStringForOnlyLetters(String word) {
		if ((word != null) && !(word.isEmpty())) {
			for (int index = 0; index < word.length(); index++) {
				if (!(Character.isLetter(word.charAt(index)))) {
					System.out.println("Only Letters. No Spaces. One word");
					System.exit(-1);
				}
			}
		}
	}

	public static void checkStringLength(String word) {
		if ((word != null) && !(word.isEmpty())) {
			if (word.length() > 50) {
				System.out.println("Too big , maaan...");
				System.exit(-1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		boolean isPolindtrom = true;

		System.out.println("Enter your word Word");
		word = sc.nextLine();
		checkStringLength(word);
		checkStringForOnlyLetters(word);

		int leftIndex = 0;
		int rightIndex = (word.length() - 1);
		while (leftIndex < rightIndex) {
			if (word.charAt(leftIndex) != word.charAt(rightIndex)) {
				isPolindtrom = false;
			}
			leftIndex++;
			rightIndex--;
		}

		if (isPolindtrom) {
			System.out.println("Word is polindrom");
		} else {
			System.out.println("Word is  not polindrom");
		}
	}
}
