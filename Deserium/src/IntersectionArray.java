public class IntersectionArray {
	static int[] intersect(int a[], int b[]) {
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					a[k] = a[i];
					k++;
				}
			}
		}
		int rs[] = new int[k];
		for (int i = 0; i < k; i++) {
			rs[i] = a[i];
		}
		return rs;
	}

	public static void main(String[] args) {
		int a[] = { 24, 12, 13, 29, 45, 54, 234, 232, 432, 42342, 34234, 234234, 3424, 234, 234 };
		int b[] = { 25, 45, 17, 24, 29, 32, 46 };
		int c[] = intersect(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
