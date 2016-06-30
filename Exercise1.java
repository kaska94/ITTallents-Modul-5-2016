import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first word (40 chars)");
		String firstWord = sc.next();
		if (firstWord.length() >= 40) {
			System.out.println("Must be bellow 40");
			return;
		}

		System.out.println("Enter second word (40 chars)");
		String secondWord = sc.next();
		if (secondWord.length() >= 40) {
			System.out.println("Must be bellow 40");
			return;
		}
		firstWord = firstWord.toLowerCase();
		secondWord = secondWord.toLowerCase();
		System.out.println(firstWord + " " +secondWord);
		
		firstWord = firstWord.toUpperCase();
		secondWord = secondWord.toUpperCase();
		System.out.println(firstWord + " " +secondWord);
	}
}
