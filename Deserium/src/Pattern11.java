import java.util.Scanner;
public class Pattern11 {
static void display(int n)
{
	int k=0;
	char ch='A';
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(ch+++" ");
		k++;
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
