import java.util.Scanner;
public class SearchArray {
static int search(int ar[], int n)
{
	int i;
	for (i = 0; i < ar.length; i++) {
		if(ar[i]==n)
	break;
	}
	return i;
}
static int[] getArr(int n)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter array elements ");
	int ar[];
	ar=new int[n];
	for (int i = 0; i < n; i++) {
		ar[i]=s.nextInt();
	}
	return ar;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int x=s.nextInt();
	int a[]=getArr(x);
	System.out.println("enter value you want to search");
	int y=s.nextInt();
	int z=search(a, y);
	System.out.println("index of element in array is "+z);
}
}
