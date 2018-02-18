import java.util.Scanner;

public class SwapFirstLast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String s = "";
			while (i < ch.length && ch[i] != ' ') {
				s = s + ch[i];
				i++;
			}
			if (s.length() > 0) {
				char ci[] = s.toCharArray();
				char t = ci[0];
				ci[0] = ci[ci.length - 1];
				ci[ci.length - 1] = t;
				String sp = new String(ci);
				System.out.print(sp + " ");
			}
		}
	}
}
