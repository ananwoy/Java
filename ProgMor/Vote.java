import java.util.Scanner;
class Vote
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your age: ");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		if(age>=18)
		{
		System.out.println("You are eligible to vote");
		System.out.println("Voting........");
		}else
			{
			System.out.println("You are not eligible to vote"); 
			}
			System.out.println("Thank You");
			System.out.println("Bye Bye");
			
	}
}
