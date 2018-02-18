import java.util.Scanner;
public class Prime
{
static boolean check(int x)
{
	int i;
	for(i=2;i<=x/2;i++)
		return x%i==0;
	return false;
}
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int x=s.nextInt();
boolean n=check(x);
if(n)
	System.out.println(x+" is not a prime number");
else
	System.out.println(x+" is a prime number");
}
}
