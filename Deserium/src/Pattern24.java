import java.util.Scanner;
public class Pattern24 {
static void display(int n)
{
	for(int i=1;i<=n;i++)
	{
		char ch='a';
		for(int j=1;j<=i;j++)	
			{
			System.out.print(ch++);
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
