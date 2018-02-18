import java.util.Scanner;

public class Cricket {
	static void compare(int a[][]) {
		int c = 0;
		System.out.println("Teams with same performance are: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int count = 0;
				for (int k = 0; k < a[i].length; k++) {
					if (a[i][k] == a[j][k]) {
						count++;
					}
					if (count == 4) {
						c++;
						System.out.println((i + 1) + "-" + (j + 1));
					}
				}
			}
		}
		if (c == 0) {
			System.out.println("None");
		}
	}

	static int[][] readArray(int n) {
		Scanner s = new Scanner(System.in);
		int ar[][] = new int[n][4];
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Enter wins loses draws and neutrals of Team " + (i + 1));
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = s.nextInt();
			}
		}
		s.close();
		return ar;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of teams: ");
		int n = s.nextInt();
		if (n > 0) {
			int b[][] = readArray(n);
			compare(b);
		} else
			System.out.println("Not Valid");
		s.close();
	}
}
