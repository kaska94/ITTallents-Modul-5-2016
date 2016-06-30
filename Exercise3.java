import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words;
		int indexOfBiggerWords = 0;

		System.out.println("Enter sequence with two words (128 chars). No Spaces! Use , for spliting the words");
		String sequence = sc.nextLine();
		if (sequence.length() > 128) {
			System.out.println("It's too big...");
			return;
		}
		
		for (int index = 0; index < sequence.length(); index++) {
			if (sequence.charAt(index) == ' ') {
				System.out.println("No spaces please");
				return;
			}
		}

		words = sequence.split(",");
		if (words.length != 2) {
			System.out.println("Only two words please ");
			return;
		}
		
		int bigger = words[0].compareTo(words[1]);
		if (bigger > 0) {
			indexOfBiggerWords = 0;
		} else {
			if (bigger < 0) {
				indexOfBiggerWords = 1;
			} else {
				indexOfBiggerWords = 0;
			}
		}
		
		for (int index = 0; index < words[indexOfBiggerWords].length(); index++) {
			char indexCharFirstWord = words[0].charAt(index);
			char indexCharSecondWord = words[1].charAt(index);
			if (indexCharFirstWord != indexCharSecondWord) {
				System.out.println((index+1) + " " + indexCharFirstWord + " - " + indexCharSecondWord);
			}
		}
	}
}
