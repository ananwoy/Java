import java.util.Scanner;

public class Pattern44 {
	static void display(int n) {
		for (int i = 0; i < n; i++) {
			{
				for (int j = 0; j < n; j++) {
					if(i==0||i==n-1&&j<n/2&&j!=0||j==n/2&&i!=n-1||j==0&&i>n/2&&i!=n-1)
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
