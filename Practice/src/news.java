import java.util.Scanner;

public class news {
	static void reverse(String st) {
		String sp=" ";
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String s = "";
			while (i < ch.length&&ch[i] != ' ') {
				s = s + ch[i];
				i++;
			}
			if (s.length() > 0)
				sp=s+" "+sp;
		}
		System.out.println(sp);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		reverse(st);
	}
}