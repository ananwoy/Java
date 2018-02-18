import java.util.Scanner;
class Strong
{
static int facto(int x)
{
	int fact=1;
	for(int i=1;i<=x;i++)
		{
		fact=fact*i;
		}
	return fact;
}
static boolean check(int y)
{
	int m; int sum=0; int t=y;
	while(t>0)
	{
		m=t%10;
		sum=sum+facto(m);
		t=t/10;
	}
	return sum==y;
}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		boolean m=check(n);
		if(m)
		System.out.println(n+" is a strong number");
		else
			System.out.println(n+ " is not a strong number");
		s.close();
	}
}