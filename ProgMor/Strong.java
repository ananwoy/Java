//write a java program to define a method to check whether a number is armstrong or not
import java.util.Scanner;
class  Armstrong
{
	static int checkDigits(int n)
	{
		int count=0;
	do
	{
	count++;
	n=n/10;
	}
	while (n!=0);
	return count;
	}
	static int pow(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	static boolean digi(int x)
	{
		int t=x;
		int sum=0;
		int p=checkDigits(x);
		while(x>0)
		{

			int r=x%10;
			sum=sum + pow(r,p);
		}
		return sum==x;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		boolean y=digi(x);
		if(y)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
	}
}
