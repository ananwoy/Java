import java.util.Scanner;
public class SwapDigits {
static void swap(int a[])
{
	for (int i = 0; i < a.length; i=i+2) {
			int t=a[i];
			a[i]=a[i+1];
			a[i+1]=t;
	}
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
}
public static void main(String[] args) {
	int ar[]= {9,5,6,7,8,6,2,1};
	swap(ar);
}
}
