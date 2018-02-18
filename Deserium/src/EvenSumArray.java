import java.util.Scanner;
public class EvenSumArray {
static int countEvenSum(int a[])
{
	int sum=0;
	for (int i = 0; i < a.length; i++) {
	if(a[i]%2==0)
		sum=sum+a[i];
	}
	return sum;
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
	int c=countEvenSum(a);
	System.out.println("sum of even numbers are "+c);
}
}

