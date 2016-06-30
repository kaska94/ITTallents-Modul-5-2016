import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class Exercise10 {
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
		char[] lettersInWord;

		System.out.println("Enter your word Word");
		word = sc.nextLine();
		checkStringLength(word);
		checkForSpaces(word);

		lettersInWord = new char[word.length()];

		for (int index = 0; index < word.length(); index++) {
			lettersInWord[index] = (char) (((int) word.charAt(index)) + 5);
		}
		// this
		for (int index = 0; index < word.length(); index++) {
			System.out.print(lettersInWord[index]);
		}

		System.out.println("\nWanted to try diffrent slow aproach");
		// or this
		String str = "";
		for (int index = 0; index < lettersInWord.length; index++) {
			str = str + lettersInWord[index];
		}
		System.out.println(str);
	}

}
