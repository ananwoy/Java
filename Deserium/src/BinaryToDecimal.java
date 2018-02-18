import java.util.Scanner;

public class BinaryToDecimal {
	static int power(int m, int n) {
		int pw = 1, i;
		for (i = 1; i <= n; i++) {
			pw = m * pw;
		}
		return pw;
	}

	static int convert(int x) {
		int z = 0, b, sum = 0;
		while (x > 0) {
			b = x % 10;
			sum = sum + b * power(2, z);
			z++;
			x = x / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter binary number");
		int x = s.nextInt();
		int y = convert(x);
		System.out.println("Decimal equivalent of " + x + " = " + y);
	}
}
