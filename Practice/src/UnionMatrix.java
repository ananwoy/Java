import java.util.Scanner;
public class UnionMatrix {
	static int[] union(int a[], int b[]) {
		int n = b.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i] == b[j]) {
					b[j] = b[n - 1];
					n--;
					break;
				}
			}
		}

		int c[] = new int[a.length + n];
		int i = 0;
		while (i < a.length) {
			c[i] = a[i];
			i++;
		}
		int j = 0;
		while (j < n) {
			c[i] = b[j];
			i++;
			j++;
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
		int c[] = union(a, b);
		System.out.println("Union of both arrays are:");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + ",");
		}
	}
}
