//Write a java program to define a method to check ur no is perfect no or not
import java.util.Scanner;
class Perfect
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if (n%i==0)
			{
				sum=sum+i;
			}
	}
if(sum==n)
		{
	System.out.println("The number is perfect");
}
else
		{
	System.out.println("not perfect");
		}
	}
}