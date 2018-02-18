//define a method to return true if the number is prime number other return false
import java.util.Scanner;
class  Prime
{
	static boolean isPrime(int n)
	{
		for (int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
				return true;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		boolean z=isPrime(x);
		if(z)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
