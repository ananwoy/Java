import java.util.Scanner;
public class Pattern23 {
static void display(int n)
{
	for(int i=1;i<=n;i++)
	{
		int k=1;
		for(int j=1;j<=2*i-1;j++)	
			{
			if(j%2==0)
				System.out.print("*");
			else
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
