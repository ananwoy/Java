import java.util.Scanner;
public class Pattern13 {
static void display(int n)
{
	char ch;
	for(int i=1;i<=n;i++)
	{
		ch='A';
		for(int j=1;j<=i;j++)
		{
			System.out.print(ch+++" ");
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
