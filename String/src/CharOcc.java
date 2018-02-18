import java.util.Scanner;

public class CharOcc {
	static void count(String st) {
		char ch[] = st.toCharArray();
		int n = st.length();
		for (int i = 0; i < n; i++) {
			int c = 1;
			for (int j = i + 1; j < n; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = ch[n - 1];
					c++;
					n--;
					j--;
				}
			}
			System.out.println(ch[i] + " ---> " + c);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String st = sc.next();
		count(st);
	}
}
