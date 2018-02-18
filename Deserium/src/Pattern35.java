import java.util.Scanner;

public class Pattern35 {
	static void display(int n) {
		for (int i = 1; i <= n; i++) {
			{
				for (int j = 1; j <= n; j++) {
					if(i==1||i==n||j==1||j==n||i==(n+1)/2||j==(n+1)/2)
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
