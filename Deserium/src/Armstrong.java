import java.util.Scanner;
class Armstrong
{
static int checkDigits(int x)
{
int i;
	for(i=0;x>0;i++)
		{
		x=x/10;
		}
	return i;
}
static int power(int n, int m)
{
	int pw=1;
	for(int i=1;i<=m;i++)
	{
		pw=pw*n;
	}
	return pw;
}
static boolean check(int y)
{
	int m; int sum=0;
	int t=y;
	int z=checkDigits(t);
	while(t!=0)
	{
	m=t%10;
	sum = sum+power(m,z);
	t=t/10;
	}
	return sum==y;
	
}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		boolean m=check(n);
		if(m)
		System.out.println(n+" is armstrong");
		else
			System.out.println(n+ " is not armstrong");
		s.close();
	}
}