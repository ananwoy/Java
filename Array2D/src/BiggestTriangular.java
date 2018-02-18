public class BiggestTriangular {
static void check(int a[][])
{
	int max1=a[1][0];
	for (int i = 1; i < a.length; i++) {
		for (int j = 0; j < i; j++) {
			if(max1<a[i][j])
				max1=a[i][j];
		}
	}
	System.out.println("greatest element of lower traingular matrix is: "+max1);
	int max2=a[0][a.length-1];
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a[i].length; j++) {
			if(max2<a[i][j])
				max2=a[i][j];
		}
	}
	System.out.println("greatest element of upper traingular matrix is: "+max2);
}
public static void main(String[] args) {
	int a[][]= {{1,5,7,2},{8,2,2,5},{9,6,9,8},{1,2,4,0}};
	check(a);
}
}