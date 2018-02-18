import java.util.Scanner;
class SanjuGeeta 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%3==0 && n%5==0)
		{
			System.out.println("sanju weds geeta");
		}	else if(n%3==0)
			{
			System.out.println("sanju");
			}
			else if(n%5==0)
				{
				System.out.println("geeta");
				}
				}
}
