//write a java program to define a method to calculate the power of n^3
import java.util.Scanner;
class Power
{
	static int power(int x, int y)
	{
		for (int i=1;i<=y ;i++ )
		{
		int pow=1;
		pow=x*pow;
		}
return pow;

}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int z=s.nextInt();
		int a=s.nextInt();
		int b=power(z,a);
		System.out.println("Value is "+b);
	}

}