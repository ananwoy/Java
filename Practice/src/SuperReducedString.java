import java.util.Scanner;

public class SuperReducedString {
	static void reduce(String st) {
		char ch[] = st.toCharArray();
		String s = "";
		for (int i = 1; i < ch.length; i++) {
			if (ch[i] == ch[i - 1] && ch[i] != ' ') {
				ch[i] = ' ';
				ch[i - 1] = ' ';
				i++;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ')
				s = s + ch[i];
		}
		if (s.length() != st.length()) {
			reduce(s);
		} else {
			if (s.length() > 0)
				System.out.println(s);
			else
				System.out.println("Empty String");
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String st = scn.next();
		reduce(st);
	}
}
