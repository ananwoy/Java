import java.util.Scanner;

public class UpperCtoLowerC {
	static String toLowerUpper(String st) {
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90)
				ch[i] = (char) (ch[i] + 32);
			else if (ch[i] >= 97 && ch[i] <= 122)
				ch[i] = (char) (ch[i] - 32);
		}
		String s=new String(ch);
		return s;
	}
	public static void main(String[] args) {
		System.out.println("Enter word");
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String st=toLowerUpper(a);
		System.out.println(st);
	}
}