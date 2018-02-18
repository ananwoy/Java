//Write a java program to define a method to calculate the factorial of n.
import java.util.Scanner;
class Facto
{
	int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int p=s.nextInt();
		Facto f=new Facto();
		int z=f.factorial(p);
		System.out.println("The factorial of "+p+" is = "+z);
	}
}
