import java.util.Scanner;
public class IntersectMatrix {
static int[] intersect(int a[], int b[])
{
	int n=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if(a[i]==b[j])
			{
				n++;
				break;
			}
		}
	}
	int c[]=new int[n];
	int k=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if(a[i]==b[j])
			{
				c[k]=a[i];
				k++;
				break;
			}
		}
	}
	
return c;	
}
static int[] inputArr(int n)
{
	Scanner scn=new Scanner(System.in);
	int ar[]=new int[n];
	for (int i = 0; i < n; i++) {
		ar[i]=scn.nextInt();
	}
	return ar;
}

public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter size of first array");
	int n=scn.nextInt();
	System.out.println("Enter array elements");
	int a[]=inputArr(n);
	System.out.println("Enter size of second array");
	int m=scn.nextInt();
	System.out.println("Enter array elements");
	int b[]=inputArr(m);
	int c[] = intersect(a, b);
	System.out.println("Intersection of both arrays are:");
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i] + ",");
	}
}
}
