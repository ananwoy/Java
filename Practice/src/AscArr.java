import java.util.Scanner;
public class AscArr {
static void order(int a[])
{
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j])
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int a[]= {9,4,6,8,3,21,6,13,25,23};
	order(a);
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
}
}
