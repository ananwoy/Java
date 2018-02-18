import java.util.Scanner;
class BoyScore 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your marks in 4 subjects");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		if (a>35 && b>35 && c>35 && d>35)
		{
			double per=(a+b+c+d)/4.0;
			if (per>=80)
			{
				System.out.println("Result it = Distinction at "+per);	
			}
			else if (per>=60)
				{
					System.out.println("Result it = 1st div at"+per);
				}
				else if (per>=50)
				{
					System.out.println("Result is = 2nd div"+per);
				}
				else if (per>=35)
				{
					System.out.println("Result is = just pass"+per);
				}
			}
			else
			{
				System.out.println("Fail");
			}
		}
	}
