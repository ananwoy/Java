public class AddMatrix {
static int[][] addMat(int a[][], int b[][])
{
	if(a.length!=b.length||a[0].length!=b[0].length)
	{
		System.out.println("Addition is not possible");
		return null;
	}
	int c[][]=new int [a.length][a[0].length];
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++) {
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	return c;
}
public static void main(String[] args) {
	int a[][]= {{1,2,3,5},{4,5,6},{7,8,9}};
	int b[][]= {{9,8,7},{6,5,4},{3,2,1}};
	int c[][]= addMat(a,b);
	System.out.println("Sum of two matrix is: ");
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++) {
			System.out.print(c[i][j]+" ");
		}System.out.println();
	}
}
}
