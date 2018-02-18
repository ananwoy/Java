import java.util.Scanner;
public class Pattern9 {
static void display(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i-1;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=2*n-(2*i-1);j++)
		{
		System.out.print("*");
	}
		System.out.println();
}
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	display(x);
}
}
