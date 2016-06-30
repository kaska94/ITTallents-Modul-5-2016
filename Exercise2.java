import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first word (40 chars)");
		String sequence = sc.nextLine();
		if ((sequence.length() <= 10) || (sequence.length() >= 20)) {
			System.out.println("Must be between 10 and 20");
			return;
		}

		String[] words;
		words = sequence.split(" ");
		if (words.length != 2) {
			System.out.println("Only two words please separated by space");
			return;
		}
		int bigger = words[0].compareTo(words[1]);
		if (bigger > 0) {
			System.out.println("First is bigger " + words[0].length());
		} else {
			if (bigger < 0) {
				System.out.println("Second is bigger " + words[1].length());
			} else {
				System.out.println("Even! ");
			}
		}
		if ((words[1].length() >= 5) && (words[0].length() >= 5)) {
			words[1] = words[1].substring(5);
			words[0] = words[0].substring(0, 5);
			words[0] = words[0] + words[1];
		} else {
			System.out.println("Words must be above 5 chars");
		}
		System.out.println(words[0]);

	}

}
