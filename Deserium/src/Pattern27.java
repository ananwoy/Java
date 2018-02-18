import java.util.Scanner;
public class Pattern27 {
static void display(int n)
{
	int k=1;
	for(int i=1;i<=n;i++)
	{
		int t=0;
		for(int j=1;j<=i;j++)	
			{
			System.out.print(i+t);
			t=t+n-j;
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
