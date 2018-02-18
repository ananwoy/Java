import java.util.Scanner;
public class SumFibonacci {
static int countSum(int n)
{
	int f1=0,f2=1,f3, i=1, sum=0;
	while(i<n)
	{
		f3=f1+f2;
		f1=f2;
		f2=f3;
		i++;
		sum=sum+f1;
	}
	return sum;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of terms" );
	int x=s.nextInt();
	int y=countSum(x);
	System.out.println("Sum of "+x+" fibonacci numbers is = "+y);
}
}
