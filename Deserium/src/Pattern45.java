import java.util.Scanner;

public class Pattern45 {
	static void display(int n) {
		for (int i = 0; i < n; i++) {
			{
				for (int j = n/2; j < n; j++) {
					if(i==j||i+j==n-1||j==n/2)
				System.out.print("*");
					else
						System.out.print(" ");
			}
	}System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		display(x);
	}
}
