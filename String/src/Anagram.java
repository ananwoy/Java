import java.util.Scanner;

public class Anagram {
	static boolean count(String st, String sc) {
		String sp = remSpace(st);
		String so = remSpace(sc);
		if (sp.length() != so.length())
			return false;
			char c1[] = toLower(sp);
			char c2[] = toLower(so);
			sort(c1);
			sort(c2);
			for (int i = 0; i < c2.length; i++) {
				if (c1[i] != c2[i])
					return false;
			
		}
		return true;
	}

	static String remSpace(String st) {
		char ch[] = st.toCharArray();
		String s = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ')
				s = s + ch[i];
		}
		return s;
	}

	static char[] toLower(String st) {
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90)
				ch[i] = (char) (ch[i] + 32);
		}
		String s = new String(ch);
		return s.toCharArray();
	}

	static void sort(char[] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[i] > c[j]) {
					char t = c[i];
					c[i] = c[j];
					c[j] = t;
				}System.out.print(c[i]);
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		boolean x = count(a, b);
		if (x)
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");
	}
}