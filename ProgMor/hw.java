//Write a java program to count how many odd nos and even nos present between 1 to 100.
//Write a java program to display multiple of 3 and 5s  between 1 to 100.
//Write a java program to define a method to calculate the sum of even nos between 1 to 100.
import java.util.Scanner;
class OddEven
{
	int noOdd(int n)
	{
		int i;
		int j=0;
		int x;
		int y;
		for(i=1;i<=n;i++)
		{
			if (i%2==0)
			{
				j++;
			}
		}
		return j;
		}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		OddEven o=new OddEven();
		System.out.println("Enter the range:");
		int x=s.nextInt();
		int z=o.noOdd(x);
		System.out.println("The No. of Even nos are = "+z+" and the no of odd numbers are = "+(x-z));
	}
}
