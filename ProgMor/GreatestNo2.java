import java.util.Scanner;
class  GreatestNo2

{
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter 3 nos:");
		int a=s.nextInt();
		int b =s.nextInt();
		int c=s.nextInt();
		int max=(a>b&&a>c)?a:(b>c)?b:c;
		System.out.println(max+" is the biggest");
	}
}
