import java.util.Scanner;
class  GreatestNo1

{
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter 2 nos:");
		int x=s.nextInt();
		int y =s.nextInt();
		int max=(x>y)?x:y;
		System.out.println(max+" is the biggest");
	}
}
