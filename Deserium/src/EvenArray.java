import java.util.Scanner;
public class EvenArray {
int countEven(int a[])
{
	int count=0;
	for (int i = 0; i < a.length; i++) {
	if(a[i]%2==0)
		count++;
	}
	return count;
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
	int c=ea.countEven(a);
	System.out.println("even numbers are "+c);
	System.out.println("odd numbers are "+(n-c));
}
}

