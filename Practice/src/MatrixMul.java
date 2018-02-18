public class MatrixMul {
	static void multi(int a[][], int b[][]) {
		if (a[0].length != b.length) {
			System.out.println("Cannot multiply enter valid matrix");
			;
		} else {
			int c[][] = new int[b.length][a[0].length];
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					int sum = 0;
					for (int k = 0; k < c.length; k++) {
						sum = sum + a[i][k] * b[k][j];
					}
					c[i][j] = sum;
				}
			}
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 1 } };
		int b[][] = { { 1, 2, 3 }, { 3, 2, 1 }, { 4, 5, 2 } };
		System.out.println("Multiplication of both matrix is: ");
		multi(a, b);
	}
}
