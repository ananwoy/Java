
public class FibonacciRecursion {
static int fib(int n)
{
	if(n==1)
		return 0;
	if(n==2)
		return 1;
return fib(n-1)+fib(n-2);	
}
public static void main(String[] args) {
	int n=6;
	int x=fib(n);
	System.out.println(x);
}
}
