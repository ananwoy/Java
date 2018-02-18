
public class IterateRecursion {
static void print(int n)
{
	System.out.println(n);
	if(n>1)
	print(n-1);
}
static void display(int n)
{
	if(n>1)
		display(n-1);
	System.out.println(n);
}
public static void main(String[] args) {
	int n=10;
	print(n);
	display(n);
}
}
