import java.util.Scanner;
class MethodSum 
{
	int sum(int n)
	{
		int summ=n*(n+1)/2;
		return summ;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of n:");
		int p=s.nextInt();
		MethodSum m=new MethodSum();
		int z=m.sum(p);
		System.out.println("Summation of numbers till "+p+" is "+z);
	}
}
