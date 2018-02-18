public class Array2D {
public static void main(String[] args) {
	int a[][];
a=new int[3][4];
a[1][2]=45;
a[0][3]=20;
System.out.println(a[0][3]);
int ar[][]=new int [5][4];
int [][]mat= {{2,3,4,5},{4,5,3,2,23},{5,54,45,4,54}};
System.out.println("No of rows: "+mat.length);
System.out.println("No. of elements in the first row: "+mat[0].length);
System.out.println("No. of elements in the first row: "+mat[1].length);
System.out.println("No. of elements in the first row: "+mat[2].length);
System.out.println("\nArray matrix: ");
for (int i = 0; i < mat.length; i++) //no of rows 
	{
	for (int j = 0; j < mat[i].length; j++) //no of elements
	{
		System.out.print(mat[i][j]+" ");
	}System.out.println();
}
System.out.println("\nNo of elements in the last row: "+mat[mat.length-1].length);
}
}
