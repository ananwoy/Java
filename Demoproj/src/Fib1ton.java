import java.util.Scanner;
public class Fib1ton {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=s.nextInt();
		getFibTerms(n);
		s.close();
	}
static void getFibTerms(int n) {
int f1=0,f2=1,f3;
while(f1<=n)
{
	System.out.println(f1);
	f3=f1+f2;
	f1=f2;
	f2=f3;
	--n;
}
}
}
