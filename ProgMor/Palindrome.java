//write a java program to define a method to check whether a number is palindrome or not
import java.util.Scanner;
class  Palindrome
{
	static int check(int n)
	{
		int rev=0;
		int m=n;
	do
	{
		int r=m%10;
		rev=rev*10+r;
		m=m/10;
	}while(m!=0);
	if(rev==n)
	return true;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		boolean y=check(x);
		if(y)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}
