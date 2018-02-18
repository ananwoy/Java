import java.util.Scanner;
class ThreeFive
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