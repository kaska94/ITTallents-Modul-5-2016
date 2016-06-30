import java.util.Scanner;

public class Exercise6 {

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
						System.out.println("Only Letters and Spaces.");
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

		sentance = sc.nextLine();
		checkStringLength(sentance);
		checkForLettersAndSpaces(sentance);

		arrayOfWords = sentance.split(" ");
		for (int index = 0; index < arrayOfWords.length; index++) {
			if ((arrayOfWords != null) && (!(arrayOfWords[index].isEmpty()))) {
				char firstLetter = Character.toUpperCase((arrayOfWords[index].charAt(0)));
				arrayOfWords[index] = arrayOfWords[index].substring(1);
				arrayOfWords[index] = firstLetter + arrayOfWords[index];
			}
		}
		printMeAnArrayOfStrings(arrayOfWords);
	}

}
