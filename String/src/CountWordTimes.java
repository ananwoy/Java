
//program to check how many times a word is present in a string or not
import java.util.Scanner;

public class CountWordTimes {
	static int checkStr(String st1, String st2) {
		char c1[] = st1.toCharArray();
		char c2[] = st2.toCharArray();
		int count = 0;
		for (int i = 0; i < c1.length; i++) {
			int j = 0;
			int k = i;
			while (k < c1.length && j < c2.length && c1[k] == c2[j]) {
				k++;
				j++;
			}
			if (j == c2.length) {
				if ((i == 0 || c1[i - 1] == ' ') && (k == c1.length || c1[k] == ' '))
					count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string ");
		String s1 = s.nextLine();
		System.out.println("Enter string to be matched ");
		String s2 = s.nextLine();
		int x=checkStr(s1, s2);
		System.out.println("Word is Present "+x+" times");
	}
}
