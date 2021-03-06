
//program to check specified string is present in a string or not
import java.util.Scanner;

public class CheckStringInStrng {
	static boolean checkStr(String st1, String st2) {
		char c1[] = st1.toCharArray();
		char c2[] = st2.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			int j = 0;
			int k = i;
			while (k < c1.length && j < c2.length && c1[k] == c2[j]) {
				k++;
				j++;
			}
			if (j == c2.length)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string ");
		String s1 = s.nextLine();
		System.out.println("Enter string to be matched ");
		String s2 = s.nextLine();
		boolean x = checkStr(s1, s2);
		if (x)
			System.out.println("String is Present");
		else
			System.out.println("String is Not present");
	}
}
