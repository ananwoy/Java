
public class MergeArray {
	static int[] merge(int a[], int b[]) {
		int rs[] = new int[a.length + b.length];
		int i = 0, k = 0, j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				rs[k] = a[i];
				i++;
				k++;
			} else {
				rs[k] = b[j];
				j++;
				k++;
			}
		}
		while (i < a.length) {
			rs[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			rs[k] = b[j];
			k++;
			j++;
		}
		return rs;
	}

	public static void main(String[] args) {
		int a[] = { 12, 18, 19, 22, 23 };
		int b[] = { 8, 11, 15, 19, 21, 28, 36, 10 };
		int c[] = merge(a, b);
		System.out.println("Merged array:");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
