import java.util.Scanner;

public class Pattern34 {
	static void display(int n) {
		for (int i = 1; i <= n; i++) {
			{
				for (int j = 1; j <= n; j++) {
					if(i==n/2+1||j==n/2+1)
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
