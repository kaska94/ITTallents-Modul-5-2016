import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Exercise7 {
	public static void checkStringLength(String word) {
		if ((word != null) && !(word.isEmpty())) {
			if (word.length() > 256) {
				System.out.println("Too big , maaan...");
				System.exit(-1);
			}
		}
	}

	public static void checkForLettersAndSpaces(String word) {
		if ((word != null) && !(word.isEmpty())) {
			for (int index = 0; index < word.length(); index++) {
				if (word.charAt(index) != ' ') {
					if (!(Character.isLetter(word.charAt(index)))) {
						System.out.println("Only Letters. No Spaces.");
						System.exit(-1);
					}
				}
			}
		}
	}

	public static void printMeAnArrayOfStrings(String[] arrayOfStrings) {
		for (int index = 0; index < arrayOfStrings.length; index++) {
			System.out.print(arrayOfStrings[index] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentance;
		String[] arrayOfWords;
		int countMaxSymbols = 0;

		System.out.println("Enter words with spaces between them");
		
		sentance = sc.nextLine();
		checkStringLength(sentance);
		checkForLettersAndSpaces(sentance);
		
		arrayOfWords = sentance.split(" ");
		for (int index = 0; index < arrayOfWords.length; index++) {
			int tempCountSymbols = 0;
			for (int indexLetter = 0; indexLetter < arrayOfWords[index].length(); indexLetter++) {
				tempCountSymbols++;
				if (tempCountSymbols > countMaxSymbols) {
					countMaxSymbols = tempCountSymbols;
				}
			}
		}
		System.out.println(arrayOfWords.length + " words. Biggest has size of: " + countMaxSymbols);

	}

}
