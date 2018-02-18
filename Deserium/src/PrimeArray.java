import java.util.Scanner;
public class PrimeArray {
static int countPrime(int a[])
{
	int count;int c=0;
	for (int i = 0; i < a.length; i++) {
		count=0;
	for (int j = 2; j <= a[i]/2; j++) {
	if(a[i]%j==0)
		count++;
	}if(count==0)
		c++;
	}
	return c;
}
int[] getArray(int n)
{
	Scanner s=new Scanner(System.in);
	int a[];
	System.out.println("enter array elements");
	a=new int[n];
	for (int j = 0; j < n; j++) {
	a[j]=s.nextInt();	
	}
	return a;
	}
public static void main(String[] args) {
	EvenArray ea=new EvenArray();
	System.out.println("enter number of elements");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=ea.getArray(n);
	int c=countPrime(a);
	System.out.println("no of prime nos are "+(c));
}
}

