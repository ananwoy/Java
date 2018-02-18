import java.util.Scanner;
public class Pattern10 {
static void display(int n)
{
	int k=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(k++);
			if(k==10)
				k=1;
			//or use
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
