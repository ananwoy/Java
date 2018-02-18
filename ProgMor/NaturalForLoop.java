import java.util.Scanner;
class NaturalForLoop 
{
	int sum(int n)
	{
		int summ=0;
		for(int i=1;i<=n;i++)
			summ=summ+i;
		return summ;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of n:");
		int p=s.nextInt();
		NaturalForLoop m=new NaturalForLoop();
		int z=m.sum(p);
		System.out.println("Summation of numbers till "+p+" is "+z);
	}
}
