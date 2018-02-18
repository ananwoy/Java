import java.util.Scanner;
class SumOddEven
{
	int noOdd(int n)
	{
		int i;
		int sum= 0;
		for(i=1;i<=n;i++)
		{
			if (i%2==0)
			{
				sum=sum+i;
			}
		}
		return i;
		}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		OddEven o=new OddEven();
		System.out.println("Enter the range:");
		int x=s.nextInt();
		int z=o.noOdd(x);
		System.out.println(z);
}
}