import java.util.Scanner;
public class Pattern16 {
static void display(int n)
{
	int k=0;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			k++;
			System.out.print(k%2);
		}System.out.println();
	}
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	display(x);
}
}
