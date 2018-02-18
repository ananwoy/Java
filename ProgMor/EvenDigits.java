//write a java program to count how many even digits in your number
//write java program to calculate the sum of its digits
//Write a java program to reverse the number
import java.util.Scanner;
class  EvenDigits
{
	static int counter(int x)
	{
		int count=0;
	while (x/10!=0)
	{
		int n=x%10;
		if(n%2==0)
			count++;
		x=x/10;
	}
	return count;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int z=s.nextInt();
		int a=counter(z);
		System.out.println("No. of even digits in "+z+" is "+a);
	}
}
