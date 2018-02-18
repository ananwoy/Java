import java.util.Scanner;

public class Pattern41 {
	static void display(int n) {
		for (int i = 0; i < n; i++) {
			{
				for (int j = 0; j <= n/2; j++) {
					if((j==0||j==n/2)&&i!=0||(i==0||i==n/2)&&j!=0||i==n/2)
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
