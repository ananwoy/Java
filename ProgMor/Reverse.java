import java.util.Scanner;
class Reverse 
{
	static int rev(int n)
	{
		int revr=0;
		do
		{
			int r=n%10;
			revr=revr*10+r;
			n=n/10;
		}
		while (n!=0);
		return revr;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enetre number to be reversed");
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		int r=rev(y);
		System.out.println("The rversed number is = "+r);

	}
}
