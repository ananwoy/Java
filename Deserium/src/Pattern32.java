import java.util.Scanner;

public class Pattern32 {
	static void display(int n) {
		int sp = n / 2, st = 1;
		for (int i = 1; i <= n; i++) {
			char k = 'A';
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print(k);
				if (j <= st / 2)
					k++;
				else
					k--;
			}
			System.out.println();
			if (i <= n / 2) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}

		}
	}

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		display(x);
	}
}
