import java.util.Scanner;

public class InputMatrix {
	public static void main(String[] args) {
		System.out.println("enter number of rows and nmbr of coloumns:");
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int mat[][] = new int[r][c];
		System.out.println(" enter " + (r * c) + " elements");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = s.nextInt();
			}
		}
		System.out.println("\nentered matrix elements");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
