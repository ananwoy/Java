
public class GreatestnArray {
	static int grtElement(int ar[], int n) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			count = 0;
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					count++;
				}
			}
			if (count == n - 1)
				return ar[i];
		}
		System.out.println("not found");
		return -1;

	}

	public static void main(String[] args) {
		int ar[] = { 2, 3, 5, 4, 6, 7, 8, 9 };
		int b = grtElement(ar, 9);
		System.out.println(b);
	}

}
