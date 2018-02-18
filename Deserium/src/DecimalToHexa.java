import java.util.Scanner;

public class DecimalToHexa {
	static String convert(int n) {
		String bin = "";
		int b;
		while (n != 0) {
			b = n % 16;
			if (b < 10)
				bin = b + bin;
			else
				bin = (char) (55 + b) + bin;
			n = n / 16;
		}
		return bin;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter decimal number:");
		int x = s.nextInt();
		String a = convert(x);
		System.out.println("Hexadecimal equivalent of " + x + " is " + a);
	}
}
