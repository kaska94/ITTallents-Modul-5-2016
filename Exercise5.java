import java.util.Scanner;

import javax.print.attribute.standard.Fidelity;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class Exercise5 {

	public static void checkStringForOnlyLetters(String word) {
		if ((word != null) && !(word.isEmpty())) {
			for (int index = 0; index < word.length(); index++) {
				if (!(Character.isLetter(word.charAt(index)))) {
					System.out.println("Only Letters. No Spaces.");
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
		String wordFirst;
		String wordSecond;
		int indexToRemember = -1;
		int indexOfSpaces = -1;

		boolean didIFindAMatch = false;

		System.out.println("Enter the first Word");
		wordFirst = sc.nextLine();
		checkStringLength(wordFirst);
		checkStringForOnlyLetters(wordFirst);

		System.out.println("Enter the Second Word");
		wordSecond = sc.nextLine();
		checkStringLength(wordSecond);
		checkStringForOnlyLetters(wordSecond);

		for (int firstWordIndex = 0; firstWordIndex < wordFirst.length(); firstWordIndex++) {
			for (int secondWordIndex = 0; secondWordIndex < wordSecond.length(); secondWordIndex++) {
				if (!didIFindAMatch) {
					if (wordFirst.charAt(firstWordIndex) == wordSecond.charAt(secondWordIndex)) {
						indexToRemember = firstWordIndex;
						indexOfSpaces = secondWordIndex;
						didIFindAMatch = true;
						break;
					}
				}
			}
		}

		if (didIFindAMatch) {
			for (int firstWordIndex = 0; firstWordIndex < wordFirst.length(); firstWordIndex++) {
				if (firstWordIndex != indexToRemember) {
					for (int index = 0; index < indexOfSpaces; index++) {
						System.out.print(" ");
					}
					System.out.println(wordFirst.charAt(firstWordIndex));
				} else {
					System.out.println(wordSecond);
				}
			}
		} else {
			System.out.println("no matches");
		}

	}
}
