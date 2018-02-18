//write java program to calculate the sum of its digits
import java.util.Scanner;
class  SumDigits
{
	static int Sum(int x)
	{
		int sum=0;
		while(x>0)
		{
			int y=x%10;
			sum=sum+y;
			x=x/10;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=Sum(n);
		System.out.println("The sum of digits of the number "+n+" is "+m); 
	}
}
