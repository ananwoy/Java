import java.util.Scanner;
public class Pattern25 {
static void display(int n)
{
	char ch='a';
	for(int i=1;i<=n;i++)
	{
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
