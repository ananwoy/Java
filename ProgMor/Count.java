//Write a java program to define a method to return how many digits are there in the passed integer number
import java.util.Scanner;
class Count
{
	static int numofdigits(int n)
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

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=s.nextInt();
		int c=numofdigits(no);
		System.out.println("The number "+no+" contains "+c+" digits");
	}
}
