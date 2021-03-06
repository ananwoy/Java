import java.util.Scanner;

public class SplitSentenceToWords {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = scn.nextLine();
		String words[] = splitIntoWords(s1);
		for (int i = 0; i < words.length; i++) {
			System.out.println((i + 1) + " word is --> " + words[i]);
		}
	}

	private static String[] splitIntoWords(String s) {
		int wc = countWords(s);
		String w[] = new String[wc];
		char c[] = s.toCharArray();
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			w[index] = "";
			while (i < c.length && c[i] != ' ') {
				w[index] += c[i];
				i++;
			}
			if (w[index].length() > 0)
				index++;
		}
		return w;
	}

	private static int countWords(String s) {
		int count = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')
				count++;
		}
		return count;
	}
}
