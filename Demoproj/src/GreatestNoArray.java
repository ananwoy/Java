import java.util.Scanner;
public class GreatestNoArray {
static int maxValue(int a[])
{
	int max=a[0];
	for (int i = 0; i < a.length; i++) {
		if(max<a[i])
			max=a[i];
	} return max;
}
static int[] getArray(int n)
{
	Scanner s=new Scanner(System.in);
	int ar[];
	ar= new int [n];
	System.out.println("enter elements of an array");
	for (int i = 0; i < n; i++) {
		ar[i]=s.nextInt();
	}	return ar;	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	GreatestNoArray ga=new GreatestNoArray();
	int n=sc.nextInt();
	int ao[]=getArray(n);
	int m=maxValue(ao);
	System.out.println("greatest no is "+m);
}
}

