import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		Scanner s=new Scanner(System.in);
		int n=nextInt();
		i=n/2*2;
		if(i==n)
		System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
