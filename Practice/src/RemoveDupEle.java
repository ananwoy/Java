import java.util.Scanner;

public class RemoveDupEle {
	static String remove(String st) {
		String s = "";
		char ch[] = st.toCharArray();
		int n = ch.length;
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]&&ch[i]!=' ') {
					count++;
					ch[j] = ' ';
				}
			}
			if (count > 0) {
				ch[i]=' ';
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ')
				s=s+ch[i];
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scn.next();
		String st = remove(s);
		System.out.println(st);
	}
}
