import java.util.Scanner;

public class ArrayAverage {
	int[] readArr() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of values");
		int n = scn.nextInt();
		int ar[] = new int[n];
		System.out.println("enter " + n + "Integer values");
		for (int i = 0; i < n; i++) {
			ar[i] = scn.nextInt();
		}
		return ar;
	}

	void dispArr(int[] ar) {
		System.out.println("array elements:");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

	double getAvg(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum / a.length;
	}

	public static void main(String[] args) {
		ArrayAverage ao = new ArrayAverage();
		int a[] = ao.readArr();
		ao.dispArr(a);
		double y = ao.getAvg(a);
		System.out.println(y);
	}
}
