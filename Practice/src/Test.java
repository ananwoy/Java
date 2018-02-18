import java.util.Scanner;
public class Test {
static void pattern(int n)
{
	for (int i = 0; i < 5; i++) {
		int p=2*i+1;
		int t=2*i-1;
		if(i%2!=0)
		{
			for (int j = 1; j <= i; j++) {
				
			if(j%2==0)
				System.out.print("*");
			else
				{
				System.out.print(p);
				p++;
			}
			}
			System.out.println();
			}
		else
		{
			for(int j=2*i-1;j>=1;j--)
			{
				
				if(j%2==0)
					System.out.print("*");
				else
				{
					System.out.print(t);
					t--;
			}
			}
			System.out.println();
		}
		
	}
}
public static void main(String[] args) {
	pattern(5);
}
}
