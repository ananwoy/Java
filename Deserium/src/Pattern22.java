import java.util.Scanner;
public class Pattern22 {
static void display(int n)
{
	int k=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
			{
			System.out.print(" ");
			}
		for(int j=1;j<=2*i-1;j++)	
			{
			if(j%2==0)
			System.out.print("0");
			else
				System.out.print("1");
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
