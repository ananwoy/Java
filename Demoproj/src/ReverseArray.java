import java.util.Scanner;

public class ReverseArray {
	static void revArr(int ar[]) {
		for (int i = 0; i < ar.length / 2; i++) {
			int t = ar[i];
			ar[i] = ar[ar.length - 1 - i];
			ar[ar.length - 1 - i] = t;
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 5, 7, 8, 3 };
		dispArr(a);
		System.out.print("reversed ");
		revArr(a);
		dispArr(a);
	}

	static void dispArr(int[] ar) {
		System.out.println("array elements:");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
