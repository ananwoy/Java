import java.util.Scanner;
public class Pattern21 {
static void display(int n)
{
	int t=n;
	for(int i=1;i<=n;i++)
	{
		char ch='A';
		for(int j=1;j<=i-1;j++)
			{
			System.out.print(" ");
			}
		for(int j=1;j<=2*t-1;j++)	
			{
			System.out.print(ch++);
		}
		System.out.println();
		t--;
	}
	
	}

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	display(x);
}
}
