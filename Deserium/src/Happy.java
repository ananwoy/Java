import java.util.Scanner;

public class Happy {
	static boolean check(int x) {
		int m;
		{
			while (x > 9) {
				int sum = 0;
				while (x != 0) {
					m = x % 10;
					sum = sum + m * m;
					x = x / 10;
				}
				x = sum;
			}
			return (x == 1 || x == 7);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter ur number");
		int n = s.nextInt();
		boolean y = check(n);
		if (y) {
			System.out.println("happy number");
		} else
			System.out.println("unhappy number");
	}
}