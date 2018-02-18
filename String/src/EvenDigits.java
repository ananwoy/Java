import java.util.Scanner;

public class EvenDigits {
	static int count(String st) {
		int dc = 0;
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch >= 48 && ch <= 57) {
				if (ch % 2 == 0) {
					dc++;
				}
			}
		}
		return dc;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String st = sc.next();
		int x = count(st);
		System.out.println("Number of even digits in the " + st + " is = " + x);
	}
}