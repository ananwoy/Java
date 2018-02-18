import java.util.Scanner;
public class CountFibonacci {
static int count(int n)
{
	int count=0,f1=0,f2=1,f3;
	while(f1<=n)
	{
		f3=f1+f2;
		f1=f2;
		f2=f3;
		count++;
	}
	return count;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y=count(x);
	System.out.println(y);
}
}
