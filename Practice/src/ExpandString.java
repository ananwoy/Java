import java.util.Scanner;

public class ExpandString {
	static void expand(String st) {
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != '.')
				System.out.print(ch[i]);
			else if ((i + 3) < ch.length && ch[i] == '.' && ch[i + 1] == '.' && ch[i + 2] > 47 && ch[i + 2] < 58
					&& ch[i + 3] > 47 && ch[i + 3] < 58 && ch[i - 2] > 47 && ch[i - 2] < 58) {
				int m = (ch[i - 2] - 48) * 10 + (ch[i - 1] - 48);
				int o = (ch[i + 2] - 48) * 10 + (ch[i + 3] - 48);
				System.out.print(",");
				for (int j = m + 1; j < o; j++) {
					System.out.print(j + ",");
				}
			} else if (i > 1 && i + 3 < ch.length && ch[i] == '.' && (ch[i - 2] == '.' || ch[i - 2] == ',')
					&& ch[i + 2] > 47 && ch[i + 2] < 58 && ch[i + 3] > 47 && ch[i + 3] < 58) {
				int m = ch[i - 1] - 48;
				int n = (ch[i + 2] - 48) * 10 + (ch[i + 3] - 48);
				System.out.print(",");
				for (int j = m + 1; j < n; j++) {
					System.out.print(j + ",");
				}
			} else if ((i + 2) < ch.length && ch[i] == '.' && ch[i + 1] == '.') {
				int n = ch[i + 2] - 48;
				int k = ch[i - 1] - 48;
				System.out.print(",");
				for (int j = k + 1; j < n; j++) {
					System.out.print(j + ",");
				}
			}

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Expanded String is:");
		expand(s);
	}
}
