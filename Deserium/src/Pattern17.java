import java.util.Scanner;
public class Pattern17 {
static void display(int n)
{
	int k=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
			{
			System.out.print(" ");
			}
		for(int j=1;j<=i;j++)	
			{
			if(k>9)
				k=k%9;
			System.out.print(k++);
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
