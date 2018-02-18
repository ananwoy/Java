import java.util.Scanner;
public class NFibonacci {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=s.nextInt();
		fibTerms(n);
		s.close();
	}
static void fibTerms(int n) {
int f1=0,f2=1,f3;
System.out.println("List of fibonacci numbers are");
while(n>0)
{
	System.out.println(f1);
	f3=f1+f2;
	f1=f2;
	f2=f3;
	--n;
}
}
}
