import java.util.Scanner;
public class Pattern12 {
static void display(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i%2==0)
			System.out.print("0");
			else
				System.out.print("1");
		}System.out.println();
	}
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	display(x);
}
}
