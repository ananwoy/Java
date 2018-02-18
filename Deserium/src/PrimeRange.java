import java.util.Scanner; 
public class PrimeRange {
	static void check(int x)
	{
		int i; int j=2;int count;
		for(i=2;i<=x;i++)
		{
			count=0;
			for(j=2;j<=i/2;j++)
			{
			if(i%j==0)
				count++;
			}
			if(count==0)
				System.out.println(i);		
		}
			}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter range:");
	int a=s.nextInt();
	check(a);
}
}
