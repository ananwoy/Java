import java.util.Scanner;
class MultTable 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<11;i++)
		{
		System.out.println(n+" * "+i+" = "+n*i);
		}
		}
}
