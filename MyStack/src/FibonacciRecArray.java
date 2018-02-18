
public class FibonacciRecArray {
static int ar[];	
static int fib(int n)
{
	if(ar==null)
	{
		ar=new int[n+1];
	}
	if(n==1)
		return 0;
	if(n==2)
		return 1;
	if(ar[n-1]==0)
		ar[n-1]=fib(n-1);
	if(ar[n-2]==0)
		ar[n-2]=fib(n-2);
	return ar[n-1]+ar[n-2];
}
public static void main(String[] args) {
	int n=9;
	int x=fib(n);
	System.out.println(x);
}
}