import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=s.nextInt();
		int m=getFibTerms(n);
		System.out.println(m);
		s.close();
	}
static int getFibTerms(int n) {
int f1=0,f2=1,f3;
while(n>1)
{
	f3=f1+f2;
	f1=f2;
	f2=f3;
	--n;
}
return f1;
}
}
