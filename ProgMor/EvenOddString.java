import java.util.Scanner;
class EvenOddString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String st[]={"even","odd"};
		int n=sc.nextInt();
		System.out.println("number is "+st[n%2]);
}
}