package topiconech2;
import java.util.Scanner;

public class Checksubstring {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two strings
		System.out.print("Enter string s1: ");
		String string1 = input.nextLine();
		System.out.print("Enter string s2: ");
		String string2 = input.nextLine();

		// Display theater the second string
		// is a substring of the first string
		System.out.println(
			string2 + ((string1.contains(string2)) ? " is " : " is not ") + 
			"a substring of " + string1);
	}
}
