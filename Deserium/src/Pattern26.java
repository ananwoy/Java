import java.util.Scanner;
public class Pattern26 {
static void display(int n)
{
	for(int i=1;i<=n;i++)
	{
		char ch='a';
		for(int j=1;j<=n-i;j++)	
			{
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++)
		System.out.print(ch++);
		System.out.println();
	}
	
	}

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	display(x);
}
}
