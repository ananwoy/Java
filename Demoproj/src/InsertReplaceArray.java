//program to insert element in an array in a specified index
import java.util.Scanner;
public class InsertReplaceArray {
static int[] insertArr(int a[],int n,int ele)
{
	if(n<0||n>a.length)
	{
	System.out.println("not possible to insert");
	return a;
}
	int na[]=new int[a.length];
	for (int i = 0; i < a.length; i++) {
		
			na[i]=a[i];
		
		na[n]=ele;
	}
	return na;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int ar[]= {13,23,47,64,83,37,98,42};
	System.out.println("enter index which you want to replace ");
	int n=s.nextInt();
	System.out.println("enter the value");
	int x=s.nextInt();
	int b[]=insertArr(ar, n,x);
	System.out.println("New array : ");
	for (int i = 0; i < b.length; i++) {
	System.out.print(b[i]+" ");	
	}	
}
}
