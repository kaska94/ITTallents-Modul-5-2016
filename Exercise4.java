import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names;
		String[] firstPersonsName;
		String[] secondPersonsName;
		int counterOfNonSpaces = 0;
		int sumOfAsciiOfTheFirst = 0;
		int sumOfAsciiOfTheSecond = 0;

		System.out.println("Enter two names. Format:\n" + "[first name] [second name] [third name],"
				+ "[first name] [second name] [third name]");
		String sequence = sc.nextLine();
		if (sequence.length() > 256) {
			System.out.println("It's too big...");
			return;
		}

		names = sequence.split(",");
		if (names.length != 2) {
			System.out.println("Two words separated by \',\' !");
			return;
		}

		firstPersonsName = names[0].split(" "); // first name
		secondPersonsName = names[1].split(" "); // second name

		for (int index = 0; index < firstPersonsName.length; index++) {
			if ((!(firstPersonsName[index] == null)) && (!(firstPersonsName[index].isEmpty()))) {
				counterOfNonSpaces++;
			}
		}

		if (counterOfNonSpaces != 3) {
			System.out.println("Error! Wrong format! Format:\n" + "[first name] [second name] [third name],"
					+ "[first name] [second name] [third name](no spacese between the words)");
			return;
		}

		counterOfNonSpaces = 0;
		for (int index = 0; index < secondPersonsName.length; index++) {
			if ((!(secondPersonsName[index] == null)) && (!(secondPersonsName[index].isEmpty()))) {
				counterOfNonSpaces++;
			}
		}

		if (counterOfNonSpaces != 3) {
			System.out.println("Error! Wrong format! Format:\n" + "[first name] [second name] [third name],"
					+ "[first name] [second name] [third name](no spacese between the words)");
			return;
		}

		// the magic is here
		for (int index = 0; index < firstPersonsName.length; index++) {
			for (int indexOfChar = 0; indexOfChar < firstPersonsName[index].length(); indexOfChar++) {
				if (firstPersonsName[index] != null) {
					System.out.print((int) firstPersonsName[index].charAt(indexOfChar) + " ");
					sumOfAsciiOfTheFirst += firstPersonsName[index].charAt(indexOfChar);
				}
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(secondPersonsName));
		for (int index = 0; index < secondPersonsName.length; index++) {
			for (int indexOfChar = 0; indexOfChar < secondPersonsName[index].length(); indexOfChar++) {
				if (secondPersonsName[index] != null) {
					System.out.print((int) secondPersonsName[index].charAt(indexOfChar) + " ");
					sumOfAsciiOfTheSecond += secondPersonsName[index].charAt(indexOfChar);
				}
			}
			System.out.println();
		}

		if (sumOfAsciiOfTheFirst > sumOfAsciiOfTheSecond) {
			System.out.println(names[0]);
		} else {
			if (sumOfAsciiOfTheFirst < sumOfAsciiOfTheSecond) {
				System.out.println(names[1]);
			} else {
				System.out.println("Even " + names[0] + " " + names[1]);
			}
		}
	}
}
